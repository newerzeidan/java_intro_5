package methods;

import utilities.ScannerHelper;

public class ScannerPractices {
    public static void main(String[] args) {

        /*
        Write a program that asks user to enter their name and then age
        Print the info in below format

        {name}'s age is {age}.


        Scanner input = new Scanner(System.in);

        System.out.println("---Using Original Scanner Way---");

        System.out.println("Hey user, please enter your name: ");
        String name = input.nextLine();

        System.out.println("Hey user, please enter your age: ");
        int age = input.nextInt();

        System.out.println(name + "'s"+ " age is " + age + ".");
         */

        /*
        System.out.println("\n---Using Custom Scanner Method---");

        String name = ScannerHelper.getAName();
        System.out.println("The name is = " + name);

         */

        /*
        Write a program that asks user to enter their name and then age
        Print the info in below format

        {name}'s age is {age}.
        Address is {address}
         */

        String name = ScannerHelper.getAName();
        int age = ScannerHelper.getAnAge();
        String address = ScannerHelper.getAnAddress();

        System.out.println(name + "'s age is " + age + "." + "\nAddress is " + address);
    }
}
