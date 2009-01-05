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
 * File: MorphToken.java
 * Purpose: Contains values received from Mophological Analysis modules
 * Responsible: Isao Isaac Saito <130s@lateeye.net>
 * Reviewer: (none)
 * Primary Repository: http://code.google.com/p/ne-ushi/source/browse/
 * Web Sites: http://code.google.com/p/ne-ushi/
 */

public class MorphToken {
	private int beginPos = -1;
	private int endPos = -1;
	private String conjugation_1 = null;
	private String conjugation_2 = null;
	private String lex = null;

	private String kana = null;
	private String originalForm = null;
	private String pronunciation = null;
	private String speech = null;
	private String speechSubType = null;
	private String speechSubSubType = null;
	private String speechSubSubSubType = null;

	public String getConjugation_1() {
		return conjugation_1;
	}

	public String getConjugation_2() {
		return conjugation_2;
	}

	public String getKana() {
		return kana;
	}

	public String getOriginalForm() {
		return originalForm;
	}

	public String getPronunciation() {
		return pronunciation;
	}

	public int getBeginPos() {
		return beginPos;
	}

	public void setBeginPos(int beginPos) {
		this.beginPos = beginPos;
	}

	public int getEndPos() {
		return endPos;
	}

	public void setEndPos(int endPos) {
		this.endPos = endPos;
	}

	public String getLex() {
		return lex;
	}

	public void setLex(String lex) {
		this.lex = lex;
	}

	public String getSpeechType() {
		return this.speech;
	}

	public void setSpeechType(String speechType) {
		this.speech = speechType;
	}

	public String getSpeechSubType() {
		return speechSubType;
	}

	public void setSpeechSubType(String speechSubType) {
		this.speechSubType = speechSubType;
	}

	public String getSpeechSubSubType() {
		return speechSubSubType;
	}

	public void setSpeechSubSubType(String speechSubSubType) {
		this.speechSubSubType = speechSubSubType;
	}

	public void setSpeechSubSubSubType(String speechSubSubSubType) {
		this.speechSubSubSubType = speechSubSubSubType;
	}

	public String getSpeechSubSubSubType() {
		return speechSubSubSubType;
	}

	public void setConjugation_1(String conjugation_1) {
		this.conjugation_1 = conjugation_1;

	}

	public void setConjugation_2(String conjugation_2) {
		this.conjugation_2 = conjugation_2;

	}

	public void setPronunciation(String pronunciation) {
		this.pronunciation = pronunciation;
	}

	public void setKana(String kana) {
		this.kana = kana;
	}

	public void setOriginalForm(String originalForm) {
		this.originalForm = originalForm;
	}
}
