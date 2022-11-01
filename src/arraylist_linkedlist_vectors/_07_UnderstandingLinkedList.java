package arraylist_linkedlist_vectors;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class _07_UnderstandingLinkedList {
    public static void main(String[] args) {
        LinkedList<Double> numbers = new LinkedList<>(Arrays.asList(10.5, 5.5, 20.0));

        System.out.println(numbers); // [10.5, 5.5, 20.0]
        System.out.println(numbers.size()); // 3
        System.out.println(numbers.contains(10.5)); // true
        System.out.println(numbers.contains(4)); // -1
        System.out.println(numbers.contains(1)); // 5.5

        System.out.println(numbers.getFirst()); // 10.5
        System.out.println(numbers.getLast()); // 20.0 // this locates the last number
        System.out.println(numbers.offer(4.5)); // offer adds to the last index


        System.out.println(numbers.pop()); // 4.5
        System.out.println(numbers); // [10.5, 5.5,

LinkedList<Integer> numbers1 = new LinkedList<>(Arrays.asList(10, -3, 5, 15));
    List<String> objects = new LinkedList<>(Arrays.asList("Remote", "Phone", "Laptop"));

System.out.println("\n-------BEFORE SORT------\n");
        System.out.println(numbers1);
        System.out.println(objects);

        Collections.sort(numbers1);
        Collections.sort(objects);

        System.out.println("\n-------AFTER SORT------\n");
        System.out.println(numbers1);
        System.out.println(objects);

        }}
