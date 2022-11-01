package methods;

import utilities.RandomNumberGenerator;
import utilities.MathHelper;

public class MaxMinMiddle {
    public static void main(String[] args) {
        /*
        Write a program that generates 3 random numbers between 25 and 35
        Then find the min, max, and the middle number from the random numbers
         */

        int r1 = RandomNumberGenerator.getARandomNumber(25, 35);
        int r2 = RandomNumberGenerator.getARandomNumber(25, 35);
        int r3 = RandomNumberGenerator.getARandomNumber(25, 35);

        System.out.println("Random 1 = " + r1);
        System.out.println("Random 2 = " + r2);
        System.out.println("Random 3 = " + r3);

        int max = MathHelper.maxOfThree(r1, r2, r3);
        int min = MathHelper.minOfThree(r1, r2, r3);
        int middle = MathHelper.middleOfThree(r1, r2, r3);

        System.out.println("The max is = " + max);
        System.out.println("The min is = " + min);
        System.out.println("The middle is = " + middle);
    }
}
