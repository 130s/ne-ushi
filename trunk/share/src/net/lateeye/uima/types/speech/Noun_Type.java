
/* First created by JCasGen Sat Dec 27 17:35:26 CST 2008 */
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

/** 
 * Updated by JCasGen Thu Jan 15 14:02:53 CST 2009
 * @generated */
public class Noun_Type extends Morpheme_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Noun_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Noun_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Noun(addr, Noun_Type.this);
  			   Noun_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Noun(addr, Noun_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = Noun.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.lateeye.uima.types.speech.Noun");
 
  /** @generated */
  final Feature casFeat_organization;
  /** @generated */
  final int     casFeatCode_organization;
  /** @generated */ 
  public String getOrganization(int addr) {
        if (featOkTst && casFeat_organization == null)
      jcas.throwFeatMissing("organization", "net.lateeye.uima.types.speech.Noun");
    return ll_cas.ll_getStringValue(addr, casFeatCode_organization);
  }
  /** @generated */    
  public void setOrganization(int addr, String v) {
        if (featOkTst && casFeat_organization == null)
      jcas.throwFeatMissing("organization", "net.lateeye.uima.types.speech.Noun");
    ll_cas.ll_setStringValue(addr, casFeatCode_organization, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Noun_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_organization = jcas.getRequiredFeatureDE(casType, "organization", "uima.cas.String", featOkTst);
    casFeatCode_organization  = (null == casFeat_organization) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_organization).getCode();

  }
}



    