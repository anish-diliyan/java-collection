package collections.queue.deque;

import java.util.ArrayDeque;
import java.util.Deque;

// Last IN FirstOut   (insertion/deletion) First <----- queue ----> Last (insertion/deletion)
public class ArrayDequeAsStack {
    public static void operationOnFirst() {
        Deque<Integer> stack = new ArrayDeque<>();
        // add First
        stack.offerFirst(10);
        stack.offerFirst(20);
        stack.offerFirst(30);
        System.out.println(stack); // [30, 20, 10]

        // get first
        System.out.println(stack.peekFirst()); // 30

        // remove first
        stack.pollFirst();
        System.out.println(stack); // [20, 10] 30 removed from first
    }
    public static void operationOnLast() {
      Deque<Integer> stack = new ArrayDeque<>();
      // add on last
        stack.offerLast(10);
        stack.offerLast(20);
        stack.offerLast(30);
        System.out.println(stack); //[10, 20, 30]
      // get from last
        System.out.println(stack.peekLast()); // 30
      // remove last
        stack.pollLast();
        System.out.println(stack); // [10, 20]
    }

    public static void main(String[] args) {
         operationOnFirst();
        //operationOnLast();
    }
}
