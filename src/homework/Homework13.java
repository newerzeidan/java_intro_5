package homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework13 {
    //////////////////////TASK1
    public static boolean hasLowerCase(String str){
        return !str.replaceAll("[^a-z]", "").isEmpty();
    }
    //////////////////////TASK2
    public static ArrayList<Integer> noZero(ArrayList<Integer> arr){
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) {
                arr.remove(i);
                i--;
            }

        }
        return  arr;
    }

    //////////////////////TASK3
    public static int[][] numberAndSquare(int[] arr){
        int[][] arr2D = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            arr2D[i][0] = arr[i];
            arr2D[i][1] = arr[i] * arr[i];
        }
        return arr2D;
    }
    //////////////////////TASK4
    public static boolean containsValue(String str, String[] arr){
        return Arrays.asList(arr).contains(str);
    }

    //////////////////////TASK5
    public static String reverseSentence(String str){
        String reversedSent = "";
        String[] arr = str.toLowerCase().split(" ");
        if(arr.length < 2) return "There is not enough words!";
        for (int i = arr.length-1; i >= 0; i--) {
            reversedSent += arr[i] + " ";
        }
        return reversedSent.substring(0,1).toUpperCase() + reversedSent.substring(1, reversedSent.length()-1);
    }

    //////////////////////TASK6
    public static String removeStringSpecialsDigits(String str){
        return str.replaceAll("[^a-zA-Z ]", "");
    }

    //////////////////////TASK7
    public static ArrayList<String> removeArraySpecialsDigits(ArrayList<String> arr){
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, arr.get(i).replaceAll("[^a-zA-Z]", ""));
        }
        return arr;
    }


    //////////////////////TASK8
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> arr1, ArrayList<String> arr2){
        ArrayList<String> newArr = new ArrayList<>();
        for (String s1 : arr1) {
            for (String s2 : arr2) {
                if(s1.equals(s2) && !newArr.contains(s1)) {
                    newArr.add(s1);
                    break;
                }
            }
        }
        return newArr;
    }

    //////////////////////TASK9
    public static ArrayList<String> noXInVariables(ArrayList<String> arr){
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).replaceAll("[xX]", "").equals("")){
                arr.remove(i);
                i--;
            } else arr.set(i, arr.get(i).replaceAll("[xX]",""));
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("================TASK9===============\n");
        System.out.println(noXInVariables(new ArrayList<String>(Arrays.asList("xxxx", "xxxx", "xxxx"))));

        System.out.println("\n================TASK8===============\n");
        System.out.println(removeAndReturnCommons(new ArrayList<String>(Arrays.asList("Java", "is", "fun")),
                new ArrayList<String>(Arrays.asList("Java", "xxxdx", "xxsxx"))));

        System.out.println("\n================TASK7===============\n");
        System.out.println(removeArraySpecialsDigits(new ArrayList<String>(Arrays.asList("123", "456", "sfdgs4556"))));

        System.out.println("\n================TASK6===============\n");
        System.out.println(removeStringSpecialsDigits("Ja435v3&a( 43&i(05s736 6488fu:)n"));

        System.out.println("\n================TASK5===============\n");
        System.out.println(reverseSentence("Hello"));

        System.out.println("\n================TASK4===============\n");
        System.out.println(containsValue("hello", new String[]{"xyz", "123", "helelo"}));

        System.out.println("\n================TASK3===============\n");
        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{0, 1, 2, 3, 4, 5})));

        System.out.println("\n================TASK2===============\n");
        System.out.println(noZero(new ArrayList<Integer>(Arrays.asList(0, 1,20,3,4,0,5))));

        System.out.println("\n================TASK1===============\n");
        System.out.println(hasLowerCase(""));
    }
}