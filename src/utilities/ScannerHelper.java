package utilities;

import java.util.Scanner;

public class ScannerHelper {
    static Scanner input = new Scanner(System.in);

/*
Create a method that asks user to enter a name and RETURN it
 */

    public static String getAName() {
        System.out.println("Please enter a name:");
        String name = input.nextLine();

        return name;
    }


/*
Create a method that asks user to enter an age and RETURN it
 */

    public static int getAnAge() {
        System.out.println("Please enter an age:");
        int age = input.nextInt();
        input.nextLine();

        return age;
    }

    public static String getAnAddress() {
        System.out.println("Please enter an address: ");
        String address = input.nextLine();

        return address;
    }

    public static String getAString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a String");
        String string = input.nextLine();

        return string;
    }

    public static String getAFavColors() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a favorite color");
        String favColors = input.nextLine();

        return favColors;
    }

    public static int getANumber(){
        System.out.println("Please enter a number:");
        int num = input.nextInt();
        input.nextLine();

        return num;
    }
    public static String getFullName(){
        System.out.println("Please enter your full name:");
        String fullName = input.nextLine();
        input.nextLine();

        return fullName;

    }}
