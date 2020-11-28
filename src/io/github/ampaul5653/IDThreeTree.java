package io.github.ampaul5653;

public class IDThreeTree {

  private IDThreeNode root;

  public IDThreeNode getRoot() {
    return this.root;
  }

  public void setRoot(IDThreeNode root) {
    this.root= root;
  }

  // check if node of tree is a leaf
  public boolean isEmpty() {
    return (root == null);
  }
// print tree in diagram format
  public void print() {
    root.print("", true);
  }
}
