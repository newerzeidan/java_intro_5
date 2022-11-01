import java.util.Scanner;

public class Scratch {
    public static void main(String[] args) {

        System.out.println("\n--Task 11--");

        Scanner input = new Scanner (System.in);

        int num1, num2;


        System.out.println("Please enter your first number");
        num1 = input.nextInt();
        input.nextLine();

        System.out.println("Please enter your first number");
        num2 = input.nextInt();
        input.nextLine();

        double result = (double) num1 / num2;

        System.out.println(result);
    }
}
