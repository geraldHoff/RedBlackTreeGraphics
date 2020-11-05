

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
        System.out.println(tree.getThisHeight());
        System.out.println(tree.levelString(tree.root, 0));
    }
}
