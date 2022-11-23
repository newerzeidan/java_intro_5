package homework;

import java.util.ArrayList;

public class Homework09 {

        public static void main(String[] args) {

            System.out.println("\n------Task 1------\n");

            int[] numbers = {-4, 0, -7, 0, 5, 10, 45, 45};
            boolean isDuplicate = false;
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]){
                        System.out.println(numbers[i]);
                        isDuplicate = true;
                        break;
                    }
                }
                if (isDuplicate) break;
            }
            if (!isDuplicate) System.out.println("There is no duplicates");


            System.out.println("\n------Task 2------\n");

            String[] words = {"Z", "abc", "z", "123", "#" };
            boolean isDuplicateTask2 = false;

            for (int i = 0; i < words.length; i++) {
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equalsIgnoreCase(words[j])){
                        System.out.println(words[j]);
                        isDuplicateTask2 = true;
                        break;
                    }
                }
                if (isDuplicateTask2) break;
                if (!isDuplicateTask2) System.out.println("There is no duplicates");
            }


            System.out.println("\n ------Task 3------\n");

            int[] numbersTask3 = {0, -4, -7, 0, 5, 10, 45, -7, 0};
            String str = "";

            for (int i = 0; i < numbersTask3.length; i++) {
                for (int j = i + 1; j < numbersTask3.length; j++) {
                    if (numbersTask3[i] == numbersTask3[j] && !str.contains(numbersTask3[i] + "")){
                        str += numbersTask3[i];
                        System.out.println(numbersTask3[i]);
                    }
                }
            }
            if (str.isEmpty()) System.out.println("There is no duplicates");



            System.out.println("\n------Task 4------\n");

            String[] wordsTask4 = {"A", "foo", "12" , "Foo", "bar", "a", "a", "java"};
            String strTask3 = "";
            for (int i = 0; i < wordsTask4.length; i++) {
                for (int j = i + 1; j < wordsTask4.length; j++) {
                    if (wordsTask4[i].equalsIgnoreCase(wordsTask4[j]) &&
                            !strTask3.toLowerCase().contains(wordsTask4[j])){
                        System.out.println(wordsTask4[i]);
                        strTask3 += wordsTask4[i];
                    }
                }
            }
            if (strTask3.isEmpty())
                System.out.println("There is no duplicates");



            System.out.println("\n------Task 5------\n");

            String[] wordsTask5 = {"abc", "foo", "bar"};
            ArrayList<String> wordsContainer = new ArrayList<String>();
            for (int i = wordsTask5.length - 1; i >= 0; i--) wordsContainer.add(wordsTask5[i]);
            System.out.println(wordsContainer);


            System.out.println("\n------Task 6------\n");

            String strTask6 = "Java is fun";
            String[] mirroredStr = strTask6.split(" ");
            for (int i = 0; i < mirroredStr.length; i++){
                for (int j = mirroredStr[i].length() - 1; j >= 0; j--) {
                    System.out.print(mirroredStr[i].charAt(j));
                }
                System.out.print(" ");
            }
        }


    }
