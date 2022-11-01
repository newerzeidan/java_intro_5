package string_methods;

public class _09_trim_Method {
    public static void main(String[] args) {
        /*
        - return type
        - string
        -nonstatic / its a object
        -it does not take any args
         */
        String s1 = "  Hello   ";
        System.out.println(s1.length()); // 10
        System.out.println(s1.trim()); // 5

        System.out.println(s1); // "Hello"
        System.out.println(s1. length()); // 5

        System.out.println("  Hello World   ".trim()); // proof that only the first and end space gets trimmed
    }
}
