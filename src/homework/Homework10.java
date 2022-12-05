import java.util.ArrayList;
import java.util.Arrays;

public class Homework10 {
    public static void main(String[] args) {
        System.out.println("==========TASK01==========\n");
        System.out.println(countWords("   @#$"));

        System.out.println("\n==========TASK02==========\n");
        System.out.println(countA(""));

        System.out.println("\n==========TASK03==========\n");
        System.out.println(countPos(new ArrayList<>(Arrays.asList(5, -9, 0, 6, 3, 0, -1))));

        System.out.println("\n==========TASK04==========\n");
        System.out.println(removeDuplicates(new ArrayList<>(Arrays.asList(10, 20, 35, 20, 35, 60, 70, 60))));

        System.out.println("\n==========TASK05==========\n");
        System.out.println(removeDuplicatesElements(new ArrayList<>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"))));

        System.out.println("\n==========TASK06==========\n");
        System.out.println(removeExtraSpaces("  I   am      learning     Java     "));

        System.out.println("\n==========TASK07==========\n");
        System.out.println(Arrays.toString(add(new int[]{3, 0, 0, 7, 5, 10}, new int[]{6, 3, 2})));

        System.out.println("\n==========TASK08==========\n");
        System.out.println(findClosestTo10(new int[]{10, -13, 8, 12, 15, -20}));

    }

    //////////////////////////////////////////////TASK01//////////////////////////////////////////////
    public static int countWords(String str) {
        if (str.replaceAll("[^a-zA-Z]", "").isEmpty()) return 0;
        return str.trim().split("\\s+").length;
       /*
       WAY 2:
       str = str.replaceAll("[^a-zA-Z ]", "");
        boolean isWord = false;
        int counter = 0;
        int i = 0;
        while(i<str.length()){
            if(str.charAt(i) == ' ')isWord = true;
            else if(isWord){
                isWord = false;
                counter++;
            }
            i++;
        }
        return counter;
        */
    }


    //////////////////////////////////////////////TASK02//////////////////////////////////////////////
    public static int countA(String str) {
        return str.replaceAll("[^aA]", "").length();
    }

    //////////////////////////////////////////////TASK03//////////////////////////////////////////////
    public static int countPos(ArrayList<Integer> arr) {
        int counter = 0;

        for (int i : arr) {
            if (i > 0) counter++;
        }
        return counter;
    }

    //////////////////////////////////////////////TASK04//////////////////////////////////////////////
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> arr) {

        ArrayList<Integer> newArr = new ArrayList<>();

        for (Integer integer : arr) {
            if (!newArr.contains(integer)) newArr.add(integer);
        }
        return newArr;
    }

    //////////////////////////////////////////////TASK05//////////////////////////////////////////////
    public static ArrayList<String> removeDuplicatesElements(ArrayList<String> arr) {

        ArrayList<String> newArr = new ArrayList<>();

        for (String str : arr) {
            if (!newArr.contains(str)) newArr.add(str);
        }
        return newArr;
    }

    //////////////////////////////////////////////TASK06//////////////////////////////////////////////
    public static String removeExtraSpaces(String str) {
        return str.trim().replaceAll("\\s+", " ");
        /*
        WAY 2:
        String newStr = "";
        char[] strAsArr = str.toCharArray();
        for (int i = 0; i < strAsArr.length; i++) {
            if(strAsArr[i] != ' ') newStr += strAsArr[i];
            else if(i != strAsArr.length-1 && strAsArr[i+1] != ' ') newStr += strAsArr[i];
        }
        return newStr.trim();

         */
    }

    //////////////////////////////////////////////TASK07//////////////////////////////////////////////
    public static int[] add(int[] arr1, int[] arr2) {
        int smallerLength = Math.min(arr1.length, arr2.length);
        int largerLength = Math.max(arr1.length, arr2.length);
        int[] arr = new int[largerLength];
        for (int i = 0; i < smallerLength; i++) {
            arr[i] = arr1[i] + arr2[i];
        }

        for (int i = smallerLength; i < largerLength; i++) {
            if (arr1.length > arr2.length) arr[i] = arr1[i];
            else arr[i] = arr2[i];
        }

        return arr;
    }

    //////////////////////////////////////////////TASK08//////////////////////////////////////////////
    public static int findClosestTo10(int[] arr) {

        Arrays.sort(arr);
        int numberBefore10=0;
        int numberAfter10=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 10) numberBefore10 = arr[i];
        }
        for (int i = arr.length-1; i > 0; i--) {
            if(arr[i] > 10) numberAfter10 = arr[i];
        }

        if(arr[0] >= 10) return numberAfter10;
        else if(arr[arr.length-1] <= 10) return numberBefore10;
        else {
            if(Math.abs(10-numberBefore10) <= Math.abs(10-numberAfter10)) return numberBefore10;
            else return numberAfter10;
        }
    }
}