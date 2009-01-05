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
 * File: MorphAnalysisSenAnnotator.java
 * Purpose: Execute Sen and return values from it
 * Responsible: Isao Isaac Saito <130s@lateeye.net>
 * Reviewer: (none)
 * Primary Repository: http://code.google.com/p/ne-ushi/source/browse/
 * Web Sites: http://code.google.com/p/ne-ushi/
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import net.java.sen.StringTagger;
import net.java.sen.Token;

import org.apache.uima.UimaContext;

public class MorphAnalysisSenAnnotator extends MorphologicalAnalysisAnnotator {

	private static String DELIM_SPEECHTYPE = "-";
	/**
	 * Because of SEN's spec, file separator should always be "/" no matter what
	 * the platform is.
	 */
	private static final String FILE_SEPARATOR = "/";
	private static final String KEY_DELIM_SPEECHTYPE = "DELIM_SPEECHTYPE";
	private static final String KEY_PATH_SEN_XML = "PATH_SEN_XML";
	private static final String KEY_RESOURCE = "senProperties";
	/** KEY_SENHOME is fixed as "sen.home" by the spec of SEN */
	private static final String KEY_SENHOME = "sen.home";

	private static String PATH_SEN = null;
	private static String PATH_SEN_XML = null;

	private StringTagger tagger = null;

	public void destroy() {
		this.tagger = null;
		System.gc();

		System.out.println(super.getClass().getName()
				+ "#destroy: tagger's freed & gc is done");
	}

	private MorphToken getMorphToken(Token token) {
		MorphToken morph = new MorphToken();
		String speechType = null;
		String speechSubType = null;
		String speechSubSubType = null;
		StringTokenizer tokenizedType = null;

		// DO: Divide each hierarchy of speeches.
		// SEN returns speeches with 3 levels of hierarchies as one string.
		// So the speeches will be divided here.
		tokenizedType = new StringTokenizer(token.getPos(), DELIM_SPEECHTYPE);
		speechType = tokenizedType.nextToken();
		try {
			speechSubType = tokenizedType.nextToken();
			speechSubSubType = tokenizedType.nextToken();
		} catch (NoSuchElementException e) {
			/*
			 * System.out.println(" No sub type/subsub type found: Text: " +
			 * morph.getLex() + ", speech: " + speechType);
			 */
		}

		System.out.println(super.getClass().getName() + ": "
				+ token.toString() + " " + token.start() + " "
				+ token.end() + ", speech type: " + speechType + " "
				+ speechSubType + " " + speechSubSubType);

		morph.setSpeechType(speechType);
		// do:set speech sub type/sub-sub type if it is not null
		if (null != speechSubType) {
			morph.setSpeechSubType(speechSubType);
		}
		if (null != speechSubSubType) {
			morph.setSpeechSubSubType(speechSubSubType);
		}
		morph.setLex(token.toString());
		morph.setBeginPos(token.start());
		morph.setEndPos(token.end());
		return morph;
	}

	protected LinkedList<MorphToken> execExtractionByExternalModule(String text) {
		LinkedList<MorphToken> tokenList = new LinkedList<MorphToken>();
		Token[] token = null;
		try {
			// DO: Input texts to be proceessed into the instance of SEN
			token = this.tagger.analyze(text);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < token.length; i++) {
			// DO: get a part of speech from a morpheme
			MorphToken morph = this.getMorphToken(token[i]);
			tokenList.add(morph);
		}
		return tokenList;
	}

	/**
	 * @deprecated Test method.
	 */
	private void doSen() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			System.setProperty(KEY_SENHOME,
					"/Users/isaosaito/Library/sen/sen-1.2.2.1/");
			StringTagger tagger = StringTagger.getInstance();
			String confPath = System
					.getProperty(MorphAnalysisSenAnnotator.KEY_SENHOME)
					+ System.getProperty("file.separator") + "conf/sen.xml";
			tagger = StringTagger.getInstance(confPath);
			String s = null;
			System.out.println(super.getClass().getName()
					+ "#doSen: init done.\nPlease input Japanese sentence:");
			while ((s = br.readLine()) != null) {
				Token[] token = tagger.analyze(s);
				if (token != null) {
					for (int i = 0; i < token.length; i++) {
						System.out.println(token[i].toString() + "\t("
								+ token[i].getBasicString() + ")" + "\t"
								+ token[i].getPos() + "(" + token[i].start()
								+ "," + token[i].end() + ","
								+ token[i].length() + ")\t"
								+ token[i].getReading() + "\t"
								+ token[i].getPronunciation());
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void derivedInit(UimaContext context) {
		MorphAnalysisSenAnnotator.DELIM_SPEECHTYPE = (String) this.getContext()
		.getConfigParameterValue(
				MorphAnalysisSenAnnotator.KEY_DELIM_SPEECHTYPE);
		MorphAnalysisSenAnnotator.PATH_SEN = (String) this.getContext()
		.getConfigParameterValue(
				MorphAnalysisSenAnnotator.KEY_SENHOME);
		MorphAnalysisSenAnnotator.PATH_SEN_XML = (String) this
				.getContext().getConfigParameterValue(
						MorphAnalysisSenAnnotator.KEY_PATH_SEN_XML);
		System.setProperty(KEY_SENHOME, PATH_SEN);
		String confPath = System.getProperty(KEY_SENHOME)
		// COMMENT/08dec28/130s: Though the directive "file.separator" enables
				// multi-platform execution, we can't use that because Sen
				// always requires "/".
				+ FILE_SEPARATOR + PATH_SEN_XML;
		// + System.getProperty("file.separator") + PATH_SEN_XML;

		// DO: create an instance of SEN.
		try {
			this.tagger = StringTagger.getInstance(confPath);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		MorphAnalysisSenAnnotator sen = new MorphAnalysisSenAnnotator();
		sen.doSen();
	}
}
