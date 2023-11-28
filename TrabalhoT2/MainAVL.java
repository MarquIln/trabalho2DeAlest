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
        tree.balanceTree();
        tree.printTree();
        
        System.out.println();

        tree.clear();
        tree.printTree();
        System.out.println();
        System.out.println("Enchendo a arvore novamente...");

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
        System.out.print("In Order: ");
        tree.inOrder(tree.getRoot());
        System.out.println();
        System.out.println();
        System.out.print("Pre Order: ");
        tree.preOrder(tree.getRoot());
        System.out.println();
        System.out.println();
        System.out.print("Pos Order: ");
        tree.posOrder(tree.getRoot());
        System.out.println();
        System.out.println();
        tree.balanceTree();
        tree.printTree();
        System.out.println();
        System.out.println();
        tree.treeInfo();
    }
}
