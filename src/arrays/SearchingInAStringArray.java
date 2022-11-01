package arrays;

import java.util.Arrays;

public class SearchingInAStringArray {
    public static void main(String[] args) {
        String[] objects = {"Remote", "Mouse", "Mouse", "Keyboard", "iPad"};

        /*
        Task-1
        Check the collection you have above and print true if it contains Mouse
        Print false otherwise

        Result:
        true
         */
        System.out.println("\n----foreach loops----\n");

        boolean hasMouse = false;
        for(String object : objects) {
            if (object.equals("Mouse")){
                hasMouse = true;
                break;
            }
        }
        System.out.println(hasMouse);

        System.out.println("\n----Binary Search----\n");
        Arrays.sort(objects);

        System.out.println(Arrays.binarySearch(objects, "Mouse") >= 0); // true
        System.out.println(Arrays.binarySearch(objects, "Computer") >= 0); //false
        System.out.println(Arrays.binarySearch(objects, "iPad") >= 0); //true


    }
}
