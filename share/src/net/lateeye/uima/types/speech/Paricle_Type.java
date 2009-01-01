
/* First created by JCasGen Sun Dec 28 07:59:27 CST 2008 */
package net.lateeye.uima.types.speech;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** joshi
 * Updated by JCasGen Sun Dec 28 07:59:27 CST 2008
 * @generated */
public class Paricle_Type extends AbsType_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Paricle_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Paricle_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Paricle(addr, Paricle_Type.this);
  			   Paricle_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Paricle(addr, Paricle_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = Paricle.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.lateeye.uima.types.speech.Paricle");



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Paricle_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    