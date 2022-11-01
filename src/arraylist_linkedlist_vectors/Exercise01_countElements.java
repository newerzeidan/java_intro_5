package arraylist_linkedlist_vectors;

import javax.swing.*;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercise01_countElements {
    public static void main(String[] args) {

        /*
        Create an ArrayList and store below colors
        Blue
        Brown
        Pink
        Yellow
        Red
        Purple

        Print the ArrayList
        Print the size
        Print each element separately

        Expected:
        [Blue, Brown, Pink, Yellow, Red, Purple]

        6

        Blue
        Brown
        Pink
        Yellow
        Red
        Purple
         */

        System.out.println("\n------Task-1------\n");
/// String []
///ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue","Brown","Pink","Yellow", "Red", "Purple"));
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Brown");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Purple");

        System.out.println(colors);
        System.out.println(colors.size());

        for (String color : colors) {
            System.out.println(color);
        }

        /*
        Count the elements that has a length of 6

        Expected:
        2
         */
        System.out.println("\n------Task 2------\n");

        int counter1 = 0;

        for (int i = 0; i < colors.size(); i++) {
            if (colors.get(i).length() == 6) counter1++;
        }
        System.out.println(counter1);


        System.out.println("\n---- for each loop (use this one) -----\n");
        int count6 = 0;

        for (String color : colors) {
            if (color.length() == 6) count6++;
        }
        System.out.println(count6);


        /*
        Count the elements that have 'o'
        //Brown and Yellow

         */
        System.out.println("\n--------Task3----------\n");

        int counter3 = 0;

        for (String color : colors) {
            if (color.contains("o")) counter3++;
        }
        System.out.println(counter3);

        System.out.println("\n------fori-loop-----\n");
        int counter3i = 0;
        for (int i = 0; i < colors.size(); i++) {
            if(colors.get(i). toLowerCase().contains("o"))counter3i++;

        }
        System.out.println(counter3i);
    }
    }
