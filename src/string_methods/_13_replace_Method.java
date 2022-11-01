package string_methods;

public class _13_replace_Method {
    public static void main(String[] args) {
        /*
        -return
        -returns String
        -non-static
        -There are overloaded methods, one takes two chars to be replaced
         and the other takes 2 String to be replaced.
         */
        String s = "Can I can a can";


       String s1 =  s.replace('c', 'x');

        System.out.println(s1); // Can I xan a xan


        System.out.println(s.replace("can", "xxx")); // Can I xxx a xxx
        System.out.println(s.toLowerCase().replace("can","xxx")); // xxx i xxx a xxx


        //Important

        String str1 = "John";
        str1 = str1.replace("o", "oooo");

        System.out.println(str1); // Joooohn

        String str2 = "apple";
        str2 = str2.replace("abc", "xyz");

        System.out.println(str2); //apple since "abc" is not in the string, it replaces nothing

        String str3 = "Orange";
        str3 = str3.replace(str3, "");

        System.out.println(str3); // blank since we replaced all of "Orange" to ""
    }
}
