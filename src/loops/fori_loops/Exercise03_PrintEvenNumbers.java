package loops.fori_loops;

public class Exercise03_PrintEvenNumbers {
    public static void main(String[] args) {
        /*
        Write a Java program to print only even numbers from 0 to 10

       Expected output:
       0
       2
       4
       6
       9
       10
       start:0
       end:10
       update:Ascending
         */


        // NOT RECOMMENDED
        for(int i = 0; i <= 10; i += 2){
            System.out.println(i);
    }
        for(int i = 0; i <= 10; i ++){
            if (i % 2 == 0) System.out.println(i);
}
}}
