package Reference_LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        MyLinkedList linkedList = new MyLinkedList();
        // test get, set, delete exception
        System.out.println(linkedList.size());
//        linkedList.get(1);
//        linkedList.set(1,1);
//        linkedList.add(1,1);
//        linkedList.delete(1);
        linkedList.add(0);
        linkedList.add(1);
        linkedList.printList();
        linkedList.add(0, -1);
        linkedList.printList();
        System.out.println(linkedList.get(2));
        linkedList.add(3);
        linkedList.set(1,9);
        linkedList.printList();
        linkedList.delete(2);
        System.out.println("LinkedList is: ");
        linkedList.printList();

        ListNode head = reverseLinkedList(linkedList.dummy.next);
        MyLinkedList reversedList = new MyLinkedList();

        boolean[][] f = new boolean[2][2];
        System.out.println(f[0][0]);

//        reversedList.printList();


    }
    public static ListNode dummy = new ListNode();

    public static ListNode reverseLinkedList(ListNode head){

        if (head.next == null){
            dummy = head;
            return head;
        }
        ListNode pre = reverseLinkedList(head.next);
        pre.next = head;

        return head;

    }


}
