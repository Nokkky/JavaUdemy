package Reference_LinkedList;

public class MyLinkedList {

    public ListNode dummy = new ListNode(-1);

    //CREATE
    public void add(int val){
        ListNode pre = dummy;

        while(pre.next != null){
            pre = pre.next;
        }
        ListNode newNode = new ListNode(val);
        newNode.next = pre.next;
        pre.next = newNode;
    }

    public void add(int index, int val){
        if (index >= this.size()){
            throw new IndexOutOfBoundsException("Index out of Bound at add()!");
        }
        ListNode newNode = new ListNode(val);
        ListNode pre = dummy;

        for (int i = 0; i < index; i++){
            pre = pre.next;
        }
        newNode.next = pre.next;
        pre.next = newNode;
    }
    //UPDATE
    public void set(int index, int val){
        if (index >= this.size()){
            throw new IndexOutOfBoundsException("Index out of Bound at set()!");
        }

        ListNode pre = dummy;
        for (int i = 0; i < index; i++){
            pre = pre.next;
        }
        pre.next.val = val;
    }

    //READ
    public int get(int index){

        if(index > this.size()){
            throw new IndexOutOfBoundsException("Index out of bounds at get().");
        }

        ListNode pre = dummy;
        for (int i = 0; i < index; i++){
            pre = pre.next;
        }
        return pre.next.val;

    }

    //DELETE
    public int delete(int index){
        if (index > this.size()){
            throw new IndexOutOfBoundsException("Index out of bounds at delete().");
        }
        ListNode pre = dummy;
        for (int i = 0; i < index; i++){
            pre = pre.next;
        }
        int value = pre.next.val;
        pre.next = pre.next.next;
        return value;
    }

    public int size(){
        int size = 0;
        ListNode pre = dummy;
        while(pre.next != null){
            size++;
            pre = pre.next;
        }
        return size;
    }

    public void printList(){
        ListNode pre = dummy;
        int size = this.size();
        for (int i = 0; i < size; i++){
            System.out.print(pre.next.val + " ");
            pre = pre.next;
        }
        System.out.println("");
    }



}
