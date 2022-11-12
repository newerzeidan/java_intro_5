package regex;

import java.util.regex.Pattern;

public class Exercises {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[A-Za-z0-9_-]{8,15}", "JohnDoe_123")); //true
        System.out.println(Pattern.matches("[\\w-]{8,15}", "JohnDoe_123")); //true
        System.out.println(Pattern.matches("[\\d]{3}-[\\d]{2}-[\\d]{4}", "000-00-0000")); //true
        System.out.println(Pattern.matches("[(]?[\\d]{3}[)]?-[\\d]{3}-[\\d]{4}",("(708)-000-0000"))); // true


        System.out.println("\n---Exercise 3---");
        //How much wood would a wood chuck chuck if a wood chuck could chuck wood
        // replace wood with ****
        // How much **** would a **** chuck chuck if a **** chuck could chuck ****

        String str = "How much wood would a wood chuck chuck if a wood chuck could chuck wood";
        System.out.println(str.replaceAll("wood", "****"));
        System.out.println(str.replace("wood", "****"));

        System.out.println("\n---Exercise 4---");
        String str1 = "abc 123 $#^";


    }
}

