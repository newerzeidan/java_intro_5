package arraylist_linkedlist_vectors;

import java.util.ArrayList;

public class _03_IntegerArrayList {
    public static void main(String[] args) {

        /*
        Create an ArrayList to store numbers below
        10
        15
        20
        10
        20
        30
        Print the ArrayList
        Print the size

        Expected:
        [

         */

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers);
        System.out.println(numbers.size());

        numbers.remove(10); //  // takes it as an index // out of bound

        numbers.remove((Integer)10); // takes the object 10 then you have to cast/ wrap it


        System.out.println("\n------contains() method -------\n");

      numbers.contains(numbers.contains(10)); // true
      numbers.contains(numbers.contains(12)); // false
      numbers.contains(numbers.contains(20)); // true
      numbers.contains(numbers.contains(22)); // false


        System.out.println("\n-----indexOf() method -------\n");

        System.out.println(numbers.lastIndexOf(30)); // 5
        System.out.println(numbers.lastIndexOf(35)); // -1
        System.out.println(numbers.lastIndexOf(10)); // 3


        System.out.println("\n----------Retrieving each element with fori loop ----------\n");

        numbers.get(0);
        numbers.get(1);
        numbers.get(2);
        numbers.get(3);
        numbers.get(4);
        numbers.get(5);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("\n----Retrieving each element with for each loop-----\n");

        for(Integer number : numbers){
            System.out.println(number);
        }
    }

}
