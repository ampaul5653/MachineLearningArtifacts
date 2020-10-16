package io.github.ampaul5653;

public class BTree {

  private Node root;
  private Node currentNode;

  public BTree() {
    root = null;
  }

  public boolean search(int data) {
    return search(root, data);
  }

  // searches for a node with a particular value
  private boolean search(Node node, int data) {
    if (node.getData() == data) {
      return true;
    }
    if (node.getLeft() != null) {
      if (search(node.getLeft(), data)) {
        return true;
      }
    }
    if (node.getRight() != null) {
      if (search(node.getRight(), data)) {
        return true;
      }
    }
    return false;
  }

  // calls printInOrder from node
  public void printInOrder() {
    root.printInOrder(root);
  }

  // calls printPreOrder from node
  public void printPreOrder() {
    root.printPreorder(root);
  }

  // calls printPostOrder from node
  public void printPostOrder() {
    root.printPostorder(root);
  }

  public Node getRoot() {
    return root;
  }

  public boolean isEmpty() {
    return root == null;
  }

  public int countNodes() {
    return countNodes(root);
  }

  private int countNodes(Node node) {
    int count = 1;
    if (node == null) {
      return 0;
    } else {
      count += countNodes(node.getLeft());
      count += countNodes(node.getRight());
      return count;
    }
  }

  // displays the tree in diagram format
  public void print() {
    root.print();
  }

  public Node getCurrent() {
    return currentNode;
  }

  public void setCurrent(Node node) {
    this.currentNode = node;
  }

  public void setRoot(Node root) {
    this.root = root;
  }

}
