package string_methods;

public class _07_indexOf_lastIndexOf_Methods {
    public static void main(String[] args) {

        /*
        -return
        -returns int which matching index
        -non-static
        -It takes a char or String there are over
         */
        String company = "TechGlobal School";

        int firstIndexOfO = company.indexOf('o'); //6
        int lastIndexOfO = company.lastIndexOf('o'); //15

        System.out.println(firstIndexOfO); //6
        System.out.println(lastIndexOfO); //6

        //Find the first and last  indexes of l -> Expected 5 and 16

        int firstIndexOfl = company.indexOf('l');
        int lastIndexOfl = company.indexOf('l');

        System.out.println(firstIndexOfl); //5
        System.out.println(lastIndexOfl); //16

        System.out.println(company.indexOf('X')); //-1

        System.out.println(company.indexOf("School")); //11

    }


}
