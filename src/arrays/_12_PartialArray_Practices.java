package arrays;

public class _12_PartialArray_Practices {
    public static void main(String[] args) {
        int[] example = {10, -3, -7, 0, 0, 7, 22};
        int[] example2 = {10, -3, 7, 1, 22};

        System.out.println("Example 1: ");
        System.out.println(findSumOfThree(example));

        System.out.println("\nExample 2: ");
        System.out.println(findSumOfThree(example2));

        System.out.println("\nExample 3: ");
        System.out.println(findSumOfLastFive(example));

        System.out.println("\nExample 4: ");
        System.out.println(findSumOfLastFive(example2));
    }

    /*
    Create a public static method which will take an int array then it will get the
    sum of first 3 elements and return it. NOTE: Given array should be at least 3 elements

    Example:

    Array -> int[] numbers = {10, -3, -7, 0, 0, 7, 22};

    Expected Output:
    0

    Example2:

    Array -> int[] numbers = {10, -3, 7, 1, 22};

    Expected Output:
    14
     */
    public static int findSumOfThree(int[] numbers){
        /*
        1. Create an int container
        2. Create a loop (start = 0, end 3 {not included})
        3. Return the container
         */

        int sum = 0;

        for (int i = 0; i < 3; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    /*
    Create a public static method which will take an int array then it will get the
    sum of last 5 elements and return it.

    Note: Given array should be at least 5 elements
    Note2: Use LOOPS

    Example:
    Array -> int[] numbers = {10, -3, -7, 0, 0, 7, 22};

    Expected Output:
    22

    Example2:
    Array -> int[] numbers = {10, -3, 7, 1, 22};

    Expected Output:
    38
     */

    public static int findSumOfLastFive(int[] numbers){
        /*
        1. Create a container
        2. Loop (start = L - 1; i > L - 6; i--)
        3. Return container
         */
        int sum = 0;

        for (int i = numbers.length - 1; i > numbers.length - 6; i--) {
            sum += numbers[i];
        }
        return sum;
    }

}