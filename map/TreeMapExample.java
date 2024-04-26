package collections.map;

import java.util.Collections;
import java.util.TreeMap;


public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(1, "a");
        tm.put(3, "c");
        tm.put(2, "b");
        System.out.println(tm); // {1=a, 2=b, 3=c}

        TreeMap<Integer, String> rtm = new TreeMap<>(Collections.reverseOrder());
        rtm.put(1, "a");
        rtm.put(3, "c");
        rtm.put(2, "b");
        System.out.println(rtm); // {3=c, 2=b, 1=a}
    }
}
