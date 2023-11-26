public class AvlTree extends BinarySearchTree {
    public AvlTree(){
        super();
    }

    public void balanceTree() {
        root = balance(root);
    }

    private Node balance(Node node) {
        if (node == null) {
            return null;
        }
        updateHeight(node);
        int balance = getBalance(node);


        if (balance > 1 && getBalance(node.left) >= 0) {
            return rotateRight(node);
        }
        if (balance < -1 && getBalance(node.right) <= 0) {
            return rotateLeft(node);
        }
        if (balance > 1 && getBalance(node.left) < 0) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }
        if (balance < -1 && getBalance(node.right) > 0) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    private void updateHeight(Node node) {
        if (node != null) {
            node.height = 1 + Math.max(height(node.left), height(node.right));
        }
    }

    private int getBalance(Node node) {
        if (node == null) {
            return 0;
        }
        return height(node.left) - height(node.right);
    }

    private Node rotateRight(Node n1) {
        Node n2 = n1.left;
        Node aux = n2.right;
        n2.right = n1;
        n1.left = aux;
        updateHeight(n1);
        updateHeight(n2);
        return n2;
    }

    private Node rotateLeft(Node n1) {
        Node n2 = n1.right;
        Node aux = n2.left;
        n2.left = n1;
        n1.right = aux;
        updateHeight(n1);
        updateHeight(n2);
        return n2;
    }
}
    
