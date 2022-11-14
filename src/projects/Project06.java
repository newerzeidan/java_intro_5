package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Project06 {
    public static void main(String[] args) {

        System.out.println("--------Task 1--------");
        String[] str = {"foo", "", " ", "foo bar", "java is fun", " ruby "};
        System.out.println(countMultipleWords(str));


        System.out.println("\n--------Task 2--------");
        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(1,2,3,-4));
        removeNegatives(number);

        System.out.println("\n--------Task 3--------");
        validatePassword("Abcd123!");

        System.out.println("\n--------Task 4--------");
        System.out.println(emailIsValid("abcd@gmail.com"));
    }
    //Task 1
    public static int countMultipleWords(String[] str) {
        int count = 0;
        for (String element : str) {
            for (int i = 1; i < element.length() - 1; i++) {
                if (element.charAt(i) == ' ' && Character.isLetter(element.charAt(i - 1))
                        && Character.isLetter(element.charAt(i + 1))){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    //Task 2
    public static void removeNegatives(ArrayList<Integer> numbers){
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 0 ){
                numbers.remove(numbers.get(i));
                i--;
            }

        }
        System.out.println(numbers);

    }

    //Task 3
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
    //Task 4

    public static boolean emailIsValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }


}