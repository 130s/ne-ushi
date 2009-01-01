

/* First created by JCasGen Tue Dec 30 15:30:00 CST 2008 */
package net.lateeye.uima.types.speech;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import net.lateeye.uima.types.NamedEntity;


/** Sen ????????????, ??????????????????. ???? 3?????(??, ????, ??????)?????????????.
 * Updated by JCasGen Wed Dec 31 02:27:37 CST 2008
 * XML source: /Users/isaosaito/Documents/workspace_eclipse/AE_morphological_Dev/desc/MeCab-SenTypeSystemDescriptor.xml
 * @generated */
public class AbsSpeechType extends NamedEntity {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(AbsSpeechType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected AbsSpeechType() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AbsSpeechType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AbsSpeechType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public AbsSpeechType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
 
    
  //*--------------*
  //* Feature: speechType

  /** getter for speechType - gets Sen ??????????????????.
   * @generated */
  public String getSpeechType() {
    if (AbsSpeechType_Type.featOkTst && ((AbsSpeechType_Type)jcasType).casFeat_speechType == null)
      jcasType.jcas.throwFeatMissing("speechType", "net.lateeye.uima.types.speech.AbsSpeechType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AbsSpeechType_Type)jcasType).casFeatCode_speechType);}
    
  /** setter for speechType - sets Sen ??????????????????. 
   * @generated */
  public void setSpeechType(String v) {
    if (AbsSpeechType_Type.featOkTst && ((AbsSpeechType_Type)jcasType).casFeat_speechType == null)
      jcasType.jcas.throwFeatMissing("speechType", "net.lateeye.uima.types.speech.AbsSpeechType");
    jcasType.ll_cas.ll_setStringValue(addr, ((AbsSpeechType_Type)jcasType).casFeatCode_speechType, v);}    
   
    
  //*--------------*
  //* Feature: speechSubType

  /** getter for speechSubType - gets Sen ?????????? 2???????(????).
   * @generated */
  public String getSpeechSubType() {
    if (AbsSpeechType_Type.featOkTst && ((AbsSpeechType_Type)jcasType).casFeat_speechSubType == null)
      jcasType.jcas.throwFeatMissing("speechSubType", "net.lateeye.uima.types.speech.AbsSpeechType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AbsSpeechType_Type)jcasType).casFeatCode_speechSubType);}
    
  /** setter for speechSubType - sets Sen ?????????? 2???????(????). 
   * @generated */
  public void setSpeechSubType(String v) {
    if (AbsSpeechType_Type.featOkTst && ((AbsSpeechType_Type)jcasType).casFeat_speechSubType == null)
      jcasType.jcas.throwFeatMissing("speechSubType", "net.lateeye.uima.types.speech.AbsSpeechType");
    jcasType.ll_cas.ll_setStringValue(addr, ((AbsSpeechType_Type)jcasType).casFeatCode_speechSubType, v);}    
   
    
  //*--------------*
  //* Feature: speechSubSubType

  /** getter for speechSubSubType - gets Sen ?????????? 3???????(??????).
   * @generated */
  public String getSpeechSubSubType() {
    if (AbsSpeechType_Type.featOkTst && ((AbsSpeechType_Type)jcasType).casFeat_speechSubSubType == null)
      jcasType.jcas.throwFeatMissing("speechSubSubType", "net.lateeye.uima.types.speech.AbsSpeechType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AbsSpeechType_Type)jcasType).casFeatCode_speechSubSubType);}
    
  /** setter for speechSubSubType - sets Sen ?????????? 3???????(??????). 
   * @generated */
  public void setSpeechSubSubType(String v) {
    if (AbsSpeechType_Type.featOkTst && ((AbsSpeechType_Type)jcasType).casFeat_speechSubSubType == null)
      jcasType.jcas.throwFeatMissing("speechSubSubType", "net.lateeye.uima.types.speech.AbsSpeechType");
    jcasType.ll_cas.ll_setStringValue(addr, ((AbsSpeechType_Type)jcasType).casFeatCode_speechSubSubType, v);}    
   
    
  //*--------------*
  //* Feature: originalForm

  /** getter for originalForm - gets ????
   * @generated */
  public String getOriginalForm() {
    if (AbsSpeechType_Type.featOkTst && ((AbsSpeechType_Type)jcasType).casFeat_originalForm == null)
      jcasType.jcas.throwFeatMissing("originalForm", "net.lateeye.uima.types.speech.AbsSpeechType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AbsSpeechType_Type)jcasType).casFeatCode_originalForm);}
    
  /** setter for originalForm - sets ???? 
   * @generated */
  public void setOriginalForm(String v) {
    if (AbsSpeechType_Type.featOkTst && ((AbsSpeechType_Type)jcasType).casFeat_originalForm == null)
      jcasType.jcas.throwFeatMissing("originalForm", "net.lateeye.uima.types.speech.AbsSpeechType");
    jcasType.ll_cas.ll_setStringValue(addr, ((AbsSpeechType_Type)jcasType).casFeatCode_originalForm, v);}    
   
    
  //*--------------*
  //* Feature: kana

  /** getter for kana - gets 
   * @generated */
  public String getKana() {
    if (AbsSpeechType_Type.featOkTst && ((AbsSpeechType_Type)jcasType).casFeat_kana == null)
      jcasType.jcas.throwFeatMissing("kana", "net.lateeye.uima.types.speech.AbsSpeechType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AbsSpeechType_Type)jcasType).casFeatCode_kana);}
    
  /** setter for kana - sets  
   * @generated */
  public void setKana(String v) {
    if (AbsSpeechType_Type.featOkTst && ((AbsSpeechType_Type)jcasType).casFeat_kana == null)
      jcasType.jcas.throwFeatMissing("kana", "net.lateeye.uima.types.speech.AbsSpeechType");
    jcasType.ll_cas.ll_setStringValue(addr, ((AbsSpeechType_Type)jcasType).casFeatCode_kana, v);}    
   
    
  //*--------------*
  //* Feature: speechSubSubSubType

  /** getter for speechSubSubSubType - gets 
   * @generated */
  public String getSpeechSubSubSubType() {
    if (AbsSpeechType_Type.featOkTst && ((AbsSpeechType_Type)jcasType).casFeat_speechSubSubSubType == null)
      jcasType.jcas.throwFeatMissing("speechSubSubSubType", "net.lateeye.uima.types.speech.AbsSpeechType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AbsSpeechType_Type)jcasType).casFeatCode_speechSubSubSubType);}
    
  /** setter for speechSubSubSubType - sets  
   * @generated */
  public void setSpeechSubSubSubType(String v) {
    if (AbsSpeechType_Type.featOkTst && ((AbsSpeechType_Type)jcasType).casFeat_speechSubSubSubType == null)
      jcasType.jcas.throwFeatMissing("speechSubSubSubType", "net.lateeye.uima.types.speech.AbsSpeechType");
    jcasType.ll_cas.ll_setStringValue(addr, ((AbsSpeechType_Type)jcasType).casFeatCode_speechSubSubSubType, v);}    
   
    
  //*--------------*
  //* Feature: conjugation_1

  /** getter for conjugation_1 - gets 
   * @generated */
  public String getConjugation_1() {
    if (AbsSpeechType_Type.featOkTst && ((AbsSpeechType_Type)jcasType).casFeat_conjugation_1 == null)
      jcasType.jcas.throwFeatMissing("conjugation_1", "net.lateeye.uima.types.speech.AbsSpeechType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AbsSpeechType_Type)jcasType).casFeatCode_conjugation_1);}
    
  /** setter for conjugation_1 - sets  
   * @generated */
  public void setConjugation_1(String v) {
    if (AbsSpeechType_Type.featOkTst && ((AbsSpeechType_Type)jcasType).casFeat_conjugation_1 == null)
      jcasType.jcas.throwFeatMissing("conjugation_1", "net.lateeye.uima.types.speech.AbsSpeechType");
    jcasType.ll_cas.ll_setStringValue(addr, ((AbsSpeechType_Type)jcasType).casFeatCode_conjugation_1, v);}    
   
    
  //*--------------*
  //* Feature: conjugation_2

  /** getter for conjugation_2 - gets 
   * @generated */
  public String getConjugation_2() {
    if (AbsSpeechType_Type.featOkTst && ((AbsSpeechType_Type)jcasType).casFeat_conjugation_2 == null)
      jcasType.jcas.throwFeatMissing("conjugation_2", "net.lateeye.uima.types.speech.AbsSpeechType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AbsSpeechType_Type)jcasType).casFeatCode_conjugation_2);}
    
  /** setter for conjugation_2 - sets  
   * @generated */
  public void setConjugation_2(String v) {
    if (AbsSpeechType_Type.featOkTst && ((AbsSpeechType_Type)jcasType).casFeat_conjugation_2 == null)
      jcasType.jcas.throwFeatMissing("conjugation_2", "net.lateeye.uima.types.speech.AbsSpeechType");
    jcasType.ll_cas.ll_setStringValue(addr, ((AbsSpeechType_Type)jcasType).casFeatCode_conjugation_2, v);}    
   
    
  //*--------------*
  //* Feature: pronunciation

  /** getter for pronunciation - gets ????.
   * @generated */
  public String getPronunciation() {
    if (AbsSpeechType_Type.featOkTst && ((AbsSpeechType_Type)jcasType).casFeat_pronunciation == null)
      jcasType.jcas.throwFeatMissing("pronunciation", "net.lateeye.uima.types.speech.AbsSpeechType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AbsSpeechType_Type)jcasType).casFeatCode_pronunciation);}
    
  /** setter for pronunciation - sets ????. 
   * @generated */
  public void setPronunciation(String v) {
    if (AbsSpeechType_Type.featOkTst && ((AbsSpeechType_Type)jcasType).casFeat_pronunciation == null)
      jcasType.jcas.throwFeatMissing("pronunciation", "net.lateeye.uima.types.speech.AbsSpeechType");
    jcasType.ll_cas.ll_setStringValue(addr, ((AbsSpeechType_Type)jcasType).casFeatCode_pronunciation, v);}    
  }

    