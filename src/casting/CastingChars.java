package casting;

public class CastingChars {
    public static void main(String[] args) {
        int i1 = 65;


        System.out.println(i1); //65

        char c1 = (char) i1; // A -> gets the decimal value from the ASCII table

        System.out.println(c1); // A
        System.out.println(51); // 51
        System.out.println((char) 51); //3


        System.out.println((char) 123); // {

        System.out.println((char) 32); // shows a blank space which is what 32 on the ASCII table is.

        System.out.println((char) 3500); // elephant
        System.out.println((char) 1025); // Russian letter


        char char1 = 'A';
        char char2 = 97; // 'a'

        System.out.println(char1 + char2); // 65 + 97 --> 162 if i add + 3 then it will be 165
        System.out.println("" + char1 + char2); //Aa
        System.out.println("" + (char1 + char2)); // 162 -> this is a string -> if i add 3 then it will be 1653 since string

        System.out.println(char1 +  char2 + ""); // 162 as a text
        System.out.println(char1 +  "" + char2); // Aa -> string plus primitive is string
        // primitive + String  --> String
        //String + primitive  -->
        //p + p + s --> number String
        // 'A' + "" + 'a' --> Aa















    }
}
