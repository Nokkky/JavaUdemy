package learningJava;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyQueue firstQueue = new MyQueue();
        firstQueue.add(2);
        firstQueue.add(3);
        System.out.println(firstQueue.poll());
        System.out.println("Size is " + firstQueue.size());
        System.out.println(firstQueue.poll());
        System.out.println(firstQueue.empty());

        boolean[][] init = new boolean[1][1];
        System.out.println(init[0][0]);
    }
}

/**
 *  Frequently used interface in interview
 *  Set Map List Queue
 *
 * **/

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
 * BinaryTree
 * Why using BFS serialized binary tree?
 * - Because node number of each level is fixed, use BFS first element is rood,
 *   second and third is second level and so on.
 *     1
 *    / \
 *   2   3
 *  / \   \
 * 4   5   6
 *    / \
 *   7   8
 *   {1,2,3,4,5,#,6,#,#,7,8}
 *
 * */

/**
 * Definition for Undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) {
 *         label = x;
 *         neighbors = new ArrayList<UndirectedGraphNode>();
 *     }
 * }
 */