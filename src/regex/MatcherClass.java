package regex;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClass {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("[a-zA-Z0-9]{5,10}");
        Matcher matcher = pattern.matcher("hello");
        System.out.println(matcher.matches()); // true


        System.out.println("\n---An Example---");
        pattern = Pattern.compile("SDET");
        matcher = pattern.matcher("TechGlobal provides students a complete SDET and SDET and SDET");
        System.out.println(matcher.find()); // finds if SDET is in the string
        System.out.println(matcher.group()); // finds if it exists and prints it
        System.out.println("Starting index: " + matcher.start()); // finds and prints the index of the first usage of pattern
        System.out.println("Ending index: " + matcher.end()); // finds and prints the index of the last usage of pattern


        System.out.println("\n---Example using While Loop---");

        int counter = 0;

        while(matcher.find()){
            counter++;
            System.out.println(matcher.group());
            System.out.println(matcher.start());
            System.out.println(matcher.end());
        }
        System.out.println(counter);


        System.out.println("\n---Exercise 01---");
        Scanner input = new Scanner(System.in);
        System.out.println("Hey User, please enter a sentence: ");
        String sentence = input.nextLine();

        pattern = Pattern.compile("[A-Za-z]{1,}");
        matcher = pattern.matcher(sentence);

        int wordCount = 0;

        while(matcher.find()){
            System.out.println(matcher.group());
            wordCount++;
        }
        System.out.println("This sentence contains " + wordCount + " words");

        System.out.println("\n-------Task in class--------\n");
        System.out.println(Pattern.matches("[A-Za-z0-9_-]{9,15}", "Tech_Global-"));
       // pattern = Pattern.compile("[A-Za-z0-9_-]{9,15}"); // creating a regex with MORE THAN 8 and NO MORE THAN 15.
    }
}