public class MainAVL {
    public static void main(String[] args) {
        AvlTree tree = new AvlTree();

        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        tree.add(7);
        tree.add(8);
        tree.add(9);

        System.out.println("Árvore:");
        tree.printTree();
        System.out.println();
        System.out.println("Altura da árvore: " + tree.height());
        System.out.println();
        tree.clear();
        System.out.println("Árvore:");
        tree.printTree();
        tree.add(9);
        tree.add(8);
        tree.add(7);
        tree.add(6);
        tree.add(5);
        tree.add(4);
        tree.add(3);
        tree.add(2);
        tree.add(1);
        tree.printTree();
        System.out.println();
        System.out.println("Altura da árvore: " + tree.height());
        System.out.println();
        tree.inOrder(tree.getRoot());
        System.out.println();
    }
}
