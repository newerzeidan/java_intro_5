package arrays;

import jdk.nashorn.internal.runtime.ConsString;

public class Exercise02_countWords {
    public static void main(String[] args) {
        /*
            Assume that you are given below String

            String sentence = "I love arrays"

            Count how many words you have in this String

            Expected: 3
         */

        String sentence = "I love arrays";

        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') count++;
        }

        System.out.println(count + 1);
    }
}
