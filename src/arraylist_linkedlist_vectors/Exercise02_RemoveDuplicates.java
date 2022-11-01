package arraylist_linkedlist_vectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Exercise02_RemoveDuplicates {
    public static void main(String[] args) {

        /*
        Assume that you have an ArrayList of languages as below -- THIS IS A INTERVIEW QUESTION
        Java
        JavaScript
        Ruby
        Go
        Java
        Ruby
        Java

        Expected output:
        [Java, JavaScript, Ruby, Go]

        Uniques
         */

        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "JavaScript","Ruby", "Go", "Java", "Ruby", "Java"));
        ArrayList<String> uniques = new ArrayList<>();

        for (String language : languages) {
            if(!uniques.contains(language)) uniques.add(language);
        }
        System.out.println(uniques);
    }

}
