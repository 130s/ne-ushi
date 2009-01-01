

/* First created by JCasGen Sun Dec 28 07:59:27 CST 2008 */
package net.lateeye.uima.types.speech;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** joshi
 * Updated by JCasGen Sun Dec 28 07:59:27 CST 2008
 * XML source: /Users/isaosaito/Documents/workspace_eclipse/AE_morphological_Dev/desc/senTypeSystemDescriptor.xml
 * @generated */
public class Paricle extends AbsType {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(Paricle.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Paricle() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Paricle(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Paricle(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Paricle(JCas jcas, int begin, int end) {
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

    