package string_methods;

import java.net.BindException;

public class _06_CharAt_Method {
    public static void main(String[] args) {
        /*
        1. return
        2. return a char at given index
         */

        String sentence = "Java is fun";


       char c1 = sentence.charAt(3); //a

        char c2 = sentence.charAt(4); // ' ' space


        System.out.println(c1);
        System.out.println(c2);

        System.out.println(sentence.charAt(9)); //u

        //NOTE: Runtime error - StringIndexOutOFBoundsException
        System.out.println(sentence.charAt(-5)); // Runtime error or SOFBE
        System.out.println(sentence.charAt(50)); // SOFBE

        System.out.println("end of the program");



    }
}
