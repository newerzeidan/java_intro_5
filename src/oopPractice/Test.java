package oopPractice;

public class Test {
    public static void main(String[] args) {
        System.out.println("\nSword1 is created after this line");
        Sword sword1 = new Sword("iron");
        System.out.println("Printing out sword 1" + sword1);

        System.out.println("\nSword2 is created after this line");
        Sword sword2 = new Sword(3.5, 15.0, "Long Sword", "iron"); // -> Modified constructor
        System.out.println("Printing out sword 2" + sword2);


        System.out.println("\n Working with static values\n");
        System.out.println(Sword.hasHandle); // true
        System.out.println(Sword.isSharp); // false

        // final values cant be changed
        //
        Sword.isSharp = true;
        System.out.println(Sword.isSharp); // this was reassigned to have true as a value



    }
}
