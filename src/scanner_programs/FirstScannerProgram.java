package scanner_programs;

import java.util.Scanner;

public class FirstScannerProgram {
    public static void main(String[] args) {

        //1. Create a Scanner object

        //dataType varName = value;

        String fName, lName;

        Scanner inputReader = new Scanner(System.in);



        System.out.println("Please enter your last name:");
        lName = inputReader.next();
        inputReader.next(); //John

    }
}
