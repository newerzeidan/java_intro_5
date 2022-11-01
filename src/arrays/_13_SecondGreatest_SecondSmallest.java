package arrays;

public class _13_SecondGreatest_SecondSmallest {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 7, 1, 1, 7};

        System.out.println("Example 1: ");
        printMaxMinSecondMaxAndMin(numbers);
    }
    /*
    Create a public static method which will take an int array,
    find the max and min, second max and min from that array then print them out.

    Hint: Find the max and min FIRST.

    Example 1:
        Array -> int[] numbers = {2, 3, 7, 1, 1, 7};

        Expected Output:
            max = 7
            second max = 3
            min = 1
            second min = 2
     */
    public static int findMax(int[] numbers){
        int max = Integer.MIN_VALUE;
        for (int n : numbers) {
            if(n > max) max = n;
        }
        return max;
    }
    public static int findMin(int[] numbers){
        int min = Integer.MAX_VALUE;
        for (int n : numbers) {
            if(n < min) min = n;
        }
        return min;
    }

    public static void printMaxMinSecondMaxAndMin(int[] numbers){
        int secondMax = Integer.MIN_VALUE, secondMin = Integer.MAX_VALUE;

        for (int n : numbers) {
            if(n > secondMax && n < findMax(numbers)){
                secondMax = n;
            }

            if(n < secondMin && n > findMin(numbers)){
                secondMin = n;
            }
        }
        System.out.println("max = " + findMax(numbers));
        System.out.println("second max = " + secondMax);
        System.out.println("min = " + findMin(numbers));
        System.out.println("second min = " + secondMin);
    }

}