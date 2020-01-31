package learningJava;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class BinaryTreeLevelOrderTraversal_69 {
    /**
     * @param root: A Tree
     * @return: Level order a list of lists of integer
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        // write your code here
        // enter nodes of each level of binary tree into queue
        // go through currentLevel's children until all nodes has been visited
        if (root == null) {
            return null;
        }

        List bfsResult = new ArrayList<ArrayList>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        // root enter queue.
        // queue stores nodes to visited.
        queue.add(root);

        while (!queue.isEmpty()){

            ArrayList levelList = new ArrayList<Integer>();
            // for each node of current level.
            int size = queue.size();
            // traver currentLevel and enter their children.
            for (int i = 0; i < size; i++){
                // one node of queue leaving
                TreeNode currentNode = queue.poll();
                levelList.add(currentNode.val);

                if (currentNode.left != null){
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null){
                    queue.add(currentNode.right);
                }

            }

            bfsResult.add(levelList);

        }
        return bfsResult;
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // write your code here
        // store root node into Queue
        // pop out each node of current level.
        // store node as visited.
        // add node's children into queuee.

        ArrayList reverseOrder = new ArrayList<ArrayList>();
        Queue queue = new LinkedList<TreeNode>();

        queue.add(root);

        while(!queue.isEmpty()){

            ArrayList visited = new ArrayList<Integer>();
            int size = queue.size();
            // pop out each node of current level.
            for (int i = 0; i < size; i++){
                // store node as visited.
                TreeNode head = queue.poll();
                visited.add(head.val);
                // add node's children into queuee.
                if (head.left != null){
                    queue.add(head.left);
                }
                if (head.right != null){
                    queue.add(head.right);
                }

            }

            reverseOrder.add(0, visited);
        }

        return reverseOrder;
    }
}
