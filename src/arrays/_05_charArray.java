package arrays;

import sun.font.FontRunIterator;

import java.util.Arrays;

public class _05_charArray {
    public static void main(String[] args) {

                /*
        TASK-1
        Create a char array and store values below
        #
        $
        5
        A
        b
        H

        Print the array

        EXPECTED:
        [#, $, 5, A, b, H]
         */

        char[] characters = {'#','$', '5', 'A', 'b', 'H'};

        System.out.println(Arrays.toString(characters));

        /*
                    TASK-2
        Print the size of the array with a message

        EXPECTED:
        The size of the array is = 6
         */

        System.out.println("The size of the Array is = " + characters.length);



            /*
            TASK-3
            Print each element using fori loop

            EXPECTED:
            #
            $
            5
            A
            b
            H
            */


        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i]);
        }

        /*
          TASK-4
            Print each element using for each loop

            EXPECTED:
            #
            $
            5
            A
            b
            H
         */

        for (char element: characters) {
            System.out.println(element);
        }
        /*
         TASK-5
            Print each element that are letters in for each loop then fori loop

            EXPECTED:
            A
            b
            H
         */

        for (char character: characters) {
            if(Character.isLetter(character))System.out.println(character);
        }
        for (int i = 0; i < characters.length ; i++) {
            if(Character.isLetter(characters[i])) System.out.println(characters[i]);
        }

        /*
        TASK-6
        Count how many uppercase characters you have in the array using for each then fori loops

        EXPECTED:
        2
         */
        int Count1 = 0;

        for (char character: characters) {
            if(Character.isUpperCase(character))Count1++;
        }
        System.out.println(Count1);
        int Count2 = 0;

        for (int i = 0; i < characters.length ; i++) {
            if(Character.isUpperCase(characters[i])) Count2++;
        }
        System.out.println(Count2);
    }

    /*
    ADDITIONAL TASKS
    Count lowercase, specials, digits, spaces
     */


}

