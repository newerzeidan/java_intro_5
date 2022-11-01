package projects;

import java.util.Scanner;

public class Project02 {
        public static void main(String[] args) {
                System.out.println("--TASK 1--");


                Scanner input = new Scanner(System.in);

                System.out.println("Please enter your first number");
                int input1 = input.nextInt();
                input.nextLine();

                System.out.println("Please enter your second number");
                int input2 = input.nextInt();
                input.nextLine();

                System.out.println("Please enter your third number");
                int input3 = input.nextInt();
                input.nextLine();

                System.out.println("The product of the numbers entered is = " + input1 * input2 * input3);


                System.out.println("\n--TASK 2--");

                int currentYear = 2022;

                System.out.println("What is your first name? ");
                String firstName = input.nextLine();

                System.out.println("What is your last name? ");
                String lastName = input.nextLine();

                System.out.println("What is your year of birth? ");
                int info1 = input.nextInt();
                input.nextLine();

                System.out.println(firstName + " " + lastName + "'s age is = " + (currentYear - info1) + ".");

                System.out.println("/n--Task 3--");

                System.out.println("What is your full name");
                String fullName = input.nextLine();

                System.out.println("What is your weight");
                double weightKg = input.nextDouble();
                input.nextLine();

                System.out.println(fullName + "'s weight is = " + weightKg * 2.205 + " lbs.");


                System.out.println("\n--Task 4--");


                System.out.println("Student 1, what is your full name?");
                String fullName1 = input.nextLine();

                System.out.println("Student 2, what is your full name?");
                String fullName2 = input.nextLine();

                System.out.println("Student 3, what is your full name?");
                String fullName3 = input.nextLine();


                System.out.println("Student 1, what is your age?");
                int age1 = input.nextInt();
                input.nextLine();

                System.out.println("Student 2, what is your age?");
                int age2 = input.nextInt();
                input.nextLine();

                System.out.println("Student 3, what is your age?");
                int age3 = input.nextInt();
                input.nextLine();

                System.out.println(fullName1 + "’s age is " + age1 + ".");
                System.out.println(fullName2 + "’s age is " + age2 + ".");
                System.out.println(fullName3 + "’s age is " + age3 + ".");
                System.out.println("The average age is " + (age1 + age2 + age3) / 3 + ".");
                System.out.println("The eldest age is " + Math.max(Math.max(age1, age2), age3) + ".");
                System.out.println("The youngest age is " + Math.min(Math.min(age1, age2), age3) + ".");
        }
}
