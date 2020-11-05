/**
 *
 */
public class RedBlackTree {

    Node root;

    //O(log N)
    void search(){

    }



    /**
     * Creates a new node that is then inserted into the tree.
     * The method recursively iterates through the tree to find where
     * the new node fits.
     * @param current The head node, or current, of the tree.
     * @param key The integer data to be stored in the node.
     * @return current, the current Node.
     * Partially based off of user892871's response
     * https://stackoverflow.com/questions/26270200/recursive-insert-for-binary-tree
     */
    Node insertRecursive(Node current, int key){
        if (current == null){
            return new Node(key);
        }
        else if (current.key < key) {
            current.rightChild = insertRecursive(current.rightChild, key);
        }
        else if (current.key > key) {
            current.leftChild = insertRecursive(current.leftChild, key);
        }
        return current;
    }

    //O(log N)
    void remove(int key){

    }

    public void initInsert(int key){
        root = insertRecursive(root, key);
    }
}

/**
 * Node class for red/black tree.
 * Stores key, pointers to two children, and a bool representing red or black.
 */
class Node {
    boolean red;
    int key;
    Node leftChild;
    Node rightChild;

    //constructor to set key and color.
    Node(int key){
        this.key = key;
        rightChild = null;
        leftChild = null;
        red = true;
    }

    void setRed(){
        red = true;
    }

    void setBlack(){
        red = false;
    }

    boolean isRed(){
        return red;
    }
}