package Reference_LinkedList;

public class RemoveLinkedListElement {
    /**
     * @param head: a ListNode
     * @param n: An integer
     * @return: a ListNode
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        ListNode pre = new ListNode(-1);
        ListNode pre2 = new ListNode(-1);
        pre.next = head;
        pre2.next = head;
        head = pre;
        // 1 2 3 4 5
        //     ^   ^
        for (int i = 0; i < n; i++){
            pre2 = pre2.next;
        }

        while(pre2.next != null){
            pre = pre.next;
            pre2 = pre2.next;
        }

        pre.next = pre.next.next;
        return head.next;
    }
}
