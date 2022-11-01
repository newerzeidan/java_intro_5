package loops.fori_loops;

public class Exercise02_PrintNumbersDescending {
    public static void main(String[] args) {
        /*
        Write a Java program to print numbers backward starting from 100 to 0 (100 and 0)

        Expected output:
        100
        99
        98
        .
        .
        .
        2
        1
        0
        start:100
        end:0
        update:decrement
         */

        for(int i = 100; i >= 0; i --){
            System.out.println(i);
    }
}
}
