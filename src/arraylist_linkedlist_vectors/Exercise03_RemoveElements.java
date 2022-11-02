package arraylist_linkedlist_vectors;

import java.util.LinkedList;
import java.util.List;

public class Exercise03_RemoveElements {
    public static void main(String[] args) {
        List<String> languages = new LinkedList<>();
        languages.add("Java");
        languages.add("JavaScript");
        languages.add("C#");
        languages.add("Python");
        languages.add("C++");

        /*
        Task
        Remove all elements that starts with J and print the list

        Expected Output:
        [C#, Python, C++]
         */

        /*
        for (String language : languages) {
            if(language.startsWith("J")) languages.remove(language);
        }

         */

        /*
        for (int i = 0; i < languages.size(); i++) {
            if(languages.get(i).startsWith("J")){
                languages.remove(languages.get(i));
                i--;
            }
        }
         */

        languages.removeIf(element -> !element.startsWith("C"));
        System.out.println(languages.size()); // 2
    }
}