package Reference_LinkedList;

/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class InsertNodeInSortedList {
    /**
     * @param head: The head of linked list.
     * @param val: An integer.
     * @return: The head of new linked list.
     */
    public ListNode insertNode(ListNode head, int val) {
        // write your code here
        // val <= nextNode.val
        // null

        ListNode pre = new ListNode(-1);
        pre.next = head;
        head = pre;

        while(pre.next != null && val > pre.next.val){
            pre = pre.next;
        }

        ListNode newNode = new ListNode(val);
        newNode.next = pre.next;
        pre.next = newNode;

        return head.next;
    }


}
