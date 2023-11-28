import java.util.Scanner;

public class MainBST {
  public static void main(String[] args) {
    BinarySearchTree bst = new BinarySearchTree();
    Scanner sc = new Scanner(System.in);

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
    System.out.println("Escolha 1 elemento onde a soma deve ser iniciada: ");
    int start = sc.nextInt();
    System.out.println("Escolha outro elemento que seja filho ou neto do anterior para finalizar a soma: ");
    int end = sc.nextInt();
    System.out.println("A soma entre os elementos " + start + " e " + end + " é: ");
    System.out.println(bst.sumBetween(start, end));
  }
}
