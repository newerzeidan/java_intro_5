package arrays;

import java.util.Arrays;

public class _01_StringArray {
    public static void main(String[] args) {

        // 1. Declare a String array called as countries and assign size of 3

        String[] countries = new String[3];

         // 2. assigning values to specific indexes
        countries[1] = "Spain";

        // 3. Print a specific index from an array
        System.out.println(countries[0]); // null
        System.out.println(countries[1]); // spain
        System.out.println(countries[2]); // null

        //4. Printing an array
        System.out.println(Arrays.toString(countries));

        /*
        Assign Belgium to index of 2 and print the arrays once again
         */

        countries[2] = "Belgium";

        System.out.println(Arrays.toString(countries)); // [null, Spain, Belgium]

        // 5. Update existing element

        countries[1] = "France";

        System.out.println(Arrays.toString(countries)); // [null, France, Belgium]


        //6. Getting a length of an array - how many elements - 3

        System.out.println(countries.length); //3


        // 7. Printing each element separately
        /*
        null
        France
        Belgium
         */
        countries[2] = "Belgium";

        System.out.println(countries[0]); // null
        System.out.println(countries[1]); // France
        System.out.println(countries[2]); // Belgium


        for (int i = 0; i <=2; i++) {
            System.out.println("Countries at index of " + i + " is = " + countries[i]);
        }


    }
}
