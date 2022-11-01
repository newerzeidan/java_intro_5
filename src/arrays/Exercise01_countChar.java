package arrays;

public class Exercise01_countChar {
    public static void main(String[] args) {
        /*
            Assume you are given as below

            String word = "Java";

            Count how many "a" letters you have in the String

            EXPECTED:
            2
         */

        String word = "Java";

        int countA = 0;

        for (int i = 0; i < word.length() ; i++) {
            if(word.charAt(i) == 'a') countA++;

        }
        System.out.println(countA);

        String word1 = "Java"; // [J, a, v, a]

        int countB = 0;

        for(char element : word.toCharArray()){
            if(element == 'a') countB++;
        }

        System.out.println(countB);

    }
}
