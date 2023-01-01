package homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework13 {
    public static void main(String[] args) {
        System.out.println("---Task 1---");
        String s = "JAVA";
        System.out.println(hasLowerCase(s));

        System.out.println("\n---Task 2---");
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(0, 1, 10));
        System.out.println(noZero(nums));

        System.out.println("\n---Task 3---");
        int[] squares = {1, 2, 3};
        System.out.println(Arrays.deepToString(numberAndSquare(squares)));

        System.out.println("\n---Task 4---");
        String[] words = {"abc", "foo", "java"};
        String str = "hello";
        System.out.println(containsValue(words,str));

        System.out.println("\n--- Task 5---");
        String reverse = "Java is fun";
        System.out.println(reverseSentence(reverse));

        System.out.println("\n---Task 6---");
        String remove = "Selenium";
        System.out.println(removeStringSpecialDigits(remove));

        System.out.println("\n---Task 7---");
        String[] removeArray = {"Java", "#$%is", "fun"};
        System.out.println(Arrays.toString(removeArraySpecialDigits(removeArray)));

        System.out.println("\n---Task 8---");
        ArrayList<String> array1 = new ArrayList<>(Arrays.asList("Java", "is", "fun"));
        ArrayList<String> array2 = new ArrayList<>(Arrays.asList("Java", "C#", "Python"));
        System.out.println(removeAndReturnCommons(array1, array2));

        System.out.println("\n---Task 9---");
        ArrayList<String> removingX = new ArrayList<>(Arrays.asList("xyz", "123", "#$%"));
        System.out.println(noXinVariables(removingX));
    }


    // Task 1
    public static Boolean hasLowerCase(String s){
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLowerCase(s.charAt(i))) return true;
        }
        return false;
    }

    //Task 2
    public static ArrayList<Integer> noZero(ArrayList<Integer> nums){
        nums.removeIf(i -> i == 0);
        return nums;
    }

    //Task 3
    public static int[][] numberAndSquare(int[] nums){
        int[][] squares = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            squares[i][0] = nums[i];
            squares[i][1] = nums[i] * nums[i];
        }
        return squares;
    }

    //Task 4
    public static Boolean containsValue(String[] strs, String str){
        return new ArrayList<String>(Arrays.asList(strs)).contains(str);
    }

    //Task 5
    public static String reverseSentence(String s){
        String[] split = s.split(" ");
        if(split.length < 2) return "There is not enough words!";
        split[split.length - 1] = split[split.length - 1].substring(0,1).toUpperCase() + split[split.length - 1].substring(1);
        split[0] = split[0].toLowerCase();
        String str = "";
        for (int i = split.length - 1; i >= 0; i--){
            str += " " + split[i];
        }
        return str.substring(1);
    }

    //Task 6
    public static String removeStringSpecialDigits(String s){
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ' || Character.isLetterOrDigit(s.charAt(i))) str += s.charAt(i);
        } return str;
    }

    //Task 7
    public static String[] removeArraySpecialDigits(String[] strings){
        String[] removed = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            removed[i] = "";
            for (int j = 0; j < strings[i].length(); j++) {
                if(strings[i].charAt(j) == ' ' | Character.isLetterOrDigit(strings[i].charAt(j))) removed[i] += strings[i].charAt(j);
            }
        } return removed;
    }

    //Task 8
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> s1, ArrayList<String> s2){
        s1.retainAll(s2);
        return s1;
    }

    //Task 9
    public static ArrayList<String> noXinVariables(ArrayList<String> strings){
        ArrayList<String> modifiedStrings = new ArrayList<>();
        for (String string : strings) {
            StringBuilder s = new StringBuilder(string);
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == 'x' | s.charAt(i) == 'X') {
                    s.deleteCharAt(i);
                    i--;
                }
            }
            modifiedStrings.add(s.toString());
        } modifiedStrings.removeIf(String::isEmpty);
        return modifiedStrings;
    }
}