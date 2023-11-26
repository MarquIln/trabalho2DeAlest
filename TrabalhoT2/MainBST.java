public class MainBST {
  public static void main(String[] args) {
    BinarySearchTree bst = new BinarySearchTree();

    bst.add(1);
    System.out.println("Raiz" + bst.getRoot().element);
    bst.add(2);
    bst.add(3);
    bst.add(4);
    bst.add(5);
    bst.add(6);
    bst.add(7);
    bst.add(8);
    bst.add(9);

    System.out.println("Árvore:");
    bst.printTree();
    System.out.println();
    System.out.println("Altura da árvore: " + bst.height(bst.getRoot()));
    System.out.println();
    bst.clearTree();
    
    int leavesCount = bst.countLeaves(bst.getRoot());
    System.out.println("\nNúmero de folhas na árvore: " + leavesCount);

    int nodesCount = bst.countNodes(bst.getRoot());
    System.out.println("Número de nós na árvore: " + nodesCount);

    System.out.println();
    System.out.println();
    int countBetween = bst.countBetween(5, 1);
    System.out.println("Soma dos nós entre 5 e 1: " + countBetween);
  }
}
