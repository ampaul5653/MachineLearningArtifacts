package io.github.ampaul5653;

//test class for Node class
public class NodeDriver {

  public static void main(String[] args) {
    //create nodes of tree
    Node root= new Node("A");
    Node node2= new Node("B");
    Node node3= new Node("C");
    Node node4= new Node("D");
    Node node5= new Node("E");
    Node node6= new Node("F");
    Node node7= new Node("G");

    //use set methods to connect nodes, creating the tree
    root.setLeft(node2);
    node2.setLeft(node4);
    node2.setRight(node5);
    node5.setLeft(node7);
    root.setRight(node3);
    node3.setRight(node6);

    // print the trees using the three binary tree printing methods
    root.printPreorder(root);
    System.out.println();
    root.printPostorder(root);
    System.out.println();
    root.printInOrder(root);
    System.out.println();
    root.print();
  }
}
