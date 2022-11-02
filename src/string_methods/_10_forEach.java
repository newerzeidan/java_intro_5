package arraylist_linkedlist_vectors;

import java.util.ArrayList;
import java.util.Arrays;

public class _10_forEach {
    public static void main(String[] args) {
        /*
        Create an ArrayList to store below colors

        Blue
        Red
        Brown
        Pink
        Yellow
        Black

        Print the ArrayList
         */

        String[] arr1 = {"Blue", "Red", "Brown", "Pink", "Yellow", "Black"};
        ArrayList<String> colors = new ArrayList<>(Arrays.asList(arr1));
        System.out.println(colors);


        System.out.println("\n---Iterating with Fori---");
        for(int i = 0; i < colors.size(); i++){
            System.out.println(colors.get(i));
        }


        System.out.println("\n---Iterating with For Each Loop---");
        for (String color : colors) {
            System.out.println(color);
        }


        System.out.println("\n---Iterating with forEach---");
        colors.forEach(System.out::println);
    }
}