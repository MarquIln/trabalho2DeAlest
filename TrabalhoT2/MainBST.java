public class MainBST {
  public static void main(String[] args) {
    BinarySearchTree bst = new BinarySearchTree();

    bst.add(10);
    bst.add(5);
    bst.add(14);
    bst.add(12);
    bst.add(15);
    bst.add(19);
    bst.add(8);
    bst.add(2);
    bst.add(4);
    bst.add(6);
    bst.add(9);
    bst.add(1);
    bst.add(11);

    System.out.println("Arvore:");
    bst.printTree();
    System.out.println();
    bst.treeInfo();
    System.out.println();
    System.out.println("Soma dos elementos entre 10 e 15: " + bst.countBetween(10, 19));
  }
}
