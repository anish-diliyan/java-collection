package collections.arrays;

import java.util.Arrays;
import java.util.Collections;

/*
 Internally sort method uses compareTo method.
 compareTo method belongs to Comparable interface.
 it ensures that if compareTo returns:
   - => obj1 will come before obj2
   + => obj2 will come before obj1
   0 => no sorting
 For String and Wrapper classes compareTo method return obj1-obj2.
*/
public class ArraySort {
    public static void f2(){
        String[] fruits = {"orange", "grape", "apple", "lemon", "banana"};
        Arrays.sort(fruits, Collections.reverseOrder());
        System.out.println(Arrays.toString(fruits));
    }
    public static void f1(){
        int[] numbers = {4, 9, 1, 3, 2, 8, 7, 0, 6, 5};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    public static void main(String[] args) {
       f1();
       f2();
    }
}
