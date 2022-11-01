package conditional_statements.if_else_statements;

import java.util.Scanner;

public class Exercise3_Retirement {
    public static void main(String[] args) {

        /*
Write a Java program that asks user to enter their age
And print "It is your time to get retired!" if their age is more than or equal to 55
else calculate and tell user how many years later they can be retired

EXAMPLE PROGRAM 1
Program: Please enter your age?
User: 60

Program: It is your time to get retired!

EXAMPLE PROGRAM 1
Program: Please enter your age?
User: 45

Program: You have 10 years to be retired

 */

        Scanner input = new Scanner(System.in);


        int retirementAge = 55;

        System.out.println("Hey User, please enter your age: ");
        int age = input.nextInt();

        if(age >= 55) {
            System.out.println("It is your time to get retired!");
        }
        else{
            System.out.println("You have " + (retirementAge - age) + " years to be retired");
        }

        System.out.println("\nHey User, please enter your age: ");
        int age1 = input.nextInt();

        if(age1 >= 55){
            System.out.println("It is your time to be retired");
        }
        else{
            System.out.println("You have " + (retirementAge - age1) + " years to be retired");
        }
    }
}
