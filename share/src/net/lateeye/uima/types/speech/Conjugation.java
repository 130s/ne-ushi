

/* First created by JCasGen Sun Dec 28 07:59:27 CST 2008 */
package net.lateeye.uima.types.speech;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Fri Jan 02 12:10:42 CST 2009
 * XML source: /Users/isaosaito/Documents/workspace_eclipse/AE_morphological_Dev/desc/MeCab-SenTypeSystemDescriptor.xml
 * @generated */
public class Conjugation extends Morpheme {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(Conjugation.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Conjugation() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Conjugation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Conjugation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Conjugation(JCas jcas, int begin, int end) {
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
     
}

    