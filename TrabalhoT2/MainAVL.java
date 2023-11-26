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

        System.out.println("Arvore:");
        tree.printTree();
        System.out.println();
        tree.treeInfo();
        System.out.println();
        tree.clearTree();
        System.out.println("Arvore esvaziada:");
        tree.printTree();
        System.out.println();
        System.out.println("Enchendo a arvore...");

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
        tree.treeInfo();
        System.out.println();
        tree.inOrder(tree.getRoot());
        System.out.println();
        System.out.println();
        tree.preOrder(tree.getRoot());
        System.out.println();
        System.out.println();
        tree.posOrder(tree.getRoot());
        System.out.println();
        System.out.println();
        tree.balanceTree();
        tree.printTree();
        System.out.println(tree.size());
        System.out.println(tree.height());
    }
}
