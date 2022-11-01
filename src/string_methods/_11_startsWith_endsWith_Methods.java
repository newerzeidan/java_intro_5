package string_methods;

public class _11_startsWith_endsWith_Methods {
    public static void main(String[] args) {
        /*
        -return type
        -returns boolean
        -nonstatic, it is called with an object name
        -there are overloaded methods but we will use always the one with the arg
         */
        String s = "Tech Global";

        System.out.println(s.startsWith("T")); // true
        System.out.println(s.startsWith("t")); // false
        System.out.println(s.startsWith("Tech")); // true

        System.out.println(s.endsWith("Global")); // true

        //IMPORTANT

        String city = "Chicago";
        System.out.println(city.startsWith("Chicago")); // true
        System.out.println(city.endsWith("Chicago")); // true
        System.out.println(city.startsWith("")); // true
        System.out.println(city.endsWith("")); // true

        System.out.println(city.startsWith("M")); //false
        System.out.println(city.endsWith("lin")); //false


    }
}
