package collections.set;

import java.util.Objects;

public class Student {
    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return roll == student.roll;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll);
    }
}
