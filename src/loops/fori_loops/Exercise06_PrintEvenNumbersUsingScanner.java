package loops.fori_loops;

import utilities.ScannerHelper;

public class Exercise06_PrintEvenNumbersUsingScanner {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter 2 different numbers
        Print all the even numbers between given numbers by user in ascending order

        3, 10 -> 4, 6, 8, 10
        7,2 -> 2, 4, 6

        Start Point: smallest number given
        End Point: greatest number given
        Update: Increment
         */

        int num1 = ScannerHelper.getANumber(), num2 = ScannerHelper.getANumber();

        for (int i = Math.min(num1, num2); i <= Math.max(num1,num2); i++){
            if(i % 2 == 0) System.out.println(i);
        }

    }
}