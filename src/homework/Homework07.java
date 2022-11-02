package homework;

import com.sun.corba.se.impl.encoding.CDROutputObject;
import projects.Project05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework07 {
    public static void main(String[] args) {


        System.out.println("\n------Task-1------\n");


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(23);
        numbers.add(67);
        numbers.add(23);
        numbers.add(78);

        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));

        System.out.println(numbers);


        System.out.println("\n------Task-2------\n");

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Brown");
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Purple");

        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));

        System.out.println(colors);


        System.out.println("\n------Task-3------\n");

        ArrayList<Integer> numbers3 = new ArrayList<>();

        numbers3.add(23);
        numbers3.add(-34);
        numbers3.add(-56);
        numbers3.add(0);
        numbers3.add(89);
        numbers3.add(100);

        System.out.println(numbers3);
        Collections.sort(numbers3);
        System.out.println(numbers3);


        System.out.println("\n------Task-4------\n");

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Paris");

        System.out.println(cities);

        Collections.sort(cities);
        System.out.println(cities);


        System.out.println("\n------Task-5------\n");

        ArrayList<String> Characters = new ArrayList<>();

        Characters.add("Spider Man");
        Characters.add("Iron Man");
        Characters.add("Black Man");
        Characters.add("Deadpool");
        Characters.add("Captain America");

        System.out.println(Characters);

        if (Characters.contains("Wolverine")) {
            System.out.println("true");
        } else System.out.println("false");


        System.out.println("\n------Task-6------\n");

        ArrayList<String> AvengersCharacters = new ArrayList<>();

        AvengersCharacters.add("Hulk");
        AvengersCharacters.add("Black Widow");
        AvengersCharacters.add("Captain America");
        AvengersCharacters.add("Iron Man");

        Collections.sort(AvengersCharacters);
        System.out.println(AvengersCharacters);

        if (AvengersCharacters.contains("Hulk")) {
            if (AvengersCharacters.contains("Iron Man")) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

        }

        System.out.println("\n------Task-7------\n");

        ArrayList<Character> characters7 = new ArrayList<>();

        characters7.add('A');
        characters7.add('x');
        characters7.add('$');
        characters7.add('9');
        characters7.add('*');
        characters7.add('+');
        characters7.add('F');
        characters7.add('G');

        System.out.println(characters7);

        for (Character character : characters7) {
        }
        System.out.println(characters7);


        System.out.println("\n------Task-8------\n");

        ArrayList<String> objects = new ArrayList<>(Arrays.asList());

        objects.add("Desk");
        objects.add("Laptop");
        objects.add("Mouse");
        objects.add("Monitor");
        objects.add("Mouse-Pad");
        objects.add("Adaptor");

        System.out.println(objects);

        Collections.sort(objects);

        System.out.println(objects);

        int countMm = 0;
        int missingAeE = 0;

        for (String object : objects) {
            if(object.toLowerCase().startsWith("m"))countMm++;
            if(!object.toLowerCase().contains("a") && ! object.toLowerCase(). contains ("e")) missingAeE++;
        }
        System.out.println(countMm);
        System.out.println(missingAeE);


        System.out.println("\n------Task-9------\n");

        String [] kitchenObjects = {"Plate", "spoon", "fork", "Knife", "cup", "Mixer"};
        ArrayList<String> kitchen = new ArrayList<>(Arrays.asList(kitchenObjects));
        System.out.println(kitchen);

        int startsUppercase = 0;
        int startsLowercase = 0;
        int hasPp = 0;
        int startsEndsPp = 0;


        for (String element : kitchen) {
            if(Character.isUpperCase(element.charAt(0))) startsUppercase++;
            if(Character.isLowerCase(element.charAt(0))) startsLowercase++;
            if(element.toLowerCase().contains("p")) hasPp++; // why element and not character-> it did not work
            if(element.toLowerCase().startsWith("p") || element.toLowerCase().endsWith("p")) startsEndsPp++; //   ) ||
        }

        System.out.println("Elements starts with Uppercase = " + startsUppercase);
        System.out.println("Elements starts with Lowercase = " + startsLowercase);
        System.out.println("Elements having P or p = " + hasPp);
        System.out.println("Elements starting or ending with P or p = " + startsEndsPp);




        System.out.println("\n------Task-10------\n");

        Integer[] data = { 3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78}; // why wrapper class here
        ArrayList<Integer> data10 = new ArrayList<>(Arrays.asList(data));
        System.out.println(data10);

        int dividedBy10 = 0;
        int evenGreaterThan15 = 0;
        int oddLessThan20 = 0;
        int lessThan15GreaterThan20 = 0;

        for (Integer elements : data10) {
            if(elements % 10 == 0) dividedBy10++;
            if(elements % 2 == 0 && elements > 15) evenGreaterThan15++;
            if(elements % 2 == 1 && elements < 20) oddLessThan20++;
            if(elements < 15 || elements > 50) lessThan15GreaterThan20++;
        }


        System.out.println("Elements that can be divided by 10 = " + dividedBy10);
        System.out.println("Elements that are even and greater than 15 = " + evenGreaterThan15);
        System.out.println("Elements that are odd and less than 20 = " + oddLessThan20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + lessThan15GreaterThan20);

    }}