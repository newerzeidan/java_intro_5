package projects;

import java.util.ArrayList;
import java.util.Arrays;

public class Project08 {
    public static void main(String[] args) {

        System.out.println("---Task 1---");
        int[] number1 = {10, -5, 20, 50, 100};
        System.out.println(findClosestDistance(number1));


        System.out.println("\n---Task 2---");
        int[] number2 = {5, 3, -1, 3, 5, 7, -1};
        System.out.println(findSingleNumber(number2));


        System.out.println("\n---Task 3---");
        String str = "Hello";
        System.out.println(findFirstUniqueCharacter(str));


        System.out.println("\n---Task 4---");
        int[] number4 = {4, 7, 8, 6};
        System.out.println(findMissingNumber(number4));
    }

    //Task 1
    public static int findClosestDistance(int[] nums) {
        int closestDif = Integer.MAX_VALUE;
        if (nums.length < 2) return -1;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) < closestDif) closestDif = Math.abs(nums[i] - nums[j]);
            }
        }
        return closestDif;
    }


    //Task 2
    public static int findSingleNumber(int[] nums) {
        ArrayList nums1 = new ArrayList<>();
        for (int num : nums) {
            nums1.add(num);
        }
        for (int i = 0; i < nums1.size(); i++) {
            Object num = nums[i];
            nums1.remove(i);
            if (!nums1.contains(num)) {
                return nums[i];
            } else {
                nums1.add(i, num);
            }
        }
        return 1;
    }

    //Task 3
    public static char findFirstUniqueCharacter(String words) {
        ArrayList<Character> words1 = new ArrayList<>();
        for (int i = 0; i < words.length(); i++) {
            words1.add(words.charAt(i));
        }
        for (int i = 0; i < words1.size(); i++) {
            char letter = words1.get(i);
            words1.remove(i);
            if (!words1.contains(letter)) {
                return letter;
            } else {
                words1.add(i, letter);
            }
        }
        return ' ';
    }

    //Task 4
    public static int findMissingNumber(int[] numbers){
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 1; i++) {
            if(numbers[i] + 1 != numbers[i + 1]) return numbers[i] + 1;
        } return 1;
    }
}