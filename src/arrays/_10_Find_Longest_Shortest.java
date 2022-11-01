package arrays;

public class _10_Find_Longest_Shortest {
    public static void main(String[] args) {
        String[] colors = {"red", "blue", "yellow", "white"};

        System.out.println("Example 1: ");
        printLongestShortest(colors);
    }

    /*
    Create a public static method which will take a String array then it will print the longest and shortest
    string from that array.

    Example 1:
    Array -> String[] colors = {"red", "blue", "yellow", "white"};

    Expected Output:
        Shortest = red
        Longest = yellow
     */
    public static void printLongestShortest(String[] strings){
        /*
        1. Create containers -> 2, one for small another for big
        2. Loop -> fori, increment, two if conditions (one for small, another one for big)
        3. Print (short first)
         */

        String shortStr = strings[0],longStr = strings[0];

        for (int i = 1; i < strings.length; i++) {
            if(longStr.length() < strings[i].length()){ // my current longStr is smaller than current str re-assign it.
                longStr = strings[i];
            }
            if(shortStr.length() > strings[i].length()){ // my current shortStr is bigger than current str re-assign it.
                shortStr = strings[i];
            }
        }
        System.out.println("Shortest = " + shortStr);
        System.out.println("Longest = " + longStr);
    }

}