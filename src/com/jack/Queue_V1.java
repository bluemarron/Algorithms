package com.jack;

import java.util.*;

/**
 * Created by jack on 2016. 2. 11..
 */
public class Queue_V1 {
    public static void main(String args[]) {
        Queue queue = new LinkedList<Integer>();

        System.out.println("[#] queue: " + queue);
        showEnqueue(queue, 42);
        showEnqueue(queue, 66);
        showEnqueue(queue, 99);
        showDequeue(queue);
        showDequeue(queue);
        showDequeue(queue);
        try {
            showDequeue(queue);
        } catch (Exception e) {
            System.out.println("queue exception");
        }
    }

    static void showEnqueue(Queue queue, int a) {
        queue.add(new Integer(a));
        System.out.println("enqueue(" + a + ")");
        System.out.println("queue: " + queue);
    }

    static void showDequeue(Queue queue) {
        System.out.print("dequeue -> ");
        Integer a = (Integer) queue.peek();
        queue.remove();
        System.out.println(a);
        System.out.println("queue: " + queue);
    }


}
