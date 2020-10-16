package io.github.ampaul5653;

public class NodeDriver {

  public static void main(String[] args) {
    //create nodes of tree
    Node root= new Node(1);
    Node node2= new Node(2);
    Node node3= new Node(3);
    Node node4= new Node(4);
    Node node5= new Node(5);
    Node node6= new Node(6);
    Node node7= new Node(7);

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
