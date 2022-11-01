package casting;

import java.sql.SQLOutput;

public class PrimitivesToString {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 =10;

        System.out.println(num1 + num2); //15 - primitive - number
        System.out.println("" + num1 + num2); // 510 -String - text
        System.out.println(' ' + num1 + num2); // ASCII since its '' --> space on the table is 32 then you add 15 = 47
        System.out.println("" + (num1 + num2)); // 15- this is a STRING NOT A # 15

        System.out.println(String.valueOf(num1) + String.valueOf(num2)); //510 - String - text
        // "5" + "10" -> 510

        System.out.println(String.valueOf(23) +5); // "23" + 5 -> 235


    }
}
