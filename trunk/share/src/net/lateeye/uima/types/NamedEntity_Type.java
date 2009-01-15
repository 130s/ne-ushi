
/* First created by JCasGen Sat Dec 27 17:35:26 CST 2008 */
package net.lateeye.uima.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Thu Jan 15 14:02:53 CST 2009
 * @generated */
public class NamedEntity_Type extends Annotation_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (NamedEntity_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = NamedEntity_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new NamedEntity(addr, NamedEntity_Type.this);
  			   NamedEntity_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new NamedEntity(addr, NamedEntity_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = NamedEntity.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.lateeye.uima.types.NamedEntity");
 
  /** @generated */
  final Feature casFeat_lex;
  /** @generated */
  final int     casFeatCode_lex;
  /** @generated */ 
  public String getLex(int addr) {
        if (featOkTst && casFeat_lex == null)
      jcas.throwFeatMissing("lex", "net.lateeye.uima.types.NamedEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_lex);
  }
  /** @generated */    
  public void setLex(int addr, String v) {
        if (featOkTst && casFeat_lex == null)
      jcas.throwFeatMissing("lex", "net.lateeye.uima.types.NamedEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_lex, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public NamedEntity_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_lex = jcas.getRequiredFeatureDE(casType, "lex", "uima.cas.String", featOkTst);
    casFeatCode_lex  = (null == casFeat_lex) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_lex).getCode();

  }
}



    