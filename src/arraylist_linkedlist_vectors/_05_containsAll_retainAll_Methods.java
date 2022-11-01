package arraylist_linkedlist_vectors;

import java.util.ArrayList;

public class _05_containsAll_retainAll_Methods {
    public static void main(String[] args) {
        ArrayList <String> countries = new ArrayList<>();
        countries.add("Italy");
        countries.add("USA");
        countries.add("Canada");
        countries.add("Germany");
        countries.add("Spain");
        countries.add("Portugal");
        countries.add("Sweden");


        /*
        Check if the countries ArrayList contains spain
        Print true if it contains, and false otherwise

        Expected:
        true
         */


        System.out.println(countries.contains("Spain")); // true

        /*
        Check if the countries ArrayList contains Sweden and Denmark

        Expected:
        false
         */

        System.out.println(countries.contains("Sweden") && countries.contains("Denmark"));



        /*
        Check if the countries ArrayList contains Sweden, Spain, Germany, Portugal

        Expected:
        true
         */

        ArrayList<String> europeCountries = new ArrayList<>();

        europeCountries.add("Sweden");
        europeCountries.add("Spain");
        europeCountries.add("Germany");
        europeCountries.add("Portugal");

        System.out.println(countries.containsAll(europeCountries)); // true


    }
}
