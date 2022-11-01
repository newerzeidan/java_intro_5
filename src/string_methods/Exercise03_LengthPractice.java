package string_methods;

import utilities.ScannerHelper;

public class Exercise03_LengthPractice {
    public static void main(String[] args) {
        /*
        Write a Java program that asks users to enter 2 Strings
        And store answers of user in different Strings
        Finally, print the length of those Strings with proper messages

        Assume user entered "Java" and "C#"

        EXPECTED OUTPUT:
        The length of the first String = 4
        The length of the second String = 2
         */

        String s1 = ScannerHelper.getAString();
        String s2 = ScannerHelper.getAString();

        System.out.println("The length of the first string is = " + s1.length());
        System.out.println("The length of the second string is = " + s2.length());


    }
}
