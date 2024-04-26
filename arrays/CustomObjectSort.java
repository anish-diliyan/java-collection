package collections.arrays;

import java.util.Arrays;
import java.util.Comparator;

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp2.getName().compareTo(emp1.getName());
    }
}
class  Employee implements  Comparable<Employee>{
    private  String name;
    private int age;
    private int salary;

    public String getName() {
        return name;
    }

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    // sort on basis of salary ascending order
    public int compareTo(Employee emp) {
        return this.salary - emp.salary;
    }
}
public class CustomObjectSort {
    public static void main(String[] args) {
        Employee[] emp = new Employee[3];
        emp[0] = new Employee("anish", 30, 1000);
        emp[1] = new Employee("manish", 20, 500);
        emp[2] = new Employee("manisha", 30, 1500);
        /*
          If emp does not override compareTo then error
          class collections.arrays.Employee cannot be cast to class java.lang.Comparable
         */
        Arrays.sort(emp);
        /*
          [
            {name='manish', age=20, salary=500},
            {name='anish', age=30, salary=1000},
            {name='manisha', age=30, salary=1500}
          ]
         */
        System.out.println(Arrays.toString(emp));
        /*
          Arrays.sort(emp) uses compareTo method of employee, this is defined in
          employee class as default sorting logic of employee, what if we do not need
          default sorting logic?
          Go for Comparator compare method and define custom logic of sorting.
         */
        /*
          [
            {name='manisha', age=30, salary=1500},
            {name='manish', age=20, salary=500},
            {name='anish', age=30, salary=1000}
          ]
         */
        Arrays.sort(emp, new NameComparator());
        System.out.println(Arrays.toString(emp));
    }
}
