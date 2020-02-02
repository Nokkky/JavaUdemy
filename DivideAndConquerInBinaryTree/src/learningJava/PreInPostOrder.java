package learningJava;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
/**
 *       0
 *    1      2
 *  3  4   null 5
 *
 *  See traverse process as visit a node
 *
 *  preOrder: first visit the node then go to left child tree and right child tree.
 *  inOrder: when node does not have left child tree visit the node then go to right child tree.
 *  postOrder: when node does not have left and right child visit the node.
 * **/
public class PreInPostOrder {

    public static void main(String[] main){

        TreeNodes root = new TreeNodes(0);
        TreeNodes one = new TreeNodes(1);
        TreeNodes two = new TreeNodes(2);
        TreeNodes three = new TreeNodes(3);
        TreeNodes four = new TreeNodes(4);
        TreeNodes five = new TreeNodes(5);

        root.setLeft(one);
        root.setRight(two);
        one.setLeft(three);
        one.setRight(four);
        two.setLeft(null);
        two.setRight(five);
        ArrayList<Integer> result = new ArrayList<Integer>();

        result = preOrderTraverse(root, result);
        System.out.println("Result of pre order traverse is: ");
        for (Object node: result) {
            System.out.print(node + " ");
        }

        result = new ArrayList<Integer>();
        result = inOrder(root, result);
        System.out.println();
        System.out.println("Result of in order traverse is: ");
        for (Object node: result) {
            System.out.print(node + " ");
        }

        result = new ArrayList<Integer>();
        result = postOrder(root, result);
        System.out.println();
        System.out.println("Result of post order traverse is: ");
        for (Object node: result) {
            System.out.print(node + " ");
        }

    }

    public static ArrayList<Integer> preOrderTraverse(TreeNodes root, ArrayList<Integer> result){
        // Binary Tree is null
        if (root == null){
            return result;  // or return null.
        }
        // first visit tree

        result.add(root.getRoot());

        if (root.left != null){
            result = preOrderTraverse(root.left, result);
        }

        if (root.right != null){
            result = preOrderTraverse(root.right, result);
        }

        return result;
    }

    public static ArrayList<Integer> inOrder(TreeNodes root, ArrayList<Integer> result){
        /** When Binary Tree does not have left child tree we visit it **/

        if (root == null){
            return result; // or return null.
        }
        // go to left child tree
        if (root.left != null){
            result = inOrder(root.left, result);
        }

        result.add(root.getRoot());
        // go to right child tree

        if (root.right != null){
            result = inOrder(root.right, result);
        }
        return result;

    }

    public static ArrayList<Integer> postOrder(TreeNodes root, ArrayList<Integer> result){
        /** When Binary Tree does not have left child tree we visit it **/

        if (root == null){
            return result; // or return null.
        }
        // go to left child tree
        if (root.left != null){
            result = postOrder(root.left, result);
        }

        // go to right child tree
        if (root.right != null){
            result = postOrder(root.right, result);
        }

        result.add(root.getRoot());

        return result;

    }
}
