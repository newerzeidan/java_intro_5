package string_methods;

public class Exercise04_substring {
    public static void main(String[] args) {
        /*
        Task 1
        Assume that you are given a string
        "The best is Java"
        Write a Java program that extracts "Java" from the given sentence
        And store extracted value in another string
        Finally, print the extracted String
         */

        String s1 = "The best is Java"; // 16 chars
        String s2 = s1.substring(12);

        System.out.println(s2);

        //Alternatives
        System.out.println(s1.substring(s1.indexOf("Java"))); // Java

        System.out.println(s1.length() - 4); //12


        /*
        TASK-2
        Assume you are given below sentence
        "Java is an object-oriented programming language"
        Write a Java program that extracts "Java" and "object-oriented" from given sentence
        And store extracted values in separate Strings
        Finally, print the extracted Strings


        Expected output: ;
        Java
        object-oriented


        //Java -> 0,4
        --object- oriented --> 11, 26
         */

        String str1 = "Java is an object-oriented programming language";
        String str2 = str1.substring(0, 4);
        String str3 = str1.substring(11, 26);

        System.out.println(str2);
        System.out.println(str3);


        // Alternatives
        String java = "Java";
        String oo = "object-oriented";

        System.out.println(str1.substring(str1.indexOf(java), java.length())); //Java






    }
}
