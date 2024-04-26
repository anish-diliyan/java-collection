package collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHshSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(15);
        hs.add(10); // insertion of duplicate will be ignored
        System.out.println(hs); // [10, 20, 30, 15]
        hs.remove(15);
        System.out.println(hs); // [10, 20, 30]
        System.out.println(hs.contains(15)); // false
        System.out.println(hs.size()); // 3
        Iterator<Integer> iterator = hs.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        } // 20, 10, 30

        LinkedHashSet<Student> s = new LinkedHashSet<>(3);
        Student s1 = new Student(1, "anish");
        Student s2 = new Student(2, "manish");
        Student s3 = new Student(1, "manisha");
        // student s1 and s3 has same roll so, it should be duplicate and not inserted
        s.add(s1);
        s.add(s2);
        s.add(s3);
        // after overriding equals() and hashCode() [{roll=1, name='anish'}, {roll=2, name='manish'}]
        System.out.println(s);
    }
}
