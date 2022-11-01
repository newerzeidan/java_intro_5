package homework;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {


        System.out.println("\n----- Task-1-----\n");

        String result = "";

        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0)
                result += i + " - ";
        }

        System.out.println(result.substring(0, result.length() - 3));


        System.out.println("\n----- Task-2-----\n");

        String result1 = "";
        for (int i = 1; i <= 50; i++) {
            if (i % 6 == 0) result1 += i + " - ";

        }
        System.out.println(result1.substring(0, result1.length() - 3));


        System.out.println("\n----- Task-3-----\n");

        String result2 = "";

        for (int i = 100; i >= 50; i--) {
            if (i % 5 == 0) result2 += i + " - ";

        }
        System.out.println(result2.substring(0, result2.length() - 3));


        System.out.println("\n----- Task-4-----\n");

        for (int i = 0; i <= 7; i++) {
            int square = i * i;
            System.out.print("\nThe square of " + i + " is " + "= " + square);

        }

        System.out.println("\n----- Task-5-----\n");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);


        System.out.println("\n----- Task-6-----\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Hey user please enter a positive number");

        int factorial = 1;
        int postiveNum = input.nextInt();
        for (int i = 1; i <= postiveNum; i++) {
            factorial *= i;
        }
        System.out.println(factorial);


        System.out.println("\n----- Task-7-----\n");

        String fullName = ScannerHelper.getFullName();
        int vowel = 0;

        for (int i = 0; i < fullName.length(); i++) {
            if (fullName.charAt(i) == 'a' || fullName.charAt(i) == 'e' || fullName.charAt(i) == 'i' ||
                    fullName.charAt(i) == 'o' || fullName.charAt(i) == 'u' || fullName.charAt(i) == 'A' ||
                    fullName.charAt(i) == 'E' || fullName.charAt(i) == 'I' || fullName.charAt(i) == 'O'
                    || fullName.charAt(i) == 'U') ;
            vowel++;
        }
        System.out.println("There are " + vowel + " vowels letters in this full name");


        System.out.println("\n----- Task-8-----\n");

        int num = ScannerHelper.getANumber();
        int sumTotal = 0;

        do {
            System.out.println("Please enter a number: ");
            num = input.nextInt();
            if (num >= 100) {
                System.out.println("The number is more then or equal to 100");

                break;
            } else {
                sumTotal += num;
                if (sumTotal >= 100) System.out.println("Sum of entered numbers is at least 100");
            }

        }
        while (num < 100);
        if (sumTotal >= 100) System.out.println("Sum of the numbers is at least 100");


        System.out.println("\n-----Task 9-----\n");

        int first = 0;
        int second = 1;
        String resultFib = "";

        System.out.println("Hey User, please enter a number: ");
        int numFibonacci = input.nextInt();
        input.nextLine(); // scanner bug

        for (int i = 0; i < numFibonacci; i++) {
            resultFib += first + " - ";
            int sumOfFirstAndSecond = first + second;
            first = second;
            second = sumOfFirstAndSecond;
        }

        System.out.println(resultFib.substring(0, resultFib.length() - 3));


        System.out.println("\n-----Task 10-----\n");
        String fName = ScannerHelper.getAName().toLowerCase();

        while (fName.charAt(0) != 'j') {
            fName = ScannerHelper.getAName().toLowerCase();
        }

        System.out.println("End of the program");
    }}   