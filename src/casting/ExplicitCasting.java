package casting;

public class ExplicitCasting {
    public static void main(String[] args) {
        /*Explicit casting -narrowing - down casting --> going to a big container to a smaller one. We wont really be
        ever, but he wanted to go over it. We will focus on the implicit one. /*
         */


        int age = 25;

        byte b = (byte) age;

        System.out.println(b); //25

        // BUT, we will lose data of bigger primitive holds a data that can not be stored in the small one.

        int num1 = 128;

        byte num2 = (byte) num1; // it seems okay to the compiler

        System.out.println(num2);

    }
}
