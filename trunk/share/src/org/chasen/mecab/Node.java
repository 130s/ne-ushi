/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.33
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.chasen.mecab;

public class Node {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Node(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Node obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      throw new UnsupportedOperationException("C++ destructor does not have public access");
    }
    swigCPtr = 0;
  }

  public Node getPrev() {
    long cPtr = MeCabJNI.Node_prev_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Node(cPtr, false);
  }

  public Node getNext() {
    long cPtr = MeCabJNI.Node_next_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Node(cPtr, false);
  }

  public Node getEnext() {
    long cPtr = MeCabJNI.Node_enext_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Node(cPtr, false);
  }

  public Node getBnext() {
    long cPtr = MeCabJNI.Node_bnext_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Node(cPtr, false);
  }

  public Path getRpath() {
    long cPtr = MeCabJNI.Node_rpath_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Path(cPtr, false);
  }

  public Path getLpath() {
    long cPtr = MeCabJNI.Node_lpath_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Path(cPtr, false);
  }

  public String getFeature() {
    return MeCabJNI.Node_feature_get(swigCPtr, this);
  }

  public long getId() {
    return MeCabJNI.Node_id_get(swigCPtr, this);
  }

  public int getLength() {
    return MeCabJNI.Node_length_get(swigCPtr, this);
  }

  public int getRlength() {
    return MeCabJNI.Node_rlength_get(swigCPtr, this);
  }

  public int getRcAttr() {
    return MeCabJNI.Node_rcAttr_get(swigCPtr, this);
  }

  public int getLcAttr() {
    return MeCabJNI.Node_lcAttr_get(swigCPtr, this);
  }

  public int getPosid() {
    return MeCabJNI.Node_posid_get(swigCPtr, this);
  }

  public short getChar_type() {
    return MeCabJNI.Node_char_type_get(swigCPtr, this);
  }

  public short getStat() {
    return MeCabJNI.Node_stat_get(swigCPtr, this);
  }

  public short getIsbest() {
    return MeCabJNI.Node_isbest_get(swigCPtr, this);
  }

  public long getSentence_length() {
    return MeCabJNI.Node_sentence_length_get(swigCPtr, this);
  }

  public float getAlpha() {
    return MeCabJNI.Node_alpha_get(swigCPtr, this);
  }

  public float getBeta() {
    return MeCabJNI.Node_beta_get(swigCPtr, this);
  }

  public void setProb(float value) {
    MeCabJNI.Node_prob_set(swigCPtr, this, value);
  }

  public float getProb() {
    return MeCabJNI.Node_prob_get(swigCPtr, this);
  }

  public short getWcost() {
    return MeCabJNI.Node_wcost_get(swigCPtr, this);
  }

  public int getCost() {
    return MeCabJNI.Node_cost_get(swigCPtr, this);
  }

  public Token getToken() {
    long cPtr = MeCabJNI.Node_token_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Token(cPtr, false);
  }

  public String getSurface() {
    return MeCabJNI.Node_surface_get(swigCPtr, this);
  }

  public Node begin_node_list(long i) {
    long cPtr = MeCabJNI.Node_begin_node_list(swigCPtr, this, i);
    return (cPtr == 0) ? null : new Node(cPtr, false);
  }

  public Node end_node_list(long i) {
    long cPtr = MeCabJNI.Node_end_node_list(swigCPtr, this, i);
    return (cPtr == 0) ? null : new Node(cPtr, false);
  }

}
