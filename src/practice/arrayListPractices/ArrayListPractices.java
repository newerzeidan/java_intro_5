package practice.arrayListPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractices {
    public static void main(String[] args) {
        /*
        1. Create an ArrayList and assign 5 numbers
            example: [1, 2, 3, 4, 5]
        2. Create a loop which will replace every "2" with 7
            example: [1, 7, 3, 4, 5]
        3. Remove if the number is divisible by 2
            example: [1, 7, 3, 5]
            NOTE: USE ITERATOR
        4. As the last step, add three 10's to the ArrayList
            example: [1, 7, 3, 5, 10, 10, 10]
         */

        System.out.println("---Step 1---");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(numbers); // [1, 2, 3, 4, 5]


        System.out.println("\n---Step 2---");
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) == 2) numbers.set(i, 7);
        }
        System.out.println(numbers); // [1, 7, 3, 4, 5]


        System.out.println("\n---Step 3---");
        numbers.removeIf(x -> x % 2 == 0);
        System.out.println(numbers); // [1, 7, 3, 5]


        System.out.println("\n---Step 4---");
        for (int i = 0; i < 3; i++) {
            numbers.add(10);
        }
        System.out.println(numbers); // [1, 7, 3, 5, 10, 10, 10]
    }
}