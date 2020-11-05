/**
 *
 */
public class RedBlackTree {

    Node root;

    //O(log N)
    void search(){

    }

    /**
     * Calls insertRecursive.
     * @param key, the key to be stored.
     */
    public void initInsert(int key){
        root = insertRecursive(root, key);
    }

    /**
     * Creates a new node that is then inserted into the tree.
     * The method recursively iterates through the tree to find where
     * the new node fits.
     * @param current The head node, or current, of the tree.
     * @param key The integer data to be stored in the node.
     * @return current, the current Node.
     * Partially based off of code from:
     * https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
     */
    Node insertRecursive(Node current, int key){
        //if current node is null, set it to the new node.
        if (current == null){
            return new Node(key);
        }
        //otherwise, recurse to the left or right child.
        else if (current.key < key) {
            current.rightChild = insertRecursive(current.rightChild, key);
        }
        else if (current.key > key) {
            current.leftChild = insertRecursive(current.leftChild, key);
        }
        return current;
    }

    /**
     * Prints graphical representation of tree in text
     */
    void printTree(){

    }

    void printLevelOrder(){
        //from d = 1 to height(tree)
            //printGivenLevel(tree, d)
    }

    /**
     * Finds the height of a subtree from a given node.
     * @param node The node given by the method call. The root of the subtree.
     * @return the height of the tree.
     * Partial based off of:
     * https://www.geeksforgeeks.org/write-a-c-program-to-find-the-maximum-depth-or-height-of-a-tree/
     */
    int getHeight(Node node){
        //if the node is null, it has height of zero.
        if (node == null){
            return 0;
        }
        //otherwise, find the depth of the left and right subtrees,
        //and add the larger ones recursively.
        else {
            int depthLeft = getHeight(node.leftChild);
            int depthRight = getHeight(node.rightChild);

            if (depthLeft > depthRight) {
                return (depthLeft + 1);
            }
            else {
                return (depthRight + 1);
            }
        }
    }

    /**
     * Finds the height of this tree.
     * Doesn't work for finding subtrees,
     * just useful for the convenience of not accessing
     * root from public.
     * @return the height of this tree.
     */
    int getThisHeight(){
        return getHeight(root);
    }

    /**
     *
     * @param current
     * @param level
     * @return
     */
    String levelString(Node current, int level){
        StringBuilder stringBuilder = new StringBuilder();
        if (current == null){
            return stringBuilder.toString();
        }
        else if (getHeight(current) == 1){
            stringBuilder.append(current.key);
            return stringBuilder.toString();
        }
        else {
            stringBuilder.append(levelString(current.leftChild, level - 1));
            stringBuilder.append(levelString(current.rightChild, level - 1));
            return stringBuilder.toString();
        }
    }

    //O(log N)
    void remove(int key){

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