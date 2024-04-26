package collections.set;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;


public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(40);
        ts.add(10);
        ts.add(50);
        System.out.println(ts); // [10, 40, 50]
        // It will take Comparator for sorting
        TreeSet<Integer> rts = new TreeSet<>(Collections.reverseOrder());
        rts.add(40);
        rts.add(10);
        rts.add(50);
        System.out.println(rts); // [50, 40, 10]

        // Store student in reverse order of roll
        TreeSet<Student> tss = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student student, Student student1) {
                return student1.roll - student.roll;
            }
        });
        Student s1 = new Student(3, "anish");
        Student s2 = new Student(2, "manish");
        Student s3 = new Student(1, "manisha");
        tss.add(s1);
        tss.add(s2);
        tss.add(s3);
        // [{roll=3, name='anish'}, {roll=2, name='manish'}, {roll=1, name='manisha'}]
        System.out.println(tss);
    }
}
