package primitives;

public class numbers {
    public static void main(String[] args) {
        /*
        There are 6 primitives used to store numberes as data byte, short, int, long -> used to store absoulte numbers like 3 float, double -> used for floating numbers like 10.5.

        John
        his age -> 45
        his favorite number is = 70
        his balance -> 400.45
         */

        // dataType variableName = value;

        byte age = 45;
        long favNumber = 32768;

        System.out.println(age); // 45
        System.out.println(favNumber); // 70



        /*
        Floating numbers
        float -> 4 bytes
        double -> 8 bytes

        NOTE: Most of the cases we used double
         */


        float balance1 = 23.28762385762384F;
        double balance2 = 23.28762385762384F;

        double price = 23.5;
        System.out.println(balance1); //23.287624
        System.out.println(balance2);  //23.28762
        System.out.println(price); // 23.5

        double transaction =20;

        System.out.println(transaction);
    }
}
