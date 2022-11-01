package casting;

public class Exercise4 {
    public static void main(String[] args) {
        //true false  --> "true" "false" "hello"

        System.out.println(true && false); // false
        //System.out.println("true" && "false"); // false

        System.out.println(String.valueOf(true) + String.valueOf(false)); // "true" + "false"
        System.out.println("" + true + false); //truefalse

        System.out.println(String.valueOf('A') + 'a'); // "A" + 'a' -> Aa
        System.out.println("" + 10.5 + 5); // 10.55 it is turning the whole thing into a string because of the first empty ""
        System.out.println("" + (10.5 + 5)); // 15.5 it is completing the parenthesis first as order of operations


    }
}
