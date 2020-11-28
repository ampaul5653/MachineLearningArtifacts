package io.github.ampaul5653;

//test class for the BTree class
public class TreeDriver {

  public static void main(String[] args) {
    System.out.println("Creating Tree");
    BTree tree = new BTree();

    System.out.println("Count nodes in empty tree");
    System.out.println(tree.countNodes());

    System.out.println("Create Nodes with question A");
    Node root = new Node("A");

    System.out.println("Set node as root");
    tree.setRoot(root);

    System.out.println("Count nodes in tree with only root added");
    System.out.println(tree.countNodes());

    Node node2 = new Node("B");
    Node node3 = new Node("C");
    Node node4 = new Node("D");
    Node node5 = new Node("E");
    Node node6 = new Node("F");
    Node node7 = new Node("G");

    root.setLeft(node2);
    node2.setLeft(node4);
    node2.setRight(node5);
    node5.setLeft(node7);
    root.setRight(node3);
    node3.setRight(node6);

    System.out.println("Set the current node to be the root");
    tree.setCurrent(tree.getRoot());

    System.out.println("Display the current node");
    System.out.println(tree.getCurrent().getQuestion());

    Node currentNode = tree.getCurrent();

    System.out.println("Count nodes in tree with 7 nodes added");
    System.out.println(tree.countNodes());

    System.out.println("In Order print");
    tree.printInOrder();

    System.out.println("\nPreorder print");
    tree.printPreOrder();

    System.out.println("\nPostorder print");
    tree.printPostOrder();

    System.out.println("\nDisplay the nodes as tree diagram");
    tree.print();

  }
}
