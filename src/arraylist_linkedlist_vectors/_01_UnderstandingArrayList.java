package arraylist_linkedlist_vectors;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_UnderstandingArrayList {
    public static void main(String[] args) {


        //1. Declaring an array vs an ArrayList
        String[] names1 = new String[3];


        ArrayList<String> names2 = new ArrayList<>(); //capacity = 10 by default

        //2. Getting the size of the array vs ArrayList
        System.out.println("The size of the array = " + names1.length);
        System.out.println("The size of the ArrayList = " + names2.size());



        //3. Printing an array vs ArrayList
        System.out.println(Arrays.toString(names1)); // [null, null, null]
        System.out.println("TheArraylist = " + names2); // []


        //4. Adding elements to specific indexes
        names1[0] = "Alex";
        names2.add(0,"John"); //names2.add("John");

        System.out.println("\n------Printing array vs ArrayList------\n");
        System.out.println("The array = "  +  Arrays.toString(names1));
        System.out.println("The ArrayList = " + names2);


        /*
        Add Ali and Andrii to names1
        Add Joe and Jane to names2
        Print the names1 and names2 once again
         */

        names1[1] = "Ali";
        names1[2] = "Andrii";

        // finish copying


        /*
        Add below names to ArrayList and print it
        Abdallah
        Saeed
        Suzen
        Hzl
        Yildiz
        Samir

        [John, Joe, Jane, Abdallah, Vlad, Saeed, Suzan, Hazal, Yildiz, Samir]
         */

        names2.add("Abdallah");
        names2.add("Vlad");
        names2.add("Saeed");
        names2.add("Suzen");
        names2.add("haza");
        names2.add("Yildiz");
        names2.add("Samir");

        System.out.println("The ArrayList = " + names2);
        System.out.println("The size of the ArrayList is = " + names2);


        //5. Updating an existing element in a array vs ArrayList
        names1[1] = "Mike";
        names2.set(1, "Olena");

        System.out.println("The array = " + Arrays.toString(names1));
        System.out.println("The array = " + (names2));



    }
}
