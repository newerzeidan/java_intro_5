package practice.arrayListPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class FindFirstNegativePositive {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(0, -4, -7, 0, 5, 10, 45));
        firstPosFirstNeg(numbers);

    }

    /*
    Create a public static void method which will take an arraylist then it will find the
    first positive and first negative number and print them.

    Example:
    Arraylist -> [0, -4, -7, 0, 5, 10, 45]

    Output:
    First positive number is: 5
    First negative number is: -4
     */

    public static void firstPosFirstNeg(ArrayList<Integer> numbers){

        int firstPos = 0;
        int firstNeg = 0;

        for (Integer number : numbers) {
            if (number > 0 && firstPos == 0) firstPos = number;
            if (number < 0 && firstNeg == 0) firstNeg = number;
        }
        System.out.println("First positive number is: " + firstPos);
        System.out.println("First negative number is: " + firstNeg);
    }

}
