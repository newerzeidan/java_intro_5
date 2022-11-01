package string_methods;

public class _10_substring_Method {
    public static void main(String[] args) {
    /*
    - return
    - returns string
    - nonstatic
    - its overloaded by taking 2 args
     */
        String s = "TechGlobal";

        //Get Global
        String s1 = s.substring(4); // from index 4 to the end
        System.out.println(s1);

        //Get Tech

        String s2 = s.substring(0 , 4);
        System.out.println(s2);

        System.out.println(s.substring(2,15)); // Exception in thread "main" java.lang out of bound
    }
}
