package arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {
        /*
        Dec
         */

        //Storing an array in a String
        String name = "John";

        //Storing best friends name
        String bff1= "Jane", bff2 = "Alex", bff3 ="Mike";

        //Storing more names
        int i = 26;
        char c = 'A';
        double balance = 10;


        String name1 = "James";

        String[] names = {"Beyza", "Andrii", "Vlad" , "Samir", "Olena"}; // holds a collection of names

        //Retrieving an element from an array using index
        System.out.println(names[2]); // Vlad
        System.out.println(names[4]); // Olena


         // ArrayIndexOutOfBoundException
        // System.out.println(names[5]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
       // System.out.println(names[-3]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5

        int age = 25;

        int[] ages ={21,23,25};
        System.out.println(2); // 25











    }
}
