package arrays;

import java.util.Arrays;

public class _11_charArray_Recap {
    public static void main(String[] args) {
        //Create a char array with will hold your name's letters both ways (new keyword, curly brackets)
        // ['S', 'a', 'l', 'i, 'h']

        char[] initials = new char[5];
        System.out.println(Arrays.toString(initials));
        initials[0] = 'S';
        initials[1] = 'a';
        initials[2] = 'l';
        initials[3] = 'i';
        initials[4] = 'h';
        char [] initials2 = {'S','a', 'l', 'i', 'h'};
        System.out.println(Arrays.toString(initials));
        System.out.println(Arrays.toString(initials2));

        initials[0] = 's';
        initials[0] = initials[4];
        initials[2] = initials[4];
        System.out.println(Arrays.toString(initials));

        // Salih
        char [] initials3 = {'N','e', 'w', 'e', 'r'};
        System.out.println(Arrays.toString(initials3));

        for (char initial:initials3) {
            System.out.print(initial);

            for (int i = 0; i < initials3.length; i++) {
                System.out.println(initials2[i]); // fix this
            }
        }
    }
}
