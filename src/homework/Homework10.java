package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Homework10 {
    public static void main(String[] args) {
        System.out.println("--------Task01--------");
        System.out.println(countWords("      How many words are in here       "));

        System.out.println("--------Task02--------");
        System.out.println(countA("TechGlobal is a QA bootcamp"));

        System.out.println("--------Task03--------");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-45, 0, 0, 34, 5, 67));
        System.out.println(countPos(numbers));

        System.out.println("--------Task04--------");
        ArrayList<Integer> dupes = new ArrayList<>(Arrays.asList(10, 20, 35, 20, 35, 60, 70, 60));
        System.out.println(removeDuplicateNumbers(dupes));


        System.out.println("--------Task05--------");
        ArrayList<String> dupE = new ArrayList<>(Arrays.asList("java”, “C#”, “ruby”, “JAVA”, “ruby”, “C#”, “C++"));
        System.out.println(removeDuplicateElements(dupE));


        System.out.println("--------Task06--------");
        System.out.println(removeExtraSpaces("   I   am      learning     Java      "));


        System.out.println("--------Task07--------");
        int[] num1 = {3, 0, 0, 7, 5, 10};
        int[] num2 = {6, 3, 2};
        System.out.println(Arrays.toString(sumOfArrays(num2, num1)));


        System.out.println("--------Task08--------");
        int[] num3 = {10, -13, 8, 12, 15, -20};
        System.out.println(findClosestTo10(num3));
    }

    //Task01
    public static int countWords(String str) {
        return str.trim().split("[ ]+").length;
    }
    //Task02
    public static int countA(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'a') counter++;
        }
        return counter;
    }
    //Task03
    public static int countPos(ArrayList<Integer> numbers){
     int counter3 = 0;
        for (Integer integer : numbers) {
            if (integer > 0) counter3++;
        }
        return counter3;
    }
    //Task04
    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> dupe){
        HashSet<Integer> removeD = new HashSet<>();
        removeD.addAll(dupe);
        ArrayList<Integer> dupes = new ArrayList<>();
        dupes.addAll(removeD);
        return dupes;
        }

    //Task05
    public static ArrayList<String> removeDuplicateElements(ArrayList<String> dupEE){
        HashSet<String> removeE = new HashSet<>();
        removeE.addAll(dupEE);
        ArrayList<String> noDupsE = new ArrayList<>();
        noDupsE.addAll(removeE);
        return noDupsE;
    }
    //Task06
    public static String removeExtraSpaces(String str) {
        String finalString = " ";
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) == ' ')) {
                continue;
            } else finalString += str.charAt(i);
        }
        return finalString;
    }
    //Task07
    public static int[] sumOfArrays(int[] first, int[] second) {
        int[] third = new int[Math.max(first.length, second.length)];
        for (int i = 0; i < Math.min(first.length, second.length); i++) {
            third[i] = first[i] + second[i];
        }
        for (int i = Math.min(first.length, second.length); i < third.length; i++) {
            if (first.length > second.length){
                third[i] = first[i];
            }else {
                third[i] = second[i];
            }
        }
        return third;
    }
    //Task08
    public static int findClosestTo10(int[] array){
        int min=0,max=10,nearestNumber;
        int myNumber = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i]<myNumber){
                if( min==0){
                    min=array[i];
                } else if(array[i]>min){
                    min=array[i];}
            } else if(array[i]>myNumber) {
                if(max==10) {
                    max=array[i];
                }
                else if(array[i]<max){
                    max=array[i];}
            }
            else
            {
                return array[i];
            }
        } if(Math.abs(myNumber-min)<Math.abs(myNumber-max)){
            nearestNumber=min;
        }
        else
        {
            nearestNumber=max;
        }
        return nearestNumber;
    }
}

