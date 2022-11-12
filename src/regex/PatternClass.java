package regex;

import utilities.ScannerHelper;

import java.util.Arrays;
import java.util.regex.Pattern;

public class PatternClass {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-z0-9]{5,10}");

        System.out.println(pattern); // [a-z0-9]{5,10} returns the pattern
        System.out.println(pattern.pattern()); // [a-z0-9]{5,10}  returns pattern as the string
        System.out.println(pattern.toString()); // [a-z0-9]{5,10}  returns pattern as the string

        System.out.println(Pattern.matches(pattern.pattern(),"Apple"));  // false due to capital "A"
        System.out.println(Pattern.matches(pattern.pattern(),"hello world"));  // false due to space and it is long

        String str = "I go to school at TechGlobal and I love it";
        String [] arr = str.split(" [a-z0-9]{5,10}");

        System.out.println(Arrays.toString(arr));

        System.out.println("\n---------Task 1 -----------\n");
        String userName= ScannerHelper.getAName();
        Pattern pattern1 = Pattern.compile("[a-zA-Z0-9]{5,10}");

        if(userName.matches("[a-zA-Z0-9]{5,10}")) System.out.println("Valid Username");
        else System.out.println("ERROR! Username must be 5 to 10 characters long and can only contains letters and numbers.");



    }
}
