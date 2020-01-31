package learningJava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal2_70 {
    /**
     * @param root: A tree
     * @return: buttom-up level order a list of lists of integer
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // write your code here
        // store root node into Queue
        // pop out each node of current level.
        // store node as visited.
        // add node's children into queuee.

        ArrayList reverseOrder = new ArrayList<ArrayList>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        if (root == null){
            return reverseOrder;
        }

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