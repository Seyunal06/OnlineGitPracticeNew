package Day64;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_for_LIFO {
    public static void main(String[] args) {

        //How do we implement a LifoQueue if we are not using
        // the old class called Stack, we can use any of Deque interface implementations
        // Deque is a double ended Queue so we can add item as always
        // and when we remove we can use removeLast last method to achieve Last in first out
        Deque<String> lifoQue = new LinkedList<>();
        lifoQue.add("review the class");
        lifoQue.add("do your homework");
        lifoQue.add("attend the class");
        lifoQue.add("Say bye to Java");

        System.out.println(lifoQue.removeLast());
        System.out.println(lifoQue.removeLast());
        System.out.println(lifoQue.removeLast());
        System.out.println(lifoQue.removeLast());

        System.out.println(lifoQue);


    }
}
