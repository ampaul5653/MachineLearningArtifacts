package io.github.ampaul5653;

import java.util.ArrayList;
import java.util.List;

public class IDThreeNode {

  private List<IDThreeNode> children = new ArrayList<IDThreeNode>();
  private IDThreeNode parent;
  private String data;
  private NodeType type;

  public IDThreeNode(String data) {
    setData(data);
  }

  public void setData(String data) {
    this.data= data;
  }
  public String getData() {
    return data;
  }
  public List<IDThreeNode> getChildren() {
    return children;
  }

  public void addChild(IDThreeNode node) {
    node.parent= this;
    this.children.add(node);
  }
  public void removeChildren() {
    children = new ArrayList<IDThreeNode>();
  }
  public IDThreeNode getParent() {
    return parent;
  }

  public void print(String prefix, boolean isTail) {
    System.out.println(prefix + (isTail? "\\--" : "|--") + data);
    for (int i= 0; i< children.size() -1; i++) {
      children.get(i).print(prefix + (isTail? " " : "| "), false);
    }
    if (children.size() > 0) {
      children.get(children.size() -1)
          .print(prefix + (isTail?" " : "| "), true);
    }
  }
}
