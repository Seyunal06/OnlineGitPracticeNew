package Day64;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterfaceDemo {
    public static void main(String[] args) {

        //THIS IS A FIRST-IN-FIRST-OUT QUEUE(FIFO)
        //the first item there will be the first to be removed
        //when we use remove method from the Queue interface
        Queue<String> taskQueue = new LinkedList<>();
        taskQueue.add("review the class");
        taskQueue.add("do your homework");
        taskQueue.add("attend the class");
        taskQueue.add("Say bye to Java");

        System.out.println(taskQueue);
        System.out.println(taskQueue.remove());
        System.out.println(taskQueue.remove());
        System.out.println(taskQueue.remove());
        System.out.println(taskQueue.remove());
        System.out.println(taskQueue);




    }
}
