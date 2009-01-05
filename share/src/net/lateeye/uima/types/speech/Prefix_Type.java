
/* First created by JCasGen Tue Dec 30 15:43:06 CST 2008 */
package net.lateeye.uima.types.speech;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** ????????/???/????????????.
 * Updated by JCasGen Fri Jan 02 12:10:42 CST 2009
 * @generated */
public class Prefix_Type extends Morpheme_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Prefix_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Prefix_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Prefix(addr, Prefix_Type.this);
  			   Prefix_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Prefix(addr, Prefix_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = Prefix.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.lateeye.uima.types.speech.Prefix");



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Prefix_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    