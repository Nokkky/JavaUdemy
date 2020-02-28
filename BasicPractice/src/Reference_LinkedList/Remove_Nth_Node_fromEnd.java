package Reference_LinkedList;

public class Remove_Nth_Node_fromEnd {
    /**
     * @param head: a ListNode
     * @param val: An integer
     * @return: a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        // write your code here
        ListNode pre = new ListNode(-1);
        pre.next = head;
        head = pre;
        // head -> 1->2->3->4->5->null
        //                         ^
        // head -> 1->2->4->5->null
        //                  ^
        while(pre.next != null){

            if (pre.next.val == val){
                pre.next = pre.next.next;
            }else {
                pre = pre.next;
            }
        }

        return head.next;
    }
}
