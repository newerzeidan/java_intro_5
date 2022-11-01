package operators.arithmetic_operators;

public class Exercise1 {
    public static void main(String[] args) {
        /*
        Assume that you have a rectangle
        Short side is equal to 4 units
        Long side is equal to 7 units
        Find area and the perimeter of the rectangle

        Expected output:
        Perimeter = 22
        Area is = 28

        Area = a*b
        Perimeter = 2 * (a+b)
         */

        int shortSide = 4;
        int longSide = 7;

        System.out.println("The area of the rectangle is = " + shortSide * longSide);
        System.out.println("The perimeter of the rectangle is = " + 2 * (shortSide + longSide));


    }
}
