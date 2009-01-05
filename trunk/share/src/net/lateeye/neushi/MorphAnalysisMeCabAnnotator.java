package net.lateeye.neushi;



/**
 * Copyright 2009 Lateeye Productions or its licensors, as applicable.
 * 
 * You may not use this file except under the terms of the accompanying license.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You may
 * obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Project: NeUshi
 * File: MorphAnalysisMeCabAnnotator.java
 * Purpose: Execute MeCab and return values from it
 * Responsible: Isao Isaac Saito <130s@lateeye.net>
 * Reviewer: (none)
 * Primary Repository: http://code.google.com/p/ne-ushi/source/browse/
 * Web Sites: http://code.google.com/p/ne-ushi/
 */


import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import org.apache.uima.UimaContext;
import org.chasen.mecab.MeCab;
import org.chasen.mecab.Node;
import org.chasen.mecab.Tagger;

public class MorphAnalysisMeCabAnnotator extends MorphologicalAnalysisAnnotator {

	private static final String KEY_DELIM_SPEECHTYPE = "KEY_DELIM_SPEECHTYPE";
	private static String DELIM_SPEECHTYPE = ","; // Default value is set.
	private static final String KEY_LIB_NAME = "LIB_NAME";
	private static String LIB_NAME = "MeCab"; // Default value is set.

	private Tagger tagger;

	public void destroy() {
		this.tagger = null;
		System.gc();

		System.out.println(this.getClass().getName()
				+ "#destroy: tagger's freed & gc is done");
	}

	private MorphToken getMorphToken(Node token) {
		MorphToken morph = new MorphToken();
		String conjugation_1 = null;
		String conjugation_2 = null;
		String originalForm = null;
		String kana = null;
		String pronunciation = null;
		String speechType = null;
		String speechSubType = null;
		String speechSubSubType = null;
		String speechSubSubSubType = null;
		StringTokenizer tokenizedType = null;

		// DO: Divide each hierarchy of speeches.
		// SEN returns speeches with 3 levels of hierarchies as one string.
		// So the speeches will be divided here.
		tokenizedType = new StringTokenizer(token.getFeature(),
				DELIM_SPEECHTYPE);
		speechType = tokenizedType.nextToken();

		try {
			speechSubType = tokenizedType.nextToken();
			speechSubSubType = tokenizedType.nextToken();
			speechSubSubSubType = tokenizedType.nextToken();

			conjugation_1 = tokenizedType.nextToken();
			conjugation_2 = tokenizedType.nextToken();
			originalForm = tokenizedType.nextToken();
			kana = tokenizedType.nextToken();
			pronunciation = tokenizedType.nextToken();
		} catch (NoSuchElementException e) {
			System.err.println(super.getClass().getName()
					+ ": element extraction skipped: " + token.getSurface()
					+ " " + speechType);
		}
		/*
		 * System.out.println(super.getClass().getName() + ": " +
		 * token.toString() + " " + token.start() + " " + token.end() +
		 * ", speech type: " + speechType + " " + speechSubType + " " +
		 * speechSubSubType);
		 */
		morph.setSpeechType(speechType);
		morph.setSpeechSubType(speechSubType);
		morph.setSpeechSubSubType(speechSubSubType);
		morph.setSpeechSubSubSubType(speechSubSubSubType);
		morph.setConjugation_1(conjugation_1);
		morph.setConjugation_2(conjugation_2);
		morph.setLex(token.getSurface());
		morph.setPronunciation(pronunciation);
		morph.setKana(kana);
		morph.setOriginalForm(originalForm);

		return morph;
	}

	protected LinkedList<MorphToken> execExtractionByExternalModule2(String text) {
		LinkedList<MorphToken> tokenList = new LinkedList<MorphToken>();
		int nodeBeginPos = 0;
		Node node;
		for (node = tagger.parseToNode(text); node != null; node = node
				.getNext()) {

			System.out.println(this.getClass().getName() + ":Res from MeCab: "
					+ node.getSurface() + "\t" + node.getFeature());

			// DO: get a part of speech from a morpheme
			MorphToken morph = this.getMorphToken(node);

			// DO: identify the position of token
			morph.setBeginPos(nodeBeginPos);
			nodeBeginPos = nodeBeginPos + morph.getLex().length();

			morph.setEndPos(nodeBeginPos);

			tokenList.add(morph);
		}
		return tokenList;
	}

	protected LinkedList<MorphToken> execExtractionByExternalModule(String text) {
		LinkedList<MorphToken> tokenList = new LinkedList<MorphToken>();
		int nodeBeginPos = 0;
		Node node;
		for (node = tagger.parseToNode(text); node != null; node = node
				.getNext()) {

			System.out.println(this.getClass().getName() + ":Res from MeCab: "
					+ node.getSurface() + "\t" + node.getFeature());

			// DO: get a part of speech from a morpheme
			MorphToken morph = this.getMorphToken(node);

			// DO: identify the position of token
			nodeBeginPos = text.indexOf(morph.getLex(), nodeBeginPos);
			morph.setBeginPos(nodeBeginPos);

			nodeBeginPos = nodeBeginPos + morph.getLex().length();

			morph.setEndPos(nodeBeginPos);

			tokenList.add(morph);
		}
		return tokenList;
	}

	@Override
	protected void derivedInit(UimaContext context) {
		String lib = (String) this.getContext().getConfigParameterValue(
				MorphAnalysisMeCabAnnotator.KEY_LIB_NAME);
		if (lib != null) {
			MorphAnalysisMeCabAnnotator.LIB_NAME = lib;
		}

		try {
			System.loadLibrary(MorphAnalysisMeCabAnnotator.LIB_NAME);
		} catch (UnsatisfiedLinkError e) {
			System.err
					.println("Cannot load the native code."
							+ "\nMake sure your DYLD_LIBRARY_PATH contains valid path of MeCab Java Binding.\n"
							+ "Program exits." + e);
			System.exit(1);
		}

		String delim = (String) this.getContext().getConfigParameterValue(
				MorphAnalysisMeCabAnnotator.KEY_DELIM_SPEECHTYPE);
		if (delim != null) {
			MorphAnalysisMeCabAnnotator.DELIM_SPEECHTYPE = delim;
		}

		System.out.println(" MeCab version: " + MeCab.VERSION);
		this.tagger = new Tagger();
	}
}
