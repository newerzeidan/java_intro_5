package homework;

import utilities.ScannerHelper;

public class Homework04 {
    public static void main(String[] args) {
        System.out.println("------Task1------");

        String name = ScannerHelper.getAName();

        System.out.println("The length of the user name is = " + name.length());

        System.out.println("The first character in user name is = " + name.charAt(0));

        System.out.println("The last character in user name is = " + name.charAt(name.length() - 1));

        System.out.println("The first 3 characters in the user name is = " + name.substring(0, 3));


        System.out.println("The last 3 characters in the user name is = " + name.substring(name.length() - 3));

        if (name.charAt(0) == 'A' && name.charAt(0) == 'a') System.out.println("You are in the Club!");
        else System.out.println("Sorry, you are not in the club");


        System.out.println("/n---Task 2---");
        String address = ScannerHelper.getAnAddress();

        if (address.toLowerCase().contains("chicago")) System.out.println(" You are in the club");
        else if (address.toLowerCase().contains("des plaines")) System.out.println("You are welcomed to join the club");
        else System.out.println("Sorry, you will never be allowed in the club");


        System.out.println("/n---Task 3---");

        String favColors = ScannerHelper.getAFavColors();


        if (favColors.toLowerCase().contains("red") && favColors.toLowerCase().contains("green"))
            System.out.println("Green and red are on the list");
            else if (favColors.toLowerCase().contains("red")) System.out.println("Red is in the list");
         else if (favColors.toLowerCase().contains("green")) System.out.println("green is on the list");
            else System.out.println("Green and red are not on the list");


        System.out.println("/n---Task 4---");
        String str = "Java is FUN";

        str = str.toLowerCase().trim();

        System.out.println("The first word in str is = " + str.substring(0, 4));
        System.out.println("The second word in str is = " + str.substring(5, 7));
        System.out.println("The third word in str is = " + str.substring(8, 11));


    }}

