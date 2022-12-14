package homework;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Homework11 {
    public static void main(String[] args) {

        System.out.println("\n-----TASK1-----\n");
        System.out.println(noSpace("   Java   "));

        System.out.println("\n-----TASK2-----\n");
        System.out.println(replaceFirstLast("java is fun"));

        System.out.println("\n-----TASK3-----\n");
        System.out.println(hasVowel("hgf"));

        System.out.println("\n-----TASK4-----\n");
        checkAge(2000);

        System.out.println("\n-----TASK5-----\n");
        System.out.println(averageOfEdges(10, 13, 20));

        System.out.println("\n-----TASK6-----\n");
        System.out.println(Arrays.toString(noA(new String[]{"appium", "123", "ABC", "java"})));

        System.out.println("\n-----TASK7-----\n");
        System.out.println(Arrays.toString(no3or5(new int[]{10, 11, 12, 13, 14, 15})));

        System.out.println("\n-----TASK8-----\n");
        System.out.println(countPrimes(new int[]{-10, -3, 0, 1}));
    }
    // TASK 1
    public static String noSpace(String s) {
        return s.replaceAll(" ", "");
    }
    // TASK 2
    public static String replaceFirstLast(String str){
        str = str.trim();
        if (str.length() < 2) return "";
        return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
    }
    // TASK 3
    public static boolean hasVowel(String str){
        return !(str.replaceAll("[^aeiouAEIOU]", "").isEmpty());
    }
    // TASK 4
    public static void checkAge(int yearOfBirth){
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        int age  = Integer.parseInt(format.format(date)) - yearOfBirth;

        if (age >= 16 && age <= 100) System.out.println("AGE IS ALLOWED");
        else if(age < 16 && age > 0) System.out.println("AGE IS NOT ALLOWED");
        else System.out.println("AGE IS NOT VALID");
    }
    // TASK 5
    public static int averageOfEdges(int num1, int num2, int num3){
        return  ((Math.max(num1, Math.max(num2,num3)) + (Math.min(Math.min(num1,num2), num3))) / 2);
    }

    // TASK 6
    public static String[] noA(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].toLowerCase().startsWith("a")) arr[i] = "###";
        }
        return arr;
    }
    // TASK 7
    public static int[] no3or5(int[] arr){
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 5 == 0 && arr[i] % 3 == 0) newArr[i] = 101;
            else if(arr[i] % 3 == 0) newArr[i] = 100;
            else if(arr[i] % 5 == 0) newArr[i] = 99;
            else newArr[i] = arr[i];
        }
        return newArr;
    }

    // TASK 8
    public static int countPrimes(int[] arr) {
        int nonPrimeNumbers = 0;
        for (int number : arr) {
            if(number < 2){
                nonPrimeNumbers++;
                continue;
            }
            for (int j = 2; j <number; j++) {
                if (number % j == 0) {
                    nonPrimeNumbers++;
                    break;
                }
            }
        }
        return arr.length - nonPrimeNumbers;
    }
}