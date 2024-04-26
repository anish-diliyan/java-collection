package collections.arrays;

/*
   Advantage:
     1. Easy to use
     2. Fast insertion at the end of array
     3. An array element can be accessed in constant time
   Disadvantage:
     1. Array in fixed size and con not grow in memory once allocated
     2. Insertion in the middle requires shifting of element
     3. Since array requires linear memory block, such blocks might not be available
     if the array size is too large.
 */
public class Arrays {
    public static void main(String[] args) {
        int[] arr; // declare the array
        arr = new int[2]; // initialize the array with default value
        arr[0] = 10; // assign value at the array index
        arr[1] = 20;
        System.out.println(arr[0]);
        System.out.println(arr.length);

        // shortcut way to declare initialize and assign value
        String[] cars = {"volvo", "bmw", "ford", "mazda"};
        for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }
        // for each car in cars
        for(String car: cars){
            System.out.println(car);
        }
    }
}
