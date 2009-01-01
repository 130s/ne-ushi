
/* First created by JCasGen Sun Dec 28 07:59:27 CST 2008 */
package net.lateeye.uima.types.speech;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** 
 * Updated by JCasGen Wed Dec 31 02:27:37 CST 2008
 * @generated */
public class TrueAdjective_Type extends AbsSpeechType_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (TrueAdjective_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = TrueAdjective_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new TrueAdjective(addr, TrueAdjective_Type.this);
  			   TrueAdjective_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new TrueAdjective(addr, TrueAdjective_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = TrueAdjective.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.lateeye.uima.types.speech.TrueAdjective");



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public TrueAdjective_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    