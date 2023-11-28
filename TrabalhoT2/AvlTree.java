public class AvlTree extends BinarySearchTree {
    public AvlTree(){
        super();
    }

    public Node getRoot(){
        return root;
    }

    public void add(Integer element){ // O(n)
        Node prev, current;
        Node node = new Node();
        node.element = element;
        node.right = null;
        node.left = null;
        if (root == null) {
            root = node;
        } else {
            current = root;
            while(true) {
                prev = current;
                if (element <= current.element) {
                    current = current.left;
                    if (current == null) {
                        prev.left = node;
                        return;
                    }
                }
                else {
                    current = current.right;
                    if (current == null) {
                        prev.right = node;
                        return;
                    }
                }
            }
        }
    }

    public int getParent(Integer element){ // O(n)
        Node current = root;
        Node prev = null;
        while (current != null) {
            if (current.element == element) {
                return prev.element;
            }
            prev = current;
            if (element <= current.element) {
                current = current.left;
            }
            else {
                current = current.right;
            }
        }
        return -1;
    }

    public boolean contains(Node node){ // O(n)
        Node current = root;
        while (current != null) {
            if (current.element == node.element) {
                return true;
            }
            if (node.element <= current.element) {
                current = current.left;
            }
            else {
                current = current.right;
            }
        }
        return false;
    }

    public int height(){
        Node current = root;
        int heightLeft = 0;
        int heightRight = 0;
        while(current != null){
            if(current.element != null){
                current = current.left;
                heightLeft++;
            }else if(current.element != null){
                current = current.right;
                heightRight++;
            }else{
                break;
            }
        }
        return heightLeft > heightRight ? heightLeft : heightRight;
    }

    public void clear(){
        root = null;
    }

    public int size(Node current){
        if (root == null) {
            return 0;
        }
        return (1 + countNodes(current.left) + countNodes(current.right));
    }

        public void balanceTree() {
        root = balanceTree(root);
    }
    
    private Node balanceTree(Node node) {
        if (node == null) {
            return null;
        }
        node.left = balanceTree(node.left);
        node.right = balanceTree(node.right);
        return balance(node);
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

    private int getBalance(Node node) {
        if (node == null) {
            return 0;
        }
        return height(node.left) - height(node.right);
    }

    private void updateHeight(Node node) {
        if (node != null) {
            node.height = 1 + Math.max(height(node.left), height(node.right));
        }
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

    public void treeInfo() {
        System.out.println("Altura da arvore: " + height(root));
        System.out.println("Quantidade de Nós: " + size(root));
    }
}
    
