package collections.list;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
      LinkedList<Integer> ll = new LinkedList<>();
      ll.add(10);
      ll.add(20);
      ll.add(30);

      ll.addFirst(0);
      ll.offerFirst(-1);

      System.out.println(ll.peekFirst()); // [-1]
      System.out.println(ll.getFirst());  // [-1]

      ll.pollFirst();
      ll.removeFirst();
      System.out.println(ll); // [10, 20, 30]
    }
}
