package collections.queue.deque;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeAsQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        // last in
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println(queue); // [10, 20, 30]
        // get first
        System.out.println(queue.peek()); // 10
        // first out
        queue.poll();
        System.out.println(queue); // [20, 30]
    }
}
