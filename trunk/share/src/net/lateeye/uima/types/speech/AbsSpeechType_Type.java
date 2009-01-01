
/* First created by JCasGen Tue Dec 30 15:30:00 CST 2008 */
package net.lateeye.uima.types.speech;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import net.lateeye.uima.types.NamedEntity_Type;

/** Sen ????????????, ??????????????????. ???? 3?????(??, ????, ??????)?????????????.
 * Updated by JCasGen Wed Dec 31 02:27:37 CST 2008
 * @generated */
public class AbsSpeechType_Type extends NamedEntity_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (AbsSpeechType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = AbsSpeechType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new AbsSpeechType(addr, AbsSpeechType_Type.this);
  			   AbsSpeechType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new AbsSpeechType(addr, AbsSpeechType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = AbsSpeechType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.lateeye.uima.types.speech.AbsSpeechType");
 
  /** @generated */
  final Feature casFeat_speechType;
  /** @generated */
  final int     casFeatCode_speechType;
  /** @generated */ 
  public String getSpeechType(int addr) {
        if (featOkTst && casFeat_speechType == null)
      jcas.throwFeatMissing("speechType", "net.lateeye.uima.types.speech.AbsSpeechType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_speechType);
  }
  /** @generated */    
  public void setSpeechType(int addr, String v) {
        if (featOkTst && casFeat_speechType == null)
      jcas.throwFeatMissing("speechType", "net.lateeye.uima.types.speech.AbsSpeechType");
    ll_cas.ll_setStringValue(addr, casFeatCode_speechType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_speechSubType;
  /** @generated */
  final int     casFeatCode_speechSubType;
  /** @generated */ 
  public String getSpeechSubType(int addr) {
        if (featOkTst && casFeat_speechSubType == null)
      jcas.throwFeatMissing("speechSubType", "net.lateeye.uima.types.speech.AbsSpeechType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_speechSubType);
  }
  /** @generated */    
  public void setSpeechSubType(int addr, String v) {
        if (featOkTst && casFeat_speechSubType == null)
      jcas.throwFeatMissing("speechSubType", "net.lateeye.uima.types.speech.AbsSpeechType");
    ll_cas.ll_setStringValue(addr, casFeatCode_speechSubType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_speechSubSubType;
  /** @generated */
  final int     casFeatCode_speechSubSubType;
  /** @generated */ 
  public String getSpeechSubSubType(int addr) {
        if (featOkTst && casFeat_speechSubSubType == null)
      jcas.throwFeatMissing("speechSubSubType", "net.lateeye.uima.types.speech.AbsSpeechType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_speechSubSubType);
  }
  /** @generated */    
  public void setSpeechSubSubType(int addr, String v) {
        if (featOkTst && casFeat_speechSubSubType == null)
      jcas.throwFeatMissing("speechSubSubType", "net.lateeye.uima.types.speech.AbsSpeechType");
    ll_cas.ll_setStringValue(addr, casFeatCode_speechSubSubType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_originalForm;
  /** @generated */
  final int     casFeatCode_originalForm;
  /** @generated */ 
  public String getOriginalForm(int addr) {
        if (featOkTst && casFeat_originalForm == null)
      jcas.throwFeatMissing("originalForm", "net.lateeye.uima.types.speech.AbsSpeechType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_originalForm);
  }
  /** @generated */    
  public void setOriginalForm(int addr, String v) {
        if (featOkTst && casFeat_originalForm == null)
      jcas.throwFeatMissing("originalForm", "net.lateeye.uima.types.speech.AbsSpeechType");
    ll_cas.ll_setStringValue(addr, casFeatCode_originalForm, v);}
    
  
 
  /** @generated */
  final Feature casFeat_kana;
  /** @generated */
  final int     casFeatCode_kana;
  /** @generated */ 
  public String getKana(int addr) {
        if (featOkTst && casFeat_kana == null)
      jcas.throwFeatMissing("kana", "net.lateeye.uima.types.speech.AbsSpeechType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_kana);
  }
  /** @generated */    
  public void setKana(int addr, String v) {
        if (featOkTst && casFeat_kana == null)
      jcas.throwFeatMissing("kana", "net.lateeye.uima.types.speech.AbsSpeechType");
    ll_cas.ll_setStringValue(addr, casFeatCode_kana, v);}
    
  
 
  /** @generated */
  final Feature casFeat_speechSubSubSubType;
  /** @generated */
  final int     casFeatCode_speechSubSubSubType;
  /** @generated */ 
  public String getSpeechSubSubSubType(int addr) {
        if (featOkTst && casFeat_speechSubSubSubType == null)
      jcas.throwFeatMissing("speechSubSubSubType", "net.lateeye.uima.types.speech.AbsSpeechType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_speechSubSubSubType);
  }
  /** @generated */    
  public void setSpeechSubSubSubType(int addr, String v) {
        if (featOkTst && casFeat_speechSubSubSubType == null)
      jcas.throwFeatMissing("speechSubSubSubType", "net.lateeye.uima.types.speech.AbsSpeechType");
    ll_cas.ll_setStringValue(addr, casFeatCode_speechSubSubSubType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_conjugation_1;
  /** @generated */
  final int     casFeatCode_conjugation_1;
  /** @generated */ 
  public String getConjugation_1(int addr) {
        if (featOkTst && casFeat_conjugation_1 == null)
      jcas.throwFeatMissing("conjugation_1", "net.lateeye.uima.types.speech.AbsSpeechType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_conjugation_1);
  }
  /** @generated */    
  public void setConjugation_1(int addr, String v) {
        if (featOkTst && casFeat_conjugation_1 == null)
      jcas.throwFeatMissing("conjugation_1", "net.lateeye.uima.types.speech.AbsSpeechType");
    ll_cas.ll_setStringValue(addr, casFeatCode_conjugation_1, v);}
    
  
 
  /** @generated */
  final Feature casFeat_conjugation_2;
  /** @generated */
  final int     casFeatCode_conjugation_2;
  /** @generated */ 
  public String getConjugation_2(int addr) {
        if (featOkTst && casFeat_conjugation_2 == null)
      jcas.throwFeatMissing("conjugation_2", "net.lateeye.uima.types.speech.AbsSpeechType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_conjugation_2);
  }
  /** @generated */    
  public void setConjugation_2(int addr, String v) {
        if (featOkTst && casFeat_conjugation_2 == null)
      jcas.throwFeatMissing("conjugation_2", "net.lateeye.uima.types.speech.AbsSpeechType");
    ll_cas.ll_setStringValue(addr, casFeatCode_conjugation_2, v);}
    
  
 
  /** @generated */
  final Feature casFeat_pronunciation;
  /** @generated */
  final int     casFeatCode_pronunciation;
  /** @generated */ 
  public String getPronunciation(int addr) {
        if (featOkTst && casFeat_pronunciation == null)
      jcas.throwFeatMissing("pronunciation", "net.lateeye.uima.types.speech.AbsSpeechType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_pronunciation);
  }
  /** @generated */    
  public void setPronunciation(int addr, String v) {
        if (featOkTst && casFeat_pronunciation == null)
      jcas.throwFeatMissing("pronunciation", "net.lateeye.uima.types.speech.AbsSpeechType");
    ll_cas.ll_setStringValue(addr, casFeatCode_pronunciation, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public AbsSpeechType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_speechType = jcas.getRequiredFeatureDE(casType, "speechType", "uima.cas.String", featOkTst);
    casFeatCode_speechType  = (null == casFeat_speechType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_speechType).getCode();

 
    casFeat_speechSubType = jcas.getRequiredFeatureDE(casType, "speechSubType", "uima.cas.String", featOkTst);
    casFeatCode_speechSubType  = (null == casFeat_speechSubType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_speechSubType).getCode();

 
    casFeat_speechSubSubType = jcas.getRequiredFeatureDE(casType, "speechSubSubType", "uima.cas.String", featOkTst);
    casFeatCode_speechSubSubType  = (null == casFeat_speechSubSubType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_speechSubSubType).getCode();

 
    casFeat_originalForm = jcas.getRequiredFeatureDE(casType, "originalForm", "uima.cas.String", featOkTst);
    casFeatCode_originalForm  = (null == casFeat_originalForm) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_originalForm).getCode();

 
    casFeat_kana = jcas.getRequiredFeatureDE(casType, "kana", "uima.cas.String", featOkTst);
    casFeatCode_kana  = (null == casFeat_kana) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_kana).getCode();

 
    casFeat_speechSubSubSubType = jcas.getRequiredFeatureDE(casType, "speechSubSubSubType", "uima.cas.String", featOkTst);
    casFeatCode_speechSubSubSubType  = (null == casFeat_speechSubSubSubType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_speechSubSubSubType).getCode();

 
    casFeat_conjugation_1 = jcas.getRequiredFeatureDE(casType, "conjugation_1", "uima.cas.String", featOkTst);
    casFeatCode_conjugation_1  = (null == casFeat_conjugation_1) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_conjugation_1).getCode();

 
    casFeat_conjugation_2 = jcas.getRequiredFeatureDE(casType, "conjugation_2", "uima.cas.String", featOkTst);
    casFeatCode_conjugation_2  = (null == casFeat_conjugation_2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_conjugation_2).getCode();

 
    casFeat_pronunciation = jcas.getRequiredFeatureDE(casType, "pronunciation", "uima.cas.String", featOkTst);
    casFeatCode_pronunciation  = (null == casFeat_pronunciation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_pronunciation).getCode();

  }
}



    