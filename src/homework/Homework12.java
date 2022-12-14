package homework;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {
        System.out.println("-------------Task 1-------------\n");
        System.out.println(noDigit("123Hello"));


        System.out.println("\n-------------Task 2-------------\n");
        System.out.println(noVowel("xyz"));



        System.out.println("\n-------------Task 3-------------\n");
        System.out.println(sumOfDigits("Java"));



        System.out.println("\n-------------Task 4-------------\n");
        System.out.println(hasUpperCase("John's age is 29"));



        System.out.println("\n-------------Task 5-------------\n");
        System.out.println(middleInt(1,1,1));



        System.out.println("\n-------------Task 6-------------\n");
        System.out.println(Arrays.toString(no13(new int[]{13, 13, 13, 13, 13})));



        System.out.println("\n-------------Task 7-------------\n");
        System.out.println(Arrays.toString(arrFactorial(new int[]{1, 2, 3, 4})));



        System.out.println("\n-------------Task 8-------------\n");
        System.out.println(Arrays.toString(categorizeCharacters("abc123$#%")));

}

    //Task1
    public static String noDigit(String str){
        String str1= "";
        for (int i = 0; i < str.length(); i++) {
            if(!Character.isDigit(str.charAt(i))) str += str1.charAt(i);
        }
        return str1;
    }

    //Task2
    public static String noVowel(String str){
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    //Task3

    public static int sumOfDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                sum += Integer.parseInt(str.charAt(i) + "");
        }
        return sum;
    }

    //Task4

    public static boolean hasUpperCase(String str){
        boolean isUpperCase = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                isUpperCase = true;
                break;
            }
        }
        return isUpperCase;
    }

    //Task 5
    public static int middleInt(int a, int b, int c){
        int[] numbers ={a,b,c};
        Arrays.sort(numbers);
        return numbers[1];
    }

    //Task 6

    public static int[] no13(int[] array){
        int[] newArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 13) newArr[i] = array[i];
            else array[i] = 0;
        }
        return newArr;
    }

    //Task 7

    public static int[] arrFactorial(int[] array){

        for (int i = 0; i < array.length; i++){
            int factorial = 1;
            for(int j = 2; j <= array[i]; j++){
                factorial *= j;
            }
            array[i]= factorial;
        }
        return array;
    }


    //Task 8

    public static String[] categorizeCharacters(String str) {

        String[] categorized = {"", "", ""};
        for (char character : str.toCharArray()) {
            if (Character.isLetter(character)) categorized[0] += character + "";
            else if (Character.isDigit(character)) categorized[1] += character + "";
            else categorized[2] += character + "";
        }
        return categorized;

    }
}