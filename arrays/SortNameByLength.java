package collections.arrays;

import java.util.Arrays;
import java.util.Comparator;

class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}
public class SortNameByLength {
    public static void main(String[] args) {
        String[] names = {"anish", "manisha", "mayank"};
        // By default, here String class compareTo method use hoga
        // that will not work with length logic, so we have override String class
        // compareTo method that is not logical, so go with custom logic and use Comparator
        Arrays.sort(names, new LengthComparator());
        System.out.println(Arrays.toString(names));
    }
}
