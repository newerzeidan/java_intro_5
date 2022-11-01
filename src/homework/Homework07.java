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

        String [] object = {"Desk", "Laptop", "Mouse", "Mouse-Pad", "Adapter"};
        ArrayList<String> objects = new ArrayList<>(Arrays.asList(object));
        System.out.println(object);
    }}