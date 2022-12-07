package homeworks;

import java.util.Arrays;

public class Homework11 {
    public static void main(String[] args) {
        System.out.println("---Task 1---");
        String s1 = " Hello World ";
        System.out.println(noSpace(s1));

        System.out.println("\n---Task 2---");
        String s2 = "A";
        System.out.println(replaceFirstLast(s2));

        System.out.println("\n---Task 3---");
        String s3 = "1234";
        System.out.println(hasVowel(s3));

        System.out.println("\n---Task 4---");
        int i1 = 2010;
        System.out.println(checkAge(i1));

        System.out.println("\n---Task 5---");
        int i2 = 0, i3 = 0, i4 = 0;
        System.out.println(averageOfEdges(i2, i3, i4));

        System.out.println("\n---Task 6---");
        String[] sAr = {"java", "hello", "123", "xyz"};
        System.out.println(Arrays.toString(noA(sAr)));

        System.out.println("\n---Task 7---");
        int[] iAr = {7, 4, 11, 23, 17};
        System.out.println(Arrays.toString(no3or5(iAr)));

        System.out.println("\n---Task 8---");
        int[] iAr2 = {-10, -3, 0, 1};
        System.out.println(countPrimes(iAr2));
    }

    //Task 1
    public static String noSpace(String str) {
        String noSpace = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') noSpace += str.charAt(i);
        }
        return noSpace;
    }

    //Task 2
    public static String replaceFirstLast(String str) {
        if (str.length() < 2) {
            return "";
        }
        String begin = "", end = "";
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isSpaceChar(str.charAt(i))) {
                begin += str.charAt(i);
                break;
            }
        }
        for (int i = str.length() - 1; i > 0; i--) {
            if (!Character.isSpaceChar(str.charAt(i))) {
                end += str.charAt((i));
                break;
            }
        }
        return end + str.substring(str.indexOf(begin) + 1, str.lastIndexOf(end)) + begin;
    }

    //Task 3
    public static Boolean hasVowel(String str) {
        if (str.toLowerCase().contains("a") |
                str.toLowerCase().contains("e") |
                str.toLowerCase().contains("i") |
                str.toLowerCase().contains("o") |
                str.toLowerCase().contains("u")) {
            return true;
        }
        return false;
    }

    //Task 4
    public static String checkAge(int birthYear) {
        int age = 2022 - birthYear;
        if (age < 16 & age >= 0) return "AGE IS NOT ALLOWED";
        else if (age > 100 | age < 0) return "AGE IS NOT VALID";
        else return "AGE IS ALLOWED";
    }

    //Task 5
    public static int averageOfEdges(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        return (max + min) / 2;
    }

    //Task 6
    public static String[] noA(String[] strings) {
        String[] noAStrings = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].startsWith("A") | strings[i].startsWith("a")) {
                noAStrings[i] = "###";
            } else {
                noAStrings[i] = strings[i];
            }
        }
        return noAStrings;
    }

    // Task 7
    public static int[] no3or5(int[] ints) {
        int[] no3or5ints = new int[ints.length];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 3 == 0 & ints[i] % 5 == 0) {
                no3or5ints[i] = 101;
            } else if (ints[i] % 5 == 0) {
                no3or5ints[i] = 99;
            } else if (ints[i] % 3 == 0) {
                no3or5ints[i] = 100;
            } else {
                no3or5ints[i] = ints[i];
            }
        }
        return no3or5ints;
    }

    //Task 8
    public static Boolean isPrime(int num){
        for (int i = 2; i < num - 1; i++) {
            if(num % i == 0) return false;
        } return true;
    }
    public static int countPrimes(int[] nums){
        int count = 0;
        for (int num : nums) {
            if(num > 1 & isPrime(num)) count++;
        } return count;
    }
}