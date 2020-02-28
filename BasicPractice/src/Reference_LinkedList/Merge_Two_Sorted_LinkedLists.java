package Reference_LinkedList;

public class Merge_Two_Sorted_LinkedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
        //  1 3 5 7
        //   2 4 6
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l2;
        }
        ListNode pre = new ListNode(-1);
        pre.next = l2;
        l2 = pre;

        while(l1 != null){
            // inserted node l1

            // find position at l2
            while (pre.next != null && l1.val > pre.next.val){
                pre = pre.next;
            }
            // pre -> l2
            //     l1 -> l1next
            // insert node l1 to l2
            ListNode temp = l1.next;
            l1.next = pre.next;
            pre.next = l1;
            pre = l1;

            // move l1
            l1 = temp;
        }

        return l2.next;

    }
}


