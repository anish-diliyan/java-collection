package collections.set;

import java.util.HashSet;
import java.util.Set;


public class HashSetExample {
    public static void studentSet() {
        HashSet<Student> s = new HashSet<>(3);
        Student s1 = new Student(1, "anish");
        Student s2 = new Student(2, "manish");
        Student s3 = new Student(1, "manisha");
        // student s1 and s3 has same roll so, it should be duplicate and not inserted
        s.add(s1);
        s.add(s2);
        s.add(s3);
        //[{roll=2, name='manish'}, {roll=1, name='anish'}, {roll=1, name='manisha'}]
        // after overriding equals() and hashCode() [{roll=1, name='anish'}, {roll=2, name='manish'}]
        System.out.println(s);
    }
    public static void integerSet() {
        Set<Integer> hs1 = new HashSet<>();
        hs1.add(10);
        hs1.add(20);
        hs1.add(30);
        System.out.println(hs1); // [20, 10, 30]
        Set<Integer> hs2 = new HashSet<>();
        hs2.add(40);
        hs2.add(20);
        hs2.add(10);
        System.out.println(hs2); // [20, 40, 10]
        // intersection
        hs1.retainAll(hs2);
        System.out.println(hs1); // [20, 10]

        hs1.removeAll(hs2);
        System.out.println(hs1); // []
    }
    public static void main(String[] args) {
        //integerSet();
        studentSet();
    }
}
