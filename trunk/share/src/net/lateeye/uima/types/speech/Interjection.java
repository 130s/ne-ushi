

/* First created by JCasGen Wed Dec 31 02:27:37 CST 2008 */
package net.lateeye.uima.types.speech;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** ???.
 * Updated by JCasGen Thu Jan 15 14:02:53 CST 2009
 * XML source: /Users/isaosaito/Documents/workspace_eclipse/AE_morphological_Dev/desc/MeCab-SenTypeSystemDescriptor.xml
 * @generated */
public class Interjection extends Morpheme {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(Interjection.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Interjection() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Interjection(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Interjection(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Interjection(JCas jcas, int begin, int end) {
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

    