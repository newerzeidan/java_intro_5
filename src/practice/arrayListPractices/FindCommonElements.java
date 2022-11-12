package practice.arrayListPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class FindCommonElements {
    public static void main(String[] args) {

        System.out.println("---Example 1---");
        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(10, 20, 20, 30, 50, 70));
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(20, 50, 70, 100, 300));
        printCommonElements(numbers1, numbers2); // 20, 50, 70 (in separate lines in the console)


        System.out.println("\n---Example 2---");
        ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(30, 50, 70));
        ArrayList<Integer> numbers4 = new ArrayList<>(Arrays.asList(20, 100, 300));
        printCommonElements(numbers3, numbers4); // There is no matching elements
    }

    /*
    Create a public static method which will take two ArrayLists, and it will find the common
    elements between them then print it

    Test Data 1:
        numbers1 = {10, 20, 30, 50, 70};
        numbers2 = {20, 50, 70, 100, 300};

    Expected Output 1:
        20
        50
        70

    Test Data 2:
        numbers1 = {30, 50, 70};
        numbers2 = {20, 100, 300};

    Expected Output 2:
        There is no matching elements
     */
    public static void printCommonElements(ArrayList<Integer> nums1, ArrayList<Integer> nums2){
        ArrayList<Integer> commons = new ArrayList<>();

        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                // nums1.get(i).equals(nums2.get(j)) -> get the element from the first and second array and compare them
                // !commons.contains(nums1.get(i))) -> if you already checked this element skip it
                if(nums1.get(i).equals(nums2.get(j)) && !commons.contains(nums1.get(i))) commons.add(nums1.get(i));
            }
        }
        if(commons.isEmpty()) System.out.println("There is no matching elements");
        else commons.forEach(System.out::println);
    }
}