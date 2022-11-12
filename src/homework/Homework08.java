package homework;

import utilities.ScannerHelper;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework08 {
    public static void main(String[] args) {

        System.out.println("-----Task 1 -----");
        System.out.println(countConsonants("hello"));

        System.out.println("-----Task 2 -----");
        System.out.println(wordArray("Lets remove all * the ex#ra Spaces and Chars in HEre."));

        System.out.println("-----Task 3 -----");
        System.out.println(removeExtraSpaces("Java   is fun"));

        System.out.println("-----Task 4 -----");
        System.out.println(count3OrLess());

        System.out.println("-----Task 5 -----");
        System.out.println(isDateFormatValid("01/20/2001"));

        System.out.println("-----Task 6 -----");
        System.out.println(isEmailFormatValid("newerzeidan@yahoo.com"));


    }
        //Task 1
    public static int countConsonants(String str ){
        str = str.replaceAll("[^A-Za-z]", "");
        str = str.replaceAll("[AEIOUaeiou]", "");

        return str.length();
        }
    //Task 2
    public static String wordArray(String str){
        str = removeExtraSpaces(str);
        str = str.replaceAll("[^A-Za-z ]", "");
        return Arrays.toString(str.split(" "));
    }


    //Task 3
    public static String removeExtraSpaces(String str){
        str = str.replaceAll("[\\s]{1,}", " ");

        return str;
    }

    //Task 4
    public static int count3OrLess(){
       String str = ScannerHelper.getAString();
        int counter = 0;
        str = str.replaceAll("[^A-Za-z ]", "");
        String[] arr = str.split(" ");
        for (String s : arr) {
            if(s.length() <= 3) counter++;
        }
      return counter;
    }
    //Task 5
    public static boolean isDateFormatValid (String str){
        Pattern pattern = Pattern.compile("[0-9]{2}/[0-9]{2}/[0-9]{4}");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    //Task 6
    public static boolean isEmailFormatValid (String str){
      Pattern pattern = Pattern.compile("[\\w.]{2,}@[\\w.[^_]]{2,}\\.[\\w[^_]]{2,}");
      Matcher matcher = pattern.matcher(str);

      return matcher.matches();

    }

}
