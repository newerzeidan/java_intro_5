package homework;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {

        System.out.println("\n--Task 1--\n");

        int input1, input2;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Please enter your first number: ");
        input1 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter your second number: ");
        input2 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("The number 1 entered by user is = " + input1);
        System.out.println("The number 2 entered by user is = " + input2);
        System.out.println("The sum of the number 1 and 2 is = " + (input1 + input2));


        System.out.println("\n--Task 2--\n");

        int input3, input4;

        System.out.println("Please enter your first number: ");
        input3 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter your second number");
        input4 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("The product of the given 2 numbers is : " + input3 * input4);

        System.out.println("\n--Task 3--\n");

        double input5, input6;

        System.out.println("Please enter your first number");
        input5 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter your second number");
        input6 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("The sum of the given numbers is " + (input5 + input6));
        System.out.println("The product of the given numbers is " + input5 * input6);
        System.out.println("The subtraction of the given numbers is " + (input5 - input6));
        System.out.println("The division of the given numbers is " + input5 / input6);
        System.out.println("The remainder of the given numbers is " + input5 % input6);


        System.out.println("\n--Task 4--\n");

        System.out.println("1.\t\t" + (-10 + ( + 7 * 5)));
        System.out.println("2.\t\t" + (72 + 24) % 24);
        System.out.println("3.\t\t" + (10 + -3) * 9 / 9);
        System.out.println("4.\t\t" + (5 + 18 / 3 * 3 - (6 % 3)));


        System.out.println("\n--Task 5--\n");

        int input7, input8;

        System.out.println("Please enter your first number");
        input7 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter your second number");
        input8 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("The average of the given number is: " + (input7 + input8) / 2);


        System.out.println("\n--Task 6--\n");

        int input9, input10, input11, input12, input13;

        System.out.println("Please enter your first number");
        input9 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter your second number");
        input10 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter your third number");
        input11 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter your fourth number");
        input12 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter your fifth number");
        input13 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("The average of the given numbers is: " +
                (input9 + input10 + input11 + input12 + input13) / 5);


        System.out.println("--Task 7--\n");
        int input14, input15, input16;

        System.out.println("Please enter your first number");
        input14 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter your second number");
        input15 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter your third number");
        input16 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("The " + input14 + " multiplied with " + input14 + " is = " + input14 * input14);
        System.out.println("The " + input15 + " multiplied with " + input15 + " is = " + input15 * input15);
        System.out.println("The " + input16 + " multiplied with " + input16 + " is = " + input16 * input16);


        System.out.println("\n--Task 8--\n");

        int input17;

        System.out.println("Please enter the side of the square: ");
        input17 = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Perimeter of the square = " + 4 * input17);
        System.out.println("Area of the square = " + input17 * input17);

        System.out.println("\n--Task 9--\n");

        double yearlySalary = 90_000;

        System.out.println("A Software Engineer in test can earn $" + yearlySalary * 3 + " in 3 years.");

        System.out.println("\n--Task 10--\n");

        int favNumber = 7;
        String favBook = "Java 101", favColor = "Blue";

        System.out.println("Please enter your favorite book: ");
        favBook = inputReader.nextLine();

        System.out.println("Please enter your favorite color: ");
        favColor = inputReader.nextLine();

        System.out.println("Please enter your favorite number: ");
        favNumber = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("User's favorite book is: " + favBook + "\n" +
                  "User's favorite color is: " + favColor + "\n"
                + "User's favorite number is: " + favNumber);

        System.out.println("\n--Task 11--\n");

        String firstName, lastName, emailAddress, phoneNumber, address;
        int age;

        System.out.println("Please enter your first name: ");
        firstName = inputReader.nextLine();

        System.out.println("Please enter your last name: ");
        lastName = inputReader.nextLine();

        System.out.println("Please enter your age: ");
        age = inputReader.nextInt();
        inputReader.nextLine();

        System.out.println("Please enter your email address: ");
        emailAddress = inputReader.nextLine();

        System.out.println("Please enter your phone number: ");
        phoneNumber = inputReader.nextLine();

        System.out.println("Please enter your address: ");
        address = inputReader.nextLine();

        System.out.println("\tUser who joined this program is " + firstName + " " + lastName + "."
                + " John's age is " + age + "." + " John's email \naddress is " + emailAddress + ","
                + " phone number is " + phoneNumber + "," + " and address \nis " + address + "." );
    }
}
