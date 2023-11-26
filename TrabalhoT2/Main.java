public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(3);
        tree.add(7);
        tree.add(12);
        tree.add(18);
        tree.add(1);
        tree.add(4);
        tree.add(6);
        tree.add(8);
        tree.add(11);
        tree.add(13);
        tree.add(16);
        tree.add(19);

        System.out.println("Árvore:");
        tree.printTree();

        int leavesCount = tree.countLeaves(tree.getRoot());
        System.out.println("\nNúmero de folhas na árvore: " + leavesCount);

        int nodesCount = tree.countNodes(tree.getRoot());
        System.out.println("Número de nós na árvore: " + nodesCount);

        System.out.println();
        System.out.println();
        int countBetween = tree.countBetween(5, 1);
        System.out.println("Soma dos nós entre 5 e 1: " + countBetween);

        System.out.println();
        tree.preOrder(tree.getRoot());
    }
}
