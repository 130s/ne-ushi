

/* First created by JCasGen Sat Dec 27 17:35:26 CST 2008 */
package net.lateeye.uima.types.speech;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Thu Jan 15 14:02:53 CST 2009
 * XML source: /Users/isaosaito/Documents/workspace_eclipse/AE_morphological_Dev/desc/MeCab-SenTypeSystemDescriptor.xml
 * @generated */
public class Noun extends Morpheme {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(Noun.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Noun() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Noun(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Noun(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Noun(JCas jcas, int begin, int end) {
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
  //* Feature: organization

  /** getter for organization - gets 
   * @generated */
  public String getOrganization() {
    if (Noun_Type.featOkTst && ((Noun_Type)jcasType).casFeat_organization == null)
      jcasType.jcas.throwFeatMissing("organization", "net.lateeye.uima.types.speech.Noun");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Noun_Type)jcasType).casFeatCode_organization);}
    
  /** setter for organization - sets  
   * @generated */
  public void setOrganization(String v) {
    if (Noun_Type.featOkTst && ((Noun_Type)jcasType).casFeat_organization == null)
      jcasType.jcas.throwFeatMissing("organization", "net.lateeye.uima.types.speech.Noun");
    jcasType.ll_cas.ll_setStringValue(addr, ((Noun_Type)jcasType).casFeatCode_organization, v);}    
  }

    