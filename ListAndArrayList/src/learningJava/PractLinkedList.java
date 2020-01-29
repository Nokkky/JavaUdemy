package learningJava;

import java.util.Iterator;
import java.util.LinkedList;

public class PractLinkedList {
    public static void main(String[] args){
        LinkedList<String> placesToVisit = new LinkedList<String>();

        placesToVisit.add("111111");
        placesToVisit.add("222222");
        placesToVisit.add("333111");
        placesToVisit.add("444111");

        printList(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedlist){
        Iterator<String> i = linkedlist.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }

//    private static boolean addInOrder();
}
