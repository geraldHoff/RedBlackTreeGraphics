

/* Gerald Hoff
 * Advanced Data Structures Java
 * RedBlackTree
 * 11/3/2020
 *
 * Driver class that utilizes the RedBlackTRee class to create a red-black tree.
 * It then shows the tree graphically.
 */
public class Driver {
    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        tree.initInsert(5);
        tree.initInsert(3);
        tree.initInsert(7);
        tree.initInsert(9);
        tree.initInsert(6);
        tree.initInsert(2);
        tree.initInsert(10);
        tree.initInsert(1);
        tree.initInsert(4);
        tree.initInsert(8);
        tree.initInsert(11);
        tree.initInsert(12);

        tree.printTree();
    }
}
