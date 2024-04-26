package collections.queue;

import java.util.PriorityQueue;

class Student implements Comparable<Student>{
    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public int compareTo(Student student) {
        return this.roll - student.roll;
    }

    @Override
    public String toString() {
        return "{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}
public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(10);
        pq.offer(0);
        pq.offer(8);
        pq.offer(7);
        pq.offer(9);
        System.out.println(pq); //[0, 7, 8, 10, 9] highest priority will come first in queue
        System.out.println(pq.peek()); // [0]
        pq.poll();
        System.out.println(pq); // [7, 9, 8, 10]

        PriorityQueue<Student> s = new PriorityQueue<>();
        Student s1 = new Student(1, "anish");
        Student s2 = new Student(2, "manish");
        s.offer(s1);
        s.offer(s2);
        System.out.println(s); // [{roll=1, name='anish'}, {roll=2, name='manish'}]
        System.out.println(s.peek()); // {roll=1, name='anish'}
        s.poll();
        System.out.println(s); // [{roll=2, name='manish'}]
    }
}
