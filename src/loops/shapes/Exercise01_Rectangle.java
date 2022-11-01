package loops.shapes;

public class Exercise01_Rectangle {
    public static void main(String[] args) {
        /*
        Write a program to print below rectangle
        * * * * * *
        *         *
        *         *
        *         *
        *         *
        *         *
        *         *
        * * * * * *
         */

        System.out.println("* * * * * *"); // 1
        System.out.println("*         *"); // 2
        System.out.println("*         *"); // 3
        System.out.println("*         *"); // 4
        System.out.println("*         *"); // 5
        System.out.println("*         *"); // 6
        System.out.println("*         *"); // 7
        System.out.println("* * * * * *"); // 8

        for (int i = 1; i <= 8; i++) {
            if(i == 1 || i ==8) System.out.println("* * * * * *");
            else System.out.println("*         *");
        }

    }
}