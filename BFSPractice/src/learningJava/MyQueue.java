package learningJava;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyQueue {
    /** implement Queue using ArrayList
     *  method
     *      -- add(), add element to end of queue
     *      -- poll(), pop out start element of queue
     *      -- size(), return size of queue
     *      -- empty(), whether queue is empty.
     *
     */

    private ArrayList<Integer> elements;
    private int pointer;

    public MyQueue(){
        this.elements = new ArrayList<>();
        pointer = 0;
    }

    public void add(Integer element){
        this.elements.add(element);
    }

    public Integer poll(){
        if (this.empty()){
            return null;
        }
        return this.elements.get(pointer++);
    }

    public int size(){
        return this.elements.size() - pointer;
    }

    public boolean empty(){
        return this.size() == 0;
    }
}
