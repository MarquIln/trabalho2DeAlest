import java.util.ArrayList;
import java.util.List;

public class AvlTree {
    private Node root;
  
    public AvlTree(){
        root = null;
    }

    public void add(Node node, Integer element){
        if(node == null){
            node = new Node();
            node.element = element;
            node.left = null;
            node.right = null;
        }else if(element < node.element){
            add(node.left, element);
        }else if(element > node.element){
            add(node.right, element);
        }
    }

    public Node getParent(Node node){
        Node parent = null;
        Node current = root;
        while(current != null){
            if(node.element < current.element){
                parent = current;
                current = current.left;
            }else if(node.element > current.element){
                parent = current;
                current = current.right;
            }else{
                break;
            }
        }
        return parent;
    }

    public void clear(){
        root = null;
    }

    public boolean contains(Node node){
        Node current = root;
        while(current != null){
            if(node.element < current.element){
                current = current.left;
            }else if(node.element > current.element){
                current = current.right;
            }else {
                return true;
            }
        }
        return false;
    }

    public int height(Node node){
        Node current = root;
        int heightLeft = 0;
        int heightRight = 0;
        while(current != null){
            if(node.element < current.element){
                current = current.left;
                heightLeft++;
            }else if(node.element > current.element){
                current = current.right;
                heightRight++;
            }else{
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
              System.out.println(current.element + " ");
              preOrder(current.left);
              preOrder(current.right);
         }
        
    }

    public void inOrder(Node current){
        if(current != null){
            inOrder(current.left);
            System.out.println(current.element + " ");
            inOrder(current.right);
        }
    }

    
}
    
