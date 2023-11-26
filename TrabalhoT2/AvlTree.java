public class AvlTree {
    private Node root;
  
    public AvlTree(){
        root = null;
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

    public int getParent(Integer elemento) {
        Node current = root;
        Node parent = null;
        while(current != null){
            if(current.element == elemento){
                return parent.element;
            } else if(current.element > elemento){
                parent = current;
                current = current.left;
            } else {
                parent = current;
                current = current.right;
            }
        }
        return -1;
    }

    public void clear(){
        root = null;
    }

    public boolean contains(Integer element){ // O(n)
        Node current = root;
        while(current != null){
            if(current.element == element){
                return true;
            } else if(current.element > element){
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }


    public int height(){ // O(n)
        Node current = root;
        int heightLeft = 0;
        int heightRight = 0;
        while(current != null){
            if (current.left != null) {
                heightLeft++;
                current = current.left;
            } else if (current.right != null) {
                heightRight++;
                current = current.right;
            } else {
                break;
            }
        }
        return heightLeft > heightRight ? heightLeft : heightRight;
    }

    public int size(){
        Node current = root;
        int sizeArvore = 0;
        while(current != null){
            if(current.left != null){
                sizeArvore++;
                current = current.left;
            } else if(current.right != null){
                sizeArvore++;
                current = current.right;
            }else {
                break;
                }
        }
        return sizeArvore;
    }


    public boolean isEmpty(){
        return root == null;
    }

    public void preOrder(Node current){
        if(current != null){
            System.out.print(current.element + " ");
            preOrder(current.left);
            preOrder(current.right);
        }
        
    }

    public void inOrder(Node current){
        if(current != null){
            inOrder(current.left);
            System.out.print(current.element + " ");
            inOrder(current.right);
        }
    }

    public void posOrder(Node current) {
        if (current != null) {
            posOrder(current.left);
            posOrder(current.right);
            System.out.print(current.element + " ");
        }
    }

    public void printTree() {
        if(root != null) {
            TreeFormatter formatter = new TreeFormatter();
            System.out.println(formatter.topDown(root));
        } else {
            System.out.println("Árvore vazia!");
        }
    }
    
    public void balance(Node current) {
        if (current != null) {
            balance(current.left);
            balance(current.right);
            int balanceFactor = getBalanceFactor(current);
    
            if (balanceFactor > 1) {
                if (getBalanceFactor(current.left) < 0) {
                    current.left = rotateLeft(current.left);
                }
                current = rotateRight(current);
            }else if (balanceFactor < -1) {
                if (getBalanceFactor(current.right) > 0) {
                    current.right = rotateRight(current.right);
                }
                current = rotateLeft(current);
            }
            updateHeight(current);
        }
    }
    
    private int getBalanceFactor(Node node) {
        if (node.right == null || node.left == null) {
            return 0;
        } else if (node.right == null) {
            return -1 * node.left.height;
        } else if (node.left == null) {
            return node.right.height;
        }
        return height(node.right) - height(node.left);
    }
    
    private void updateHeight(Node node) {
        node.height = 1 + Math.max(height(node.left), height(node.right));
    }
    
    private int height(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }
    
    private Node rotateRight(Node y) {
        Node x = y.left;
        Node T2 = x.right;
        x.right = y;
        y.left = T2;
        updateHeight(y);
        updateHeight(x);
        return x;
    }
    
    private Node rotateLeft(Node x) {
        Node y = x.right;
        Node T2 = y.left;
        y.left = x;
        x.right = T2;
        updateHeight(x);
        updateHeight(y);
    
        return y;
    }
    
}
    
