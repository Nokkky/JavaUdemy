package learningJava;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyQueue firstQueue = new MyQueue();
        firstQueue.add(2);
        firstQueue.add(3);
        System.out.println(firstQueue.poll());
        System.out.println("Size is " + firstQueue.size());
        System.out.println(firstQueue.poll());
        System.out.println(firstQueue.empty());
    }
}

/**
 *  Frequently used interface in interview
 *  Set Map List Queue
 *
 * **/