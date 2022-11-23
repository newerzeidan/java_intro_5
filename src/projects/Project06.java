package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Project06 {
    public static void main(String[] args) {

        System.out.println("---Task 1---");
        String[] str = {"foo", "", " ", "foo bar", "java is fun", " abc", " ruby"};
        System.out.println(countMultipleWords(str));


        System.out.println("\n---Task 2---");
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15));
        removeNegatives(nums);


        System.out.println("\n---Task 3---");
        validatePassword("Abcd123!");


        System.out.println("\n---Task 4---");
        System.out.println(emailIsValid("abc@@gmail.com"));
    }
    //Task 1
    public static int countMultipleWords(String[] arrayName) {
        int count = 0;
        for (String words : arrayName) {
            for (int i = 1; i < words.length() - 1 ; i++) {
                if (words.charAt(i) == ' ' && Character.isLetter(words.charAt(i - 1)) && Character.isLetter(words.charAt(i + 1))){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    //TASK 2
    public static void removeNegatives(ArrayList<Integer> nums){
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < 0 ){
                nums.remove(nums.get(i));
                i--;
            }
        }
        System.out.println(nums);
    }

    //TASK 3
    public static void validatePassword(String str){

        if (str.length() >= 8 && str.length() <= 16){
            int countDigit = 0, countUpper = 0, countLower = 0, countSpecial = 0;
            for (int i = 0; i < str.length(); i++){
                if (Character.isUpperCase(str.charAt(i))){
                    countUpper++;
                } else if (Character.isLowerCase(str.charAt(i))) {
                    countLower++;
                } else if (Character.isDigit(str.charAt(i))) {
                    countDigit++;
                } else if (str.charAt(i) != ' '){
                    countSpecial++;
                }
            }if (countLower > 0 & countUpper > 0 & countDigit > 0 & countSpecial > 0){
                System.out.println(true);
            }else System.out.println(false);
        }
    }

    //TASK 4
    public static boolean emailIsValid(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(emailRegex);
        if (email == null) return false;

        return pattern.matcher(email).matches();
    }
}