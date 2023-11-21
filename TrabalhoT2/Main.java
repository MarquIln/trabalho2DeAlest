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

        System.out.println("Árvore:");
        tree.printTree();

        int leavesCount = tree.countLeaves(tree.getRoot());
        System.out.println("\nNúmero de folhas na árvore: " + leavesCount);
    }
}
