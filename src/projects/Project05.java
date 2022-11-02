package projects;

import java.util.Arrays;

public class Project05 {
    public static void main(String[] args) {

        System.out.println("----Task-1----");

        int [] numbers1 = {10, 7, 7, 10, -3, 10, -3};
        findGreatestAndSmallestWithSort(numbers1);


        System.out.println("\n----Task 2----");
        findGreatestAndSmallest(numbers1);


        System.out.println("\n---Task 3---");
        int[] numbers2 = {10, 5, 6, 7, 8, 5, 15, 15};
        findSecondGreatestAndSmallestWithSort(numbers2);



        System.out.println("\n---Task 4---");
        findGreatestAndSmallestWithoutSort(numbers2);



        System.out.println("\n---Task 5---");




        System.out.println("\n---Task 6---");



    }

    // Task 1
    public static void findGreatestAndSmallestWithSort(int [] numbers1) {

        Arrays.sort(numbers1);

        if(numbers1.length > 0) {
            System.out.println("Smallest = " + numbers1[0]);
            System.out.println("Greatest = " + numbers1[numbers1.length - 1]);
        }
    }

    //Task 2
    public static void findGreatestAndSmallest(int [] numbers1){

        int min = Integer.MAX_VALUE; // >
        int max = Integer.MIN_VALUE; // <

        for (int e : numbers1) {
            if(max < e) max = e;
            if(min > e) min = e;
        }
        if(numbers1.length > 0){
            System.out.println("Smallest = " + min);
            System.out.println("Greatest = " + max);
        }
    }

    // Task 3

    public static void findSecondGreatestAndSmallestWithSort (int [] numbers2){

        Arrays.sort(numbers2);

        if(numbers2.length > 0) {
            System.out.println("Second Smallest = " + numbers2[2]);
            System.out.println("Second Greatest = " + numbers2[numbers2.length - 3]);
    }

}

        // Task 4


    public static void findGreatestAndSmallestWithoutSort (int [] numbers2) {

     int firstSmallest = numbers2[0];
     int firstGreatest = numbers2[0];

     for (int i = 0; i < numbers2.length; i++){

         if (numbers2[i] > firstGreatest) firstGreatest = numbers2[i];
         if (numbers2[i] > firstSmallest) firstSmallest = numbers2[i];
        }
        int secondSmallest = Integer.MAX_VALUE;
        int secondGreatest = Integer.MIN_VALUE;
        for(int i = 0; i < numbers2.length; i++){
            if(numbers2[i] != firstSmallest && numbers2[i] < secondSmallest) secondSmallest = numbers2[i];
            if(numbers2[i] != firstGreatest && numbers2[i] > firstGreatest) firstGreatest = numbers2[i];
        }

        System.out.println("Second Smallest = " + secondSmallest);
        System.out.println("Second Greatest = " + secondGreatest);
    }

        // Task 5

}



