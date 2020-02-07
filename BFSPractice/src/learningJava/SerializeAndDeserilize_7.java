package learningJava;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserilize_7 {
    /**
     * This method will be invoked first, you should design your own algorithm
     * to serialize a binary tree which denote by a root node to a string which
     * can be easily deserialized by your own "deserialize" method later.
     *  *       0
     *  *    1      2
     *  *  3  4   null 5
     */

    public static void main(String[] args){
        TreeNode root = new TreeNode(0);
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        root.setLeft(one);
        root.setRight(two);
        one.setLeft(three);
        one.setRight(four);
        two.setLeft(null);
        two.setRight(five);
        String sResult = serialize(root);
        TreeNode sRoot = deserialize( sResult);
        System.out.println(sRoot.val);
        System.out.println(sRoot.left.val);
        System.out.println(sRoot.left.right.val);
    }
    public static String serialize(TreeNode root) {
        // write your code here

        if (root == null) return "{}";

        String serializeResult = "";
        // bfs binary tree
        // poll out root TreeNode,
        // if TreeNode != null serializeResult + val
        //      add left child
        //      add right child
        // else serializeResult + #
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
//        serializeResult += "{";
        while(!queue.isEmpty()){

            TreeNode currentRoot = queue.poll();

            if (currentRoot != null){

                serializeResult = serializeResult + " " + currentRoot.val;

                queue.offer(currentRoot.left);
                queue.offer(currentRoot.right);
            } else{
                serializeResult = serializeResult + " #";

            }
        }
//        serializeResult += "}";
        System.out.println(serializeResult);
        return serializeResult;
    }

    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in
     * "serialize" method.
     */
    public static TreeNode deserialize(String data) {
        // write your code here

        // add root to queue
        // get parent node in queue
        // get value of left and rightChild.
        //     leftChild ++ rightChild ++
        // create new TreeNode for left and right child add to queue
        // add left and right to parent
        //

        if (data.equals("{}")) return null;

        String[] nodeValue = data.substring(1, data.length() - 1).split(" ");

        int leftIndex = 1, rightIndex = 2;

        // Initialize root
        TreeNode root = new TreeNode(Integer.parseInt(nodeValue[0]));
        // add root to queue
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while (!queue.isEmpty() && leftIndex < nodeValue.length){

            TreeNode parent = queue.poll();
            // ********* Very Important Step ******** //
            if (parent == null){
                continue;
            }
            // get value of leftChild and rightChild
            String leftChildValue = "";
            String rightChildValue = "";
            if (leftIndex < nodeValue.length){
                leftChildValue = nodeValue[leftIndex];
            }
            if (rightIndex < nodeValue.length){
                rightChildValue = nodeValue[rightIndex];
            }
            leftIndex += 2;
            rightIndex += 2;

            // create leftChild rightChild
            TreeNode leftChild = createChild(leftChildValue);
            TreeNode rightChild = createChild(rightChildValue);
            if (leftChild != null){
                parent.left = leftChild;
            }
            if (rightChild != null){
                parent.right = rightChild;
            }

            queue.offer(leftChild);
            queue.offer(rightChild);
        }

        return root;

    }

    public static TreeNode createChild(String value){

        if (value.equals("#")) return null;
        if (value.equals("")) return null;
        TreeNode child = new TreeNode(Integer.parseInt(value));

        return child;
    }


}
