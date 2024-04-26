package collections.list;

import java.util.*;

/*
  1. preserve order of insertion
  2. grow in size with 50%. new_capacity = old_capacity + (old_capacity/2) => 10 + 10/2 = 15
  3. data structure: array
  4. index based collection
  Constructor:
  1. new ArrayList<Type>() (default size 10)
  2. new ArrayList<Type>(50);
  3. new ArrayList<Type>(Collection c)
  Methods:
  1. add:  add(obj), add(index, obj)
  2. remove: remove(obj), remove(index)
  3. update: set(index, obj)
  4. get: get(index)
  5. search object: contains(obj)
  6. size: size()
  7. is empty array list: isEmpty()
  Iterate: fail-fast
  ListIterator<String> iterator = l.listIterator();
  while(iterator.hasNext()){
    System.out.print(iterator.next() + " ");
  }
*/
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        //al.add(3, 30);  RE: Index: 3, Size: 1
        al.add(1, 20); // [10, 20]
        al.add(1, 30); // [10, 30, 20]
        al.set(1, 20);
        al.set(2, 30); // [10, 20 , 30]
        //al.set(4, 40); RE: Index 4 out of bounds for length 3
        System.out.println(al.get(1)); // 20 get the value of given index
        al.remove(Integer.valueOf(30)); // remove object
        al.remove(1); // remove object from given index
        System.out.println(al); // [10]

        List<String> l = new ArrayList<>(3);
        l.add("abc");
        l.add("abcde");
        l.add("abcd");
        // sort this array list by using length of object in reverse order ["abcde", "abcd", "abc"]
        Collections.sort(l); // ["abc", "abcd", "abcde"]
        System.out.println(l);
        Collections.sort(l, new Comparator<String>() {
            @Override
            public int compare(String obj1, String obj2) {
                return obj2.length() - obj1.length();
            }
        });
        System.out.println(l);
        // the same can be written as
        Collections.sort(l, (obj1, obj2) -> obj2.length() - obj1.length());
        System.out.println(l);

        for(String name: l){
            System.out.println(name);
        }
        /*
          why using iterator, over for each? because this is fail fast
          Fail-Fast iterators immediately throw ConcurrentModificationException if there is structural
          modification of the collection. Structural modification means adding, removing any element
          from collection while a thread is iterating over that collection.
         */
        ListIterator<String> iterator = l.listIterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        // get the size of an array list
        System.out.println(l.size());
        // search elements in arraylist
        System.out.println(l.contains("abcdef"));
        // check whether array list is empty or not
        System.out.println(l.isEmpty()); // false
    }
}
