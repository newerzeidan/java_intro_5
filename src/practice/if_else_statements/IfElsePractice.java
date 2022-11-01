package practice.if_else_statements;

public class IfElsePractice {
    public static void main(String[] args) {

        //int myInt= 45;

        /*
        if the number is between 0-24 print "first quarter"
        if the number is between 25-49 print "second" quarter
        if the number is between 50-74 print "third" quarter
         */

        int myInt = 0;

        if(myInt >= 0 && myInt <= 24){
            System.out.println("first quarter");
        } else if(myInt >= 25 && myInt <= 49){
            System.out.println("second quarter");
        } else if (myInt >= 50 && myInt <= 74) {
            System.out.println("third quarter");
        }


            /*
        if the number is between -50 /-1 print "number is in negative"
        if the number is between 0 print "number is zero"
        if the number is between 1 / 50 print "number is in positive part"
         */

        if(myInt >= -50 && myInt <= -1){
            System.out.println("number is in negative");
        } else if(myInt == 0){
            System.out.println("number is zero");
        } else if (myInt >= 1 && myInt <= 50) {
            System.out.println("number is in a positive part");
        }

    }
}




