package practice.arrayListPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainsApple {
    public static void main(String[] args) {
        ArrayList<String> fruits1 = new ArrayList<>(Arrays.asList("banana", "orange", "Apple"));
        ArrayList<String> fruits2 = new ArrayList<>(Arrays.asList("banana", "orange", "apple"));
        ArrayList<String> fruits3 = new ArrayList<>(Arrays.asList("pineapple", "banana", "orange", "grapes"));

        System.out.println("---containsApple---");
        System.out.println(containsApple(fruits1)); // true
        System.out.println(containsApple(fruits2)); // true
        System.out.println(containsApple(fruits3)); // false

        System.out.println("\n---containsAppleEasier---");
        System.out.println(containsAppleEasier(fruits1)); // true
        System.out.println(containsAppleEasier(fruits2)); // true
        System.out.println(containsAppleEasier(fruits3)); // false
    }

    /*
    Create a public static method which will take an ArrayList then it will check if it contains "apple"

    NOTE: IGNORE CASES (use .toLowerCase)

    Example:
        ArrayList -> {"banana", "orange", "Apple"} -> true
        ArrayList -> {"banana", "orange", "apple"} -> true
        ArrayList -> {"pineapple", "banana", "orange", "grapes"} -> false
     */
    public static boolean containsApple(ArrayList<String> fruits){
        for (String element : fruits) {
            if(element.toLowerCase().equals("apple")) return true;
        }
        return false;
    }

    public static boolean containsAppleEasier(ArrayList<String> fruits){
        // it will fail with -> "APPLE", "AppLe"
        return fruits.contains("apple") || fruits.contains("Apple");
    }
}