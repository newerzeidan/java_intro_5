package conditional_statements.ternary_operator;

import java.util.Random;

public class Exercise2_FindMin {
    public static void main(String[] args) {
        /*
        Task
        Write a program that generates 2 random numbers between 1 and 10
        Find and print the smallest number

        USE TERNARY
         */

        Random random = new Random(); // instead of using Math.random() imports a random class can generate random values like, numbers, booleans, double, etc.
        int number1 = random.nextInt(10) + 1; // 1 to 10 MUST USE intBound instead of normal int
        int number2 = random.nextInt(10) + 1; // 1 to 10 MUST USE intBound instead of normal int

        System.out.println("Random 1 = " + number1);
        System.out.println("Random 2 = " + number2);

        int min1 = number1 < number2 ? number1 : number2;

        System.out.println("The smallest number is = " + min1);


        int num1 = (int)(Math.random() * 10) + 1;
        int num2 = (int)(Math.random() * 10) + 1;

        System.out.println("\nFirst random number is = " + num1);
        System.out.println("Second random number is = " + num2);

        int min = num1 < num2 ? num1 : num2;

        System.out.println("The smallest number is = " + min);
    }
}