package Reference_LinkedList;

public class ListNode {
    int val;
    ListNode next;

    private static final int DEFAULT_VALUE = 0;

    public ListNode(){
        this.val = DEFAULT_VALUE;
    }

    public ListNode(int val){
        this.val = val;
    }
}
