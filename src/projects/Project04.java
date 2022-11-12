package projects;

import utilities.RandomNumberGenerator;

import java.util.Scanner;

public class Project04 {
    public static void main(String[] args) {

            System.out.println("\n-----Task1-----\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Hey user please enter a String");
        String str = input.nextLine();

        if(str.length() < 8){
            System.out.println("This String does not have 8 characters");
    }
        else {
            System.out.println(str.substring(str.length()-4) + (str.substring(4,str.length()-4)) + (str.substring(0,4)));
}
        System.out.println("\n-----Task2-----\n");

        Scanner input2 = new Scanner(System.in);
        System.out.println("Hey user please a sentence");
        String str2 = input.nextLine();

        if(str.contains(" ")) {
            System.out.println(str2.substring(str2.lastIndexOf(" ") + 1 ));// ADDDDD
        }
        else {
            System.out.println("This sentence does not have 2 or more words to swap");
        }


        System.out.println("\n-----Task3-----\n");

        String str3 = "These books are so stupid";
        str3 = str3.replace("stupid", "nice");

        System.out.println(str3);

        String str4 = "I like idiot behaviors";
        str4 = str4.replace("idiot", "nice");
        System.out.println(str4);


        String str5 = "I have some stupid t-shirts in the past and also some idiot look shoes";
        str5 = str5.replace("stupid", "nice");
        str5 = str5.replace("idiot", "nice");

        System.out.println(str5);



        System.out.println("\n-----Task4-----\n");

        Scanner input4 = new Scanner (System.in);
        System.out.println("Hey user please enter your name");
        String string4 = input.nextLine();

        if(string4.length() < 2){
            System.out.println("Invalid input!!!");
        } else if (string4.length() % 2 == 0) { // middle 2
            System.out.println(string4.substring(string4.length() / 2 - 1, string4.length() /2 + 1));
        }else{
            System.out.println(string4.substring(string4.length() / 2 - 1, string4.length() /2 ));
        }

        System.out.println("\n-----Task5-----\n");

        Scanner inputT5 = new Scanner (System.in);
        System.out.println("Hey user, please enter a country");
        String input5 = input.nextLine();

        if(input5.length() < 5){
            System.out.println("Invalid input!!!");
        }else{
            System.out.println(input5.substring(2,input5.length()-2));
        }


        System.out.println("\n-----Task6-----\n");

        Scanner input6 = new Scanner (System.in);
        System.out.println("Hey user, please enter your address ");
        String str6 = input.nextLine();

        System.out.println(str6.replace('a', '*'). replace('A', '*')
                        .replace('e', '#').replace('E', '#')
                        .replace('i', '+').replace('I', '+')
                        .replace('o', '$').replace('O', '$')
                        .replace('i', '@').replace('U', '@'));

        System.out.println("\n-----Task7-----\n");

        int random1 = RandomNumberGenerator.getARandomNumber(0,25);
        int random2 = RandomNumberGenerator.getARandomNumber(0,25);

        String s = " ";

        for (int i = Math.min(random1, random2); i < Math.max(random1,random2); i++) {
        if(i % 5 != 0){
            s += i + "-";
            }

        }
        System.out.println(s.substring(0,s.length() -1));


        System.out.println("\n-----Task8-----\n");

        int counter = 1;
        Scanner input7 = new Scanner(System.in);
        System.out.println("Hey user, please enter a sentence");
        String str7= input.nextLine();

        for (int i = 0; i < str7.length(); i++) {
            if(str7.charAt(i) == ' '){
                counter += i;

            }
        }

        if(!str7.contains(" ")) { // ?
            System.out.println("This sentence does not have multiple words");
        }else
            System.out.println("This sentence has " + counter + " words");


                         System.out.println("\n-----Task9-----\n");


        int num;
        Scanner int8 = new Scanner(System.in);
        System.out.println("Hey user, please enter a positive number");
        int number = input.nextInt();
        input.nextLine();



        for (int i = 1; i <= number ; i++) {
            if(i % 2 == 0 && i % 3 == 0) {
                System.out.println("FooBar");
            } else if (i % 2 == 0){
                System.out.println("Foo");
            } else if (i % 3 == 0){
                System.out.println("Boo");
            } else {
                System.out.println(i);
            }
        }

                               System.out.println("\n-----Task10-----\n");


        Scanner scan10 = new Scanner(System.in);
        System.out.println("Hey user, please enter a word");
        String word = input.nextLine(), palindrome = "";

        if(word.length() < 1) {
            System.out.println("This word does not have 1 or more characters");
            for (int i = word.length() -1 ; i >= 0 ; i--) {
                palindrome += word.charAt(i);
            } if (palindrome.toLowerCase().equals(word.toLowerCase())) {
                System.out.println("This word is a Palindrome");
            }else {
                System.out.println("This word is not a Palindrome");
            }



                                System.out.println("\n-----Task11-----\n");
            System.out.println("Please enter a String");
            String str8 = input.nextLine();
            int countA = 0;

            if (str8.length() < 1) {
                System.out.println("This sentence does not have any characters");
            }
            for (int i = 0; i < str8.length(); i++) {
                if (str8.toLowerCase().charAt(i) == 'a') {
                    countA+= 1;
                }
            }
            System.out.println("This sentence has " + countA + " a or A letters.");

        }}}
