package learningJava;


import javax.swing.tree.TreeNode;

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

public class MaxDepth_97 {
    /**
     * @param root: The root of binary tree.
     * @return: An integer
     */

    /** traverse **/
     public int Deepth = 0;
     public int maxDepth(TreeNode root) {
         // write your code here
         if (root == null){
             return 0;
         }

         postOrder(root, 1);

         return Deepth;
     }

     public void postOrder(TreeNode root, int currentDeep){

         if (root.left != null){
             postOrder(root.left, currentDeep + 1);
         }

         if (root.right != null){
             postOrder(root.right, currentDeep + 1);
         }

         Deepth = Math.max(currentDeep, Deepth);
     }
    /** Divide and conquer **/
    public int maxDepth(TreeNode root) {
        // write your code here
        // deep of tree = root + max(left tree, right tree);
        // when root do not have left and right child tree deep = 1
        // maxDepth will return depth of current tree.
        if (root == null){
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }
}

