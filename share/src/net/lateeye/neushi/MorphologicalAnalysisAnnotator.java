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
 * File: MorphologicalAnalysisAnnotator.java
 * Purpose: Define common procedure to execute Morphological Analysis modules
 * Responsible: Isao Isaac Saito <130s@lateeye.net>
 * Reviewer: (none)
 * Primary Repository: http://code.google.com/p/ne-ushi/source/browse/
 * Web Sites: http://code.google.com/p/ne-ushi/
 */

import java.util.LinkedList;
import java.util.NoSuchElementException;

import net.lateeye.uima.types.speech.Adjective;
import net.lateeye.uima.types.speech.Adverb;
import net.lateeye.uima.types.speech.AuxiliaryVerb;
import net.lateeye.uima.types.speech.Conjugation;
import net.lateeye.uima.types.speech.Filler;
import net.lateeye.uima.types.speech.Interjection;
import net.lateeye.uima.types.speech.Morpheme;
import net.lateeye.uima.types.speech.Noun;
import net.lateeye.uima.types.speech.Particle;
import net.lateeye.uima.types.speech.Prefix;
import net.lateeye.uima.types.speech.Symbol;
import net.lateeye.uima.types.speech.TrueAdjective;
import net.lateeye.uima.types.speech.UnknownWord;
import net.lateeye.uima.types.speech.Verb;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;

public abstract class MorphologicalAnalysisAnnotator extends
		JCasAnnotator_ImplBase {

	protected static final String KEY_GROUP_SPEECHTYPE = "SpeechType";
	protected static String KEY_SPEECHTYPE_ADJECTIVE = "SPEECHTYPE_ADJECTIVE";
	protected static String KEY_SPEECHTYPE_ADVERB = "SPEECHTYPE_ADVERB";
	protected static String KEY_SPEECHTYPE_AUXILIARY_VERB = "SPEECHTYPE_AUXILIARY_VERB";
	protected static String KEY_SPEECHTYPE_CONJUGATION = "SPEECHTYPE_CONJUGATION";
	protected static String KEY_SPEECHTYPE_FILLER = "SPEECHTYPE_FILLER";
	protected static String KEY_SPEECHTYPE_INTERJECTION = "SPEECHTYPE_INTERJECTION";
	protected static String KEY_SPEECHTYPE_NOUN = "SPEECHTYPE_NOUN";
	protected static String KEY_SPEECHTYPE_PARTICLE = "SPEECHTYPE_PARTICLE";
	protected static String KEY_SPEECHTYPE_PREFIX = "SPEECHTYPE_PREFIX";
	protected static String KEY_SPEECHTYPE_SYMBOL = "SPEECHTYPE_SYMBOL";
	protected static String KEY_SPEECHTYPE_TRUE_ADJECTIVE = "SPEECHTYPE_TRUE_ADJECTIVE";
	protected static String KEY_SPEECHTYPE_UNKNOWNWORD = "SPEECHTYPE_UNKNOWNWORD";
	protected static String KEY_SPEECHTYPE_VERB = "SPEECHTYPE_VERB";

	protected static String VAL_SPEECHTYPE_ADJECTIVE;
	protected static String VAL_SPEECHTYPE_ADVERB;
	protected static String VAL_SPEECHTYPE_AUXILIARY_VERB;
	protected static String VAL_SPEECHTYPE_CONJUGATION;
	protected static String VAL_SPEECHTYPE_FILLER;
	protected static String VAL_SPEECHTYPE_INTERJECTION;
	protected static String VAL_SPEECHTYPE_NOUN;
	protected static String VAL_SPEECHTYPE_PARTICLE;
	protected static String VAL_SPEECHTYPE_PREFIX;
	protected static String VAL_SPEECHTYPE_SYMBOL;
	protected static String VAL_SPEECHTYPE_TRUE_ADJECTIVE;
	protected static String VAL_SPEECHTYPE_UNKNOWNWORD;
	protected static String VAL_SPEECHTYPE_VERB;

	protected abstract void derivedInit(UimaContext aContext);

	/**
	 * 
	 * @param text
	 *            to be processed by external module.
	 * @return list of morphemes and its accompanied data.
	 */
	protected abstract LinkedList<MorphToken> execExtractionByExternalModule(
			String text);

	public void initialize(UimaContext aContext)
			throws ResourceInitializationException {

		super.initialize(aContext);
		System.out.println(super.getClass().getName() + "#initialize: begins.");

		this.derivedInit(aContext);

		// DO: get speech names that the external module specifies
		MorphologicalAnalysisAnnotator.VAL_SPEECHTYPE_ADJECTIVE = (String) this
				.getContext()
				.getConfigParameterValue(
						MorphologicalAnalysisAnnotator.KEY_GROUP_SPEECHTYPE,
						MorphologicalAnalysisAnnotator.KEY_SPEECHTYPE_ADJECTIVE);
		MorphologicalAnalysisAnnotator.VAL_SPEECHTYPE_ADVERB = (String) this
				.getContext().getConfigParameterValue(
						MorphologicalAnalysisAnnotator.KEY_GROUP_SPEECHTYPE,
						MorphologicalAnalysisAnnotator.KEY_SPEECHTYPE_ADVERB);
		MorphologicalAnalysisAnnotator.VAL_SPEECHTYPE_AUXILIARY_VERB = (String) this
				.getContext()
				.getConfigParameterValue(
						MorphologicalAnalysisAnnotator.KEY_GROUP_SPEECHTYPE,
						MorphologicalAnalysisAnnotator.KEY_SPEECHTYPE_AUXILIARY_VERB);
		MorphologicalAnalysisAnnotator.VAL_SPEECHTYPE_CONJUGATION = (String) this
				.getContext()
				.getConfigParameterValue(
						MorphologicalAnalysisAnnotator.KEY_GROUP_SPEECHTYPE,
						MorphologicalAnalysisAnnotator.KEY_SPEECHTYPE_CONJUGATION);
		MorphologicalAnalysisAnnotator.VAL_SPEECHTYPE_FILLER = (String) this
		.getContext().getConfigParameterValue(
				MorphologicalAnalysisAnnotator.KEY_GROUP_SPEECHTYPE,
				MorphologicalAnalysisAnnotator.KEY_SPEECHTYPE_FILLER);
		MorphologicalAnalysisAnnotator.VAL_SPEECHTYPE_INTERJECTION = (String) this
		.getContext().getConfigParameterValue(
				MorphologicalAnalysisAnnotator.KEY_GROUP_SPEECHTYPE,
				MorphologicalAnalysisAnnotator.KEY_SPEECHTYPE_INTERJECTION);
		MorphologicalAnalysisAnnotator.VAL_SPEECHTYPE_NOUN = (String) this
				.getContext().getConfigParameterValue(
						MorphologicalAnalysisAnnotator.KEY_GROUP_SPEECHTYPE,
						MorphologicalAnalysisAnnotator.KEY_SPEECHTYPE_NOUN);
		MorphologicalAnalysisAnnotator.VAL_SPEECHTYPE_PARTICLE = (String) this
				.getContext().getConfigParameterValue(
						MorphologicalAnalysisAnnotator.KEY_GROUP_SPEECHTYPE,
						MorphologicalAnalysisAnnotator.KEY_SPEECHTYPE_PARTICLE);
		MorphologicalAnalysisAnnotator.VAL_SPEECHTYPE_PREFIX = (String) this
				.getContext().getConfigParameterValue(
						MorphologicalAnalysisAnnotator.KEY_GROUP_SPEECHTYPE,
						MorphologicalAnalysisAnnotator.KEY_SPEECHTYPE_PREFIX);
		MorphologicalAnalysisAnnotator.VAL_SPEECHTYPE_SYMBOL = (String) this
				.getContext().getConfigParameterValue(
						MorphologicalAnalysisAnnotator.KEY_GROUP_SPEECHTYPE,
						MorphologicalAnalysisAnnotator.KEY_SPEECHTYPE_SYMBOL);
		MorphologicalAnalysisAnnotator.VAL_SPEECHTYPE_TRUE_ADJECTIVE = (String) this
				.getContext()
				.getConfigParameterValue(
						MorphologicalAnalysisAnnotator.KEY_GROUP_SPEECHTYPE,
						MorphologicalAnalysisAnnotator.KEY_SPEECHTYPE_TRUE_ADJECTIVE);
		MorphologicalAnalysisAnnotator.VAL_SPEECHTYPE_UNKNOWNWORD = (String) this
				.getContext()
				.getConfigParameterValue(
						MorphologicalAnalysisAnnotator.KEY_GROUP_SPEECHTYPE,
						MorphologicalAnalysisAnnotator.KEY_SPEECHTYPE_UNKNOWNWORD);
		MorphologicalAnalysisAnnotator.VAL_SPEECHTYPE_VERB = (String) this
				.getContext().getConfigParameterValue(
						MorphologicalAnalysisAnnotator.KEY_GROUP_SPEECHTYPE,
						MorphologicalAnalysisAnnotator.KEY_SPEECHTYPE_VERB);
	}

	public void process(JCas cas) throws AnalysisEngineProcessException {
		long beginTime = System.currentTimeMillis();
		System.out.println(super.getClass().getName() + "#initialize: begins.");

		LinkedList<MorphToken> morphs = null;

		String text = cas.getDocumentText();
		morphs = this.execExtractionByExternalModule(text);

		// DO: UIMA Annotate as each morpheme SEN returned
		for (int i = 0; i < morphs.size(); i++) {
			Morpheme annot = null;
			String speechType = null;
			String speechSubType = null;
			String speechSubSubType = null;
			String speechSubSubSubType = null;

			MorphToken morph = morphs.get(i);

			// DO: get the speech of each hierarchy.
			speechType = morph.getSpeechType();

			// DO: Create the instance that corresponds to each type of speech.
			if (MorphologicalAnalysisAnnotator.VAL_SPEECHTYPE_NOUN
					.equals(speechType)) {
				annot = new Noun(cas);
			} else if (MorphologicalAnalysisAnnotator.VAL_SPEECHTYPE_VERB
					.equals(speechType)) {
				annot = new Verb(cas);
			} else if (MorphologicalAnalysisAnnotator.VAL_SPEECHTYPE_SYMBOL
					.equals(speechType)) {
				annot = new Symbol(cas);
			} else if (MorphologicalAnalysisAnnotator.VAL_SPEECHTYPE_UNKNOWNWORD
					.equals(speechType)) {
				annot = new UnknownWord(cas);
			} else if (MorphologicalAnalysisAnnotator.VAL_SPEECHTYPE_ADJECTIVE
					.equals(speechType)) {
				annot = new Adjective(cas);
			} else if (MorphologicalAnalysisAnnotator.VAL_SPEECHTYPE_ADVERB
					.equals(speechType)) {
				annot = new Adverb(cas);
			} else if (MorphologicalAnalysisAnnotator.VAL_SPEECHTYPE_AUXILIARY_VERB
					.equals(speechType)) {
				annot = new AuxiliaryVerb(cas);
			} else if (MorphologicalAnalysisAnnotator.VAL_SPEECHTYPE_CONJUGATION
					.equals(speechType)) {
				annot = new Conjugation(cas);
			} else if (MorphologicalAnalysisAnnotator.VAL_SPEECHTYPE_FILLER
					.equals(speechType)) {
				annot = new Filler(cas);
			} else if (MorphologicalAnalysisAnnotator.VAL_SPEECHTYPE_INTERJECTION
					.equals(speechType)) {
				annot = new Interjection(cas);
			} else if (MorphologicalAnalysisAnnotator.VAL_SPEECHTYPE_PARTICLE
					.equals(speechType)) {
				annot = new Particle(cas);
			} else if (MorphologicalAnalysisAnnotator.VAL_SPEECHTYPE_PREFIX
					.equals(speechType)) {
				annot = new Prefix(cas);
			} else if (MorphologicalAnalysisAnnotator.VAL_SPEECHTYPE_TRUE_ADJECTIVE
					.equals(speechType)) {
				annot = new TrueAdjective(cas);
			} else {
				continue;
			}

			// DO: Get sub or subsub type.
			// Surrounded by try-catch since they can be lacking.
			try {
				speechSubType = morph.getSpeechSubType();
				speechSubSubType = morph.getSpeechSubSubType();
				speechSubSubSubType = morph.getSpeechSubSubSubType();
			} catch (NoSuchElementException e) {
				System.out
						.println(" No sub/subsub/subsubsub type found: Text: "
								+ morph.getLex() + ", speech: " + speechType);
			}

			annot.setSpeechType(speechType);
			// DO:set speech subtype if it is not null
			if (null != speechSubType) {
				annot.setSpeechSubType(speechSubType);
			}
			if (null != speechSubSubType) {
				annot.setSpeechSubSubType(speechSubSubType);
			}
			if (null != speechSubSubSubType) {
				annot.setSpeechSubSubSubType(speechSubSubSubType);
			}

			annot.setLex(morph.getLex());
			annot.setBegin(morph.getBeginPos());
			annot.setEnd(morph.getEndPos());
			annot.setConjugation_1(morph.getConjugation_1());
			annot.setConjugation_2(morph.getConjugation_2());
			annot.setKana(morph.getKana());
			annot.setOriginalForm(morph.getOriginalForm());
			annot.setPronunciation(morph.getPronunciation());

			annot.addToIndexes();
		}

		long elapsetTime = System.currentTimeMillis() - beginTime;
		System.out.println(super.getClass().getName()
				+ "#process: method ends. elapsed time for process= "
				+ elapsetTime + " millisec");
	}
}
