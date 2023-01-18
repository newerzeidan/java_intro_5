package homework;

import java.util.*;

public class Homework15 {
    public static void main(String[] args) {
        System.out.println("----------Task 1----------");
        System.out.println(Arrays.toString(fibonacciSeries(3)));

        System.out.println("\n----------Task 2----------");
        System.out.println(fibonacciSeries2(2));

        System.out.println("\n----------Task 3----------");
        System.out.println(Arrays.toString(findUniques(new int[]{}, new int[]{1, 2, 3, 2})));

        System.out.println("\n----------Task 4----------");
        System.out.println(isPowerOf3(81));

        System.out.println("\n----------Task 5----------");
        System.out.println(firstDuplicate5(new int[]{1}));
    }

    //Task 1
    public static int[] fibonacciSeries(int num){
        int[] arr = new int[num];
        arr[0] = 0;
        arr[1] = 1;

        int firstTerm =  0;
        int secondTerm = 1;

        for (int i = 2; i < num; i++) {
            int nextTerm = firstTerm + secondTerm;
            arr[i] = nextTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        return arr;
    }

    //Task 2
    public static int fibonacciSeries2(int num){
        if(num == 0) return 0;
        if(num == 1) return 1;

        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber = 0;
        for (int i = 3; i <= num; i++) {
            nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
        return nextNumber;
    }

    //Task 3
    public static int[] findUniques(int[] a, int[] b){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        for (int element : a) {
            listA.add(element);
        }
        for (int element : b) {
            listB.add(element);
        }

        for (Integer value : listA) {
            if (!list.contains(value) && !listB.contains(value)) list.add(value);
        }
        for (Integer integer : listB) {
            if (!list.contains(integer) && !listA.contains(integer)) list.add(integer);
        }
        int[] uniques = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            uniques[i] = list.get(i);
        }
        return uniques;
    }

    //Task 4
    public static boolean isPowerOf3(int number){//27
        int power = 3;
        while(power < number){
            power = power * 3;
        }
        return power == number;
    }

    //Task 5
    public static int firstDuplicate5(int[] arr){
        int duplicate = -1;
        int iOfDuplicate = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j =i+1; j < arr.length; j++) {
                if(arr[i] == arr[j] && j < iOfDuplicate) {
                    duplicate = arr[i];
                    iOfDuplicate = j;
                }
            }
        }
        return duplicate;
    }
}
