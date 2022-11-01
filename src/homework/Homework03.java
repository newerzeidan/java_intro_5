package homework;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {

        System.out.println("\n---Task-1---");


        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("Please enter your first number");
        num1 = input.nextInt();
        input.nextLine();

        System.out.println("Please enter your second number");
        num2 = input.nextInt();

        System.out.println("The difference between numbers is = " + Math.abs(num1 - num2));


        System.out.println("\n--Task 2--");

        int number1, number2, number3, number4, number5;

        System.out.println("Please enter your first number");
        number1 = input.nextInt();
        input.nextLine();

        System.out.println("Please enter your second number");
        number2 = input.nextInt();
        input.nextLine();

        System.out.println("Please enter your third number");
        number3 = input.nextInt();
        input.nextLine();

        System.out.println("Please enter your fourth number");
        number4 = input.nextInt();
        input.nextLine();

        System.out.println("Please enter your fifth number");
        number5 = input.nextInt();
        input.nextLine();

        System.out.println("Max value = " + (Math.max((Math.max(Math.max(number1, number2),number3)), Math.max(number4, number5))));
        System.out.println("Min value = " + (Math.min((Math.min(Math.min(number1, number2),number3)), Math.min(number4, number5))));


        System.out.println("\n--Task3--");

        int random1 =55;
        int random2 = 67;
        int random3 =90;

        int myRandom = (int) (Math.random() * (100 - 50 + 1 + 50));

        System.out.println("Please enter your first random number");
        random1 = input.nextInt();
        input.nextLine();

        System.out.println("Please enter your second random number");
        random2 = input.nextInt();
        input.nextLine();

        System.out.println("Please enter your third random number");
        random3 = input.nextInt();
        input.nextLine();

        System.out.println("The sum of the numbers is = " + (random1 + random2 + random3));


        System.out.println("\n--Task 4--");

        double alexMoney = 125;
        double mikeMoney = 220;
        double loanAmount = 25.5;

        System.out.println("Alex's moneys: $" + (alexMoney - loanAmount));
        System.out.println("Mike's moneys: " + (mikeMoney +  loanAmount));

        System.out.println("/n--Task5--");

        int bikeCost = 390;
        Double dailySaving = 15.60;

        int days = (int) (bikeCost / dailySaving);

        System.out.println(days);


        System.out.println("\n--Task6--");

        String s1 = "5";
        String s2 = "10";

        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);

        System.out.println("- Sum of 5 and 10 is = " + (i1 + i2));
        System.out.println("- Product of 5 and 10 is = " + i1 * i2);
        System.out.println("- Division of 5 and 10 is = " + i1 / i2);
        System.out.println("- Subtraction of 5 and 10 is = " + (i1 -i2));
        System.out.println("- Remainder of 5 and 10 is = " + i1 % i2);

        System.out.println("/n--Task 7--");

        String string1 = "200";
        String string2 = "-50";

        int integer1 = Integer.parseInt(string1);
        int integer2 = Integer.parseInt(string2);

        System.out.println("The greatest value is = " + Math.max(integer1,integer2));
        System.out.println("The smallest value is = " + Math.min(integer1,integer2));
        System.out.println("The average value is = " + (integer1 + integer2) /2);
        System.out.println("The absolute difference is = " + Math.abs(integer1-integer2));


        System.out.println("\n--Task 8--");

        Double dailySavings= .96;

        int dailySaving1 = (int) ((int) 24 / dailySavings);
        int dailySaving2 = (int) ((int) 168 / dailySavings);


        System.out.println(dailySaving1 + " days");
        System.out.println(dailySaving2 + " days");
        System.out.println("$" + 150 * dailySavings);

        System.out.println("\n--Task 9--");

        int laptopGoal = 1250;
        Double dailySave = 62.5;

        int days1 = (int) ((int) laptopGoal /dailySave);
        System.out.println(days1);

        System.out.println("\n--Task 10--");

        int carCost = 14265;
        double option1 = 475.50;
        double option2 = 951;

        int monthsToPay1 = (int) (carCost / option1);
        int monthsToPay2 = (int) (carCost / option2);

        System.out.println("Option 1 will take " + monthsToPay1 + " months");
        System.out.println("Option 2 will take " + monthsToPay2 + " months");

        System.out.println("\n--Task 11--");

        Scanner scanner = new Scanner (System.in);

        int inputA, inputB;
        System.out.println("Please enter your first number");
        inputA = input.nextInt();
        input.nextLine();

        System.out.println("Please enter your first number");
        inputB = input.nextInt();

        System.out.println((inputA/(double)inputB));


        System.out.println("\n---Task 12---");
        /* bigger -smaller +1  */
        int randomNumber0To100 = (int) (Math.random() * 100 + 1);
        int randomNumber0To1001 = (int) (Math.random() * 100 + 1);
        int randomNumber0To1002 = (int) (Math.random() * 100 + 1);


     boolean NumberBiggerThan25 = (randomNumber0To100 > 25) && (randomNumber0To1001 > 25) && (randomNumber0To1002 > 25);
    /* OR || has to have 1 to be true but && has to have all to be true */
        System.out.println(NumberBiggerThan25);

                            System.out.println("\n--Task 13--");

        System.out.println("Hey user, enter a number between 1 and 7");

        int userInput1 = input.nextInt();

        if(userInput1 == 1){
            System.out.println("MONDAY");
        } else if (userInput1 == 2) {
            System.out.println("TUESDAY");
        } else if (userInput1 == 3) {
            System.out.println("WEDNESDAY");
        } else if (userInput1 == 4) {
            System.out.println("THURSDAY");
        } else if (userInput1 == 5) {
            System.out.println("FRIDAY");
        } else if (userInput1 == 6) {
            System.out.println("SATURDAY");
        } else if (userInput1 == 7) {
            System.out.println("SUNDAY");
        } else{
            System.out.println("Number entered not within scope");
        }

                        System.out.println("\n---Task14---");

        int exam1, exam2, exam3;

        System.out.println("Tell me your exam results?");
        exam1 = input.nextInt();
        exam2 = input.nextInt();
        exam3 = input.nextInt();
        input.nextLine();

        int average = (exam1 + exam2 + exam3) / 3;

        if(average >= 70){
            System.out.println("YOU PASSED!");
        } else{
            System.out.println("YOU FAILED!");
        }

        System.out.println("\n---Task15---");

        int number1a, number2a, number3a;

        System.out.println("Enter 3 numbers");
        number1a = input.nextInt();
        number2a = input.nextInt();
        number3a = input.nextInt();
        input.nextLine();

        if(number1a == number2a && (number2a == number3a)){
            System.out.println("TRIPLE MATCH");
        } else if (number1a == number2a || number2a == number3a || number1a == number3a) {
            System.out.println("DOUBLE MATCH");
        } else{
            System.out.println("NO MATCH");
        }
    }
}

