package arraylist_linkedlist_vectors;

import java.util.ArrayList;

public class _02_StringArrayList {
    public static void main(String[] args) {

        /*
        Create an ArrayList and store below cities in it
        Chicago
        Berlin
        Miami

        Print the size of the ArrayList
        Print the ArrayList
         */

        System.out.println("\n-----Task-1-----\n");


        ArrayList<String> cities = new ArrayList<>(); //capacity is 10

        cities.add("Chicago");
        cities.add("Berlin");
        cities.add("Miami");

        System.out.println("The size of the ArrayList is = " + cities.size());
        System.out.println("The ArrayList = " + cities);



        /*
        Task
        Update Miami to be Evanston
        Print the ArrayList

        Expected: [Chicago, Berlin, Evanston]
         */

        cities.set(2, "Evanston");
        System.out.println(cities);


        /*
        Task 3

         */

        cities.remove(1);
        ///cities.remove("Berlin"); you can also do it this way
        System.out.println(cities);

        System.out.println(cities.size());

        System.out.println(cities.remove(0)); // Chicago

        System.out.println(cities.remove("evanston")); // false

        System.out.println(cities); // [Evanston]
        System.out.println(cities.size()); // 1

        /*
        Task 4
        Add below cities to ArrayList
        New York
        Rome
        Gent

        Print the ArrayList
        Print the Size

         */

        cities.add("New York");
        cities.add("Rome");
        cities.add("Ghent");

        System.out.println(cities);
        System.out.println(cities.size());

        // how to delete the entire ArrayList
        cities.clear();
        cities.removeAll(cities); // Another way to clear ArrayList
        System.out.println(cities);



    }
}
