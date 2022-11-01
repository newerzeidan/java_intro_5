package loops.fori_loops;

public class Exercise09_FindSumOFNumbers {
    public static void main(String[] args) {
        /*
        Write a Java program to find sum of numbers from 10 to 15 (10 to 15 are included)

       Expected output:
       75
         */

        int sum = 0;

        for (int i = 10; i <= 15; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
