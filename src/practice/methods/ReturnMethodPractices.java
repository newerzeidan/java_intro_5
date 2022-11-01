package practice.methods;

public class ReturnMethodPractices {
    public static void main(String[] args) {
        System.out.println(ReturnMethodPractices.findDifference(6, 9));
        System.out.println(ReturnMethodPractices.findDifference(4, 1));
        System.out.println(ReturnMethodPractices.findDifference(99, 23));



        System.out.println(ReturnMethodPractices.findDifference(6, 9));
        System.out.println(ReturnMethodPractices.findDifference(6.12, 12.76));
        System.out.println(ReturnMethodPractices.findDifference(9.63, 43.1));



        System.out.println(ReturnMethodPractices.isIncluded("John","John Doe" ));
        System.out.println(ReturnMethodPractices.isIncluded("John Doe","John"));
        System.out.println(ReturnMethodPractices.isIncluded("Doe", "John"));


    }

    /*
      Create a public static method named as "findDifference" it will take two values and returns the difference

        Examples:
        6, 9 -> 3
        4, 1 -> 3
        99, 23 -> 76
         */
    public static int findDifference(int num1, int num2) {
        return Math.abs(num1 - num2);
    }

      /*
        Create a public static method named as "findDifference" it will take two decimal values and returns
        the positive difference

        Example:
        99.23, 23.99 -> 3
        6.12, 12.76 -> 3
        9.36, 23 -> 76
         */

    public static double findDifference(double double1, double double2) {
        return Math.abs(double1 - double2);
    }


    /*
    Create a public static method named as "isIncluded" which takes two Strings values,
    and returns true of the small String is inside of the other one.

    Example:
    "John", "John Doe"  ->
    "green, blue, red:, "blue" -> true
    "John", "blue" -> false
     */

    public static boolean isIncluded(String str1, String str2){
        // is str1 contains str2    ||   str2 contains str1
        // return str1.contains(str2)    ||    str2.contains(str1);
         if(str1.length()>str2.length()) return str1.contains(str2);
        return str2.contains(str1);
    }

}

