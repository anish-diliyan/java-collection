package collections.map;

import java.util.HashMap;
import java.util.Map;


public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "a");
        hm.put(2, "b");
        hm.put(3, "d");
        System.out.println(hm); // {1=a, 2=b, 3=d}
        hm.put(3, "c");
        System.out.println(hm); // {1=a, 2=b, 3=c}
        hm.put(4, "d");
        hm.remove(4); // remove using key, it will not throw exception if key not found
        hm.put(5, "e");
        hm.remove(5, "a"); // it will remove if both key value match
        System.out.println(hm); // {1=a, 2=b, 3=c, 5=e}
        System.out.println(hm.get(4)); // if key not found return default value = null
        // if key not found return default value = "d"
        System.out.println(hm.getOrDefault(4, "d"));
        System.out.println(hm.containsKey(4)); // false
        System.out.println(hm.containsValue("e")); // true
        System.out.println(hm.size()); // 4

        // iterate through entry set
        for(Map.Entry<Integer, String> entry: hm.entrySet()) {
            // 1 : a, 2 : b, 3 : c, 5 : e,
            System.out.print(entry.getKey() + " : " + entry.getValue() + ", ");
        }
        System.out.println();
        // iterate through key set
        for(Integer key : hm.keySet()){
            // 1 : a, 2 : b, 3 : c, 5 : e,
            System.out.print(key + " : " + hm.get(key) + ", ");
        }
        System.out.println();
        for(String value: hm.values()){
            // a, b, c, e
            System.out.print(value + ", ");
        }
    }
}
