package learningJava;

public class TreeNodes {

    public int root;
    public TreeNodes left;
    public TreeNodes right;


    public TreeNodes(int rootVal){
        this.root = rootVal;
        left = null;
        right = null;
    }

    public int getRoot(){
        return root;
    }

    public TreeNodes getLeft() {
        return left;
    }

    public TreeNodes getRight() {
        return right;
    }

    public void setLeft(TreeNodes left) {
        this.left = left;
    }

    public void setRight(TreeNodes right) {
        this.right = right;
    }
}