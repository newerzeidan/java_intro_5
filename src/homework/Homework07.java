package homework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class Homework07 {
    public static void main(String[] args) {

        System.out.println("\n-----TASK1-----\n");

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10,23,67,23,78));

        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers);

        System.out.println("\n-----TASK2-----\n");

        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue", "Brown", "Red", "White", "Black", "Purple"));

        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);

        System.out.println("\n-----TASK3-----\n");

        numbers = new ArrayList<>(Arrays.asList(23, -34, -56, 0, 89, 100));

        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);

        System.out.println("\n-----TASK4-----\n");

        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Istanbul", "Berlin", "Madrid", "Paris"));

        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);

        System.out.println("\n-----TASK5-----\n");

        ArrayList<String> marvel = new ArrayList<>(Arrays.asList("Spider Man", "Iron Man", "Black Panter", "Deadpool", "Captain America"));

        System.out.println(marvel);
        System.out.println(marvel.contains("Wolverine"));





        System.out.println("\n-----TASK6-----\n");

        ArrayList<String> avengers = new ArrayList<>(Arrays.asList("Hulk", "Black Widow", "Captain America", "Iron Man"));

        Collections.sort(avengers);
        System.out.println(avengers);
        System.out.println(avengers.contains("Hulk") && avengers.contains("Iron Man"));







        System.out.println("\n-----TASK7-----\n");

        ArrayList<Character> char1 = new ArrayList<>(Arrays.asList('A', 'x', '$', '%', '9', '*', '+', 'F', 'G'));

        System.out.println(char1);

        for (Character c : char1) {
            System.out.println(c);
        }

        System.out.println("\n-----TASK8-----\n");

        ArrayList<String> objects = new ArrayList<>(Arrays.asList("Desk", "Laptop", "Mouse", "Monitor", "Mouse-Pad", "Adapter"));

        int beginsWithM = 0;
        int notContainAOrE = 0;

        for (String o: objects) {
            if (o.toLowerCase().startsWith("m")) beginsWithM++;
            if (!(o.toLowerCase().contains("a") || o.toLowerCase().contains("e")))
                notContainAOrE++;

        }
        System.out.println(objects);
        Collections.sort(objects);
        System.out.println(objects);

        System.out.println(beginsWithM);
        System.out.println(notContainAOrE);


        System.out.println("\n-----TASK9-----\n");

        ArrayList<String> kitchen = new ArrayList<>(Arrays.asList("Plate", "spoon", "fork", "Knife", "cup", "Mixer"));

        System.out.println(kitchen);

        int countUpperCase = 0;
        int countLowerCase = 0;
        int countP = 0;
        int startsWithOrEndsWith = 0;

        for (String s : kitchen) {
            if (Character.isUpperCase(s.charAt(0))) countUpperCase++;
            else countLowerCase++;
            if (s.toLowerCase().startsWith("p") || s.toLowerCase().endsWith("p"))
            {
                countP++;
                startsWithOrEndsWith ++;
            } else if (s.toLowerCase().contains("p")) countP++;
        }

        System.out.println("Elements starts with uppercase = " + countUpperCase);
        System.out.println("Elements starts with lowercase = " + countLowerCase);
        System.out.println("Elements having P or p= " + countP);
        System.out.println("Elements starting or ending with P or p = " + startsWithOrEndsWith);

        System.out.println("\n-----TASK10-----\n");

        numbers = new ArrayList<>(Arrays.asList(3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78));

        System.out.println(numbers);

        int dividedBy10 = 0;
        int evenNumbersGreaterThan15 = 0;
        int oddNumbersLessThan20 = 0;
        int elementsLessThan15OrGreaterThan50 = 0;

        /*for (Integer i : numbers) {
            if (i % 10 == 0) dividedBy10++;
            if (i > 15 && i % 2 == 0) evenNumbersGreaterThan15++;
            if (i < 20 && i % 2 == 1) oddNumbersLessThan20++;
            if (i < 15 || i > 50) elementsLessThan15OrGreaterThan50++;
        }
         */

        for (Integer i : numbers) {
            if(i%2 == 0){
                if(i % 10 == 0) dividedBy10++;
                if(i>15) evenNumbersGreaterThan15++;
            }else if(i < 20) oddNumbersLessThan20++;
            if(i<15 || i>50) elementsLessThan15OrGreaterThan50++;
        }

        System.out.println("Elements that can be divided by 10 = " + dividedBy10);
        System.out.println("Elements that are even and greater than 15 = " + evenNumbersGreaterThan15);
        System.out.println("Elements that are odd and less than 20 = " + oddNumbersLessThan20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + elementsLessThan15OrGreaterThan50);
    }
}