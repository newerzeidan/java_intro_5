package homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework09 {

    public static void main(String[] args) {
        System.out.println("==========Task01==========\n");
        int[] arr = {3, 4, 3, 3, 5, 5, 6, 6, 7};

        ArrayList<Integer> list = new ArrayList<>();
        String dup = "There is no duplicates";

        for (Integer i : arr) {
            if(!list.contains(i))list.add(i);
            else {
                dup = Integer.toString(i);
                break;
            }
        }
        System.out.println(dup);

        /*
         String firstDuplicate = "There is no duplicates";

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    firstDuplicate = Integer.toString(arr[i]);
                    break;
                }
            }
            if(!firstDuplicate.equals("There is no duplicates")) break;
        }
        System.out.println(firstDuplicate);
         */

        System.out.println("\n==========Task02==========\n");

        String[] strArr =   {"xyz", "java", "abc"};
        dup = "There is no duplicates";

        for (int i = 0; i < strArr.length-1; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i].equalsIgnoreCase(strArr[j])) {
                    dup = strArr[i];
                    break;
                }
            }
            if(!dup.equals("There is no duplicates")) break;
        }
        System.out.println(dup);


        System.out.println("\n==========Task03==========\n");

        int[] numbers = {0, -4, -7, 0, 5, 10, 45, -7, 0};
        list = new ArrayList<>();
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (Integer i : numbers) {
            if(!list.contains(i))list.add(i);
            else if(!duplicates.contains(i)) duplicates.add(i);
        }
        if(duplicates.size() == 0) System.out.println("There is no duplicates");
        else {
            for (Integer duplicate : duplicates) {
                System.out.println(duplicate);
            }
        }


        System.out.println("\n==========Task04==========\n");

        strArr = new String[]{"A", "foo", "12", "Foo", "bar", "a", "a", "java"};
        ArrayList<String> strList = new ArrayList<>();
        for (int i = 0; i < strArr.length-1; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i].equalsIgnoreCase(strArr[j]) && !strList.contains(strArr[i].toLowerCase())) {
                    strList.add(strArr[i].toLowerCase());
                    System.out.println(strArr[i]);
                    break;
                }
            }
        }
        if(strList.size() == 0) System.out.println("There is no duplicates");



        System.out.println("\n==========Task05==========\n");

        String[] words = {"abc", "foo", "bar"};
        int startIndex = 0;
        int endIndex = words.length-1;
        String prevStart;
        while(startIndex < endIndex){
            prevStart  = words[startIndex];
            words[startIndex]=words[endIndex];
            words[endIndex] = prevStart;

            startIndex++;
            endIndex--;
        }

        System.out.println(Arrays.toString(words));

        System.out.println("\n==========Task06==========\n");
        String reverse = "", str = "Java is fun.";
        String[] splitStr = str.split("[ ]+");

        for (String s : splitStr) {
            reverse += new StringBuilder(s).reverse().append(" ");
        }
        System.out.println(reverse);



    }
}