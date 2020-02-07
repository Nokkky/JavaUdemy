package learningJava;


public class TreeNode {
     public int val;
     public TreeNode left, right;

     public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }

    public TreeNode() {
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
