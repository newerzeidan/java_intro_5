package practice.methods;

public class MethodPractices {
    public static void main(String[] args) {
        System.out.println("---Printing String Descriptions with a custom Method---");
        printStringDesc("John");
        System.out.println();
        printStringDesc("");
        System.out.println();
        printStringDesc("JavaScript");
        System.out.println();
        printStringDesc("Scrpt");

        System.out.println("\n---Printing middle character(s) with a custom method---");
        MethodPractices.printMiddle("toyota"); // yo
        MethodPractices.printMiddle("civic"); // v
        MethodPractices.printMiddle("ci"); // Length is less than 3

        System.out.println("\n---Printing first, last and middle with a custom method---");
        System.out.println("Java:");
        MethodPractices.printFirstLastMiddle("Java");
        System.out.println("J:");
        MethodPractices.printFirstLastMiddle("J");
        System.out.println("JavaScript:");
        MethodPractices.printFirstLastMiddle("JavaScript");

        System.out.println("\n---Printing if first and last 2 characters are the same with a custom method---");
        MethodPractices.printIsFirstLastTwoSame("xyxy"); // true
        MethodPractices.printIsFirstLastTwoSame("abcdef"); // false
        MethodPractices.printIsFirstLastTwoSame("a"); // less than 2
    }

    public static void printStringDesc(String str) {
        /*
        Create a public static method named "printStringDesc" that takes input as a String and prints
        the length, first char, last char, and checks if it has any vowels. If the string is empty print Length is zero
         */
        if (str.isEmpty()) {
            System.out.println("Length is zero");
        } else {
            System.out.println("Length is = " + str.length());
            System.out.println("First char is = " + str.charAt(0));
            System.out.println("Last char is = " + str.charAt(str.length() - 1)); // str.substring(str.length() - 1)

            if (str.toLowerCase().contains("a") || str.toLowerCase().contains("e") ||
                    str.toLowerCase().contains("i") || str.toLowerCase().contains("o") || str.toLowerCase().contains("u")) {
                System.out.println("This string has vowel");
            } else {
                System.out.println("This string doesn't have a vowel");
            }
        }
    }

    /*
    Create a public static method named "printHasVowel" that takes input as a String and checks if the input contains a vowel
    if not, print The string doesn't have a vowel
     */
    public static void printHasVowel(String str){
        if (str.toLowerCase().contains("a") || str.toLowerCase().contains("e") ||
                str.toLowerCase().contains("i") || str.toLowerCase().contains("o") || str.toLowerCase().contains("u")) {
            System.out.println("This string has vowel");
        } else {
            System.out.println("This string doesn't have a vowel");
        }
    }

    /*
    Create a public static method named "printMiddle" that takes a input as a String and checks if it is even or odd first
    if even, print the middle 2 characters
    if odd, print the middle character
    if less than 3, print Length is less than 3
     */
    public static void printMiddle(String str){
        if(str.length()< 3){
            System.out.println("Length is less than 3");
        } else{
            if(str.length() % 2 == 0){
                System.out.println(str.substring(str.length() / 2 - 1, str.length() / 2 + 1));
            }
            else{
                System.out.println(str.charAt(str.length() / 2));
            }
        }
    }

    /*
    Create a public static method named "printFirstLastMiddle" that takes an input as a String and
     */
    public static void printFirstLastMiddle(String input){
        if(input.length() < 4){
            System.out.println("INVALID INPUT");
        } else{
            System.out.println("First 2 characters are = " + input.substring(0,2)); // printing 1st 2 chars
            System.out.println("Last 2 characters are = " + input.substring(input.length() - 2));
            System.out.println("The other characters are = " + input.substring(2, input.length() - 2));
        }
    }

    /*
    Create a public static method named "printIsFirstLastTwoSame" that takes an input as a String and
    check if the first and last 2 chars are the same.
     */
    public static void printIsFirstLastTwoSame(String word){
        if(word.length() < 2){
            System.out.println("Length is less than 2");
        } else{
            System.out.println(word.substring(0, 2).equals(word.substring(word.length() - 2)));
        }
    }
}