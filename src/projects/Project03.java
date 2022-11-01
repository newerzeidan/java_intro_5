package projects;

public class Project03{
    public static void main(String[] args) {

        System.out.println("----Task1-------");
        String s1 = "24", s2 = "5";

        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);

        System.out.println("The sum of 24 and 5 = " + (i1 + i2));
        System.out.println("The subtraction of 24 and 5 = " + (i1 - i2));
        System.out.println("The division of 24 and 5 = " + (double) i1 / i2);
        System.out.println("The multiplication of 24 and 5 = " + i1 * i2);
        System.out.println("The remainder of 24 and 5 = " + i1 % i2);


        System.out.println("\n------Task2------");

        int randomNumber = (int) (Math.random() * (50 - 1 + 1) + 1);
        System.out.println("Random number is = " + randomNumber);


        if(randomNumber == 2 || randomNumber == 3 || randomNumber == 5 || randomNumber==7
                ||randomNumber == 11 || randomNumber == 13 || randomNumber == 17 ||randomNumber == 19
                || randomNumber == 23 || randomNumber == 29 ||randomNumber == 31){
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else{
            System.out.println("THE NUMBER IS NOT A PRIME NUMBER");
        }

        System.out.println("\n-------Task 3-------");
        int myRandom1 = (int)(Math.random() * (50 - 1 + 1) +1);
        int myRandom2 = (int)(Math.random() * (50 - 1 + 1) +1);
        int myRandom3 = (int)(Math.random() * (50 - 1 + 1) +1);
        // Find min and max
        if(myRandom1 < myRandom2 && myRandom2 < myRandom3){
            System.out.println("Lowest number is = " + myRandom1 + "\nMiddle number is = " + myRandom2
                    + "\nGreatest number is = " + myRandom3);
        } else if (myRandom1 < myRandom3 && myRandom3 < myRandom2) {
            System.out.println("Lowest number is = " + myRandom1 + "\nMiddle number is = " + myRandom3
                    + "\nGreatest number is = " + myRandom2);
        } else if (myRandom2 < myRandom1 && myRandom1 < myRandom3) {
            System.out.println("Lowest number is = " + myRandom2 + "\nMiddle number is = " + myRandom1
                    + "Greatest number is = " + myRandom3);
        } else if (myRandom2 < myRandom3 && myRandom3 < myRandom1) {
            System.out.println("Lowest number is = " + myRandom2 + "\nMiddle number is = " + myRandom3
                    + "\nGreatest number is = " + myRandom1);
        } else if (myRandom3 < myRandom1 && myRandom1 < myRandom2) {
            System.out.println("Lowest number is = " + myRandom3 + "\nMiddle number is = " + myRandom1
                    + "\nGreatest number is = " + myRandom2);
        } else {
            System.out.println("Lowest number is = " + myRandom3 + "\nMiddle number is = " + myRandom2
                    + "\nGreatest number is = " + myRandom3);
        }
        System.out.println("\n-------Task 4-------");
        char c1 = '5';
        char c2 = 'a';
        char c3 = 'R';
        if(c1 >= 65 && c1 <=90){
            System.out.println("The letter is uppercase");
        } else if (c1 >= 97 && c1 <= 122) {
            System.out.println("The letter is lowercase");
        } else{
            System.out.println("Invalid character detected!!!");
        }
        if(i2 >= 65 && i2 <=90){
            System.out.println("The letter is uppercase");
        } else if (i2 >= 97 && i2 <= 122) {
            System.out.println("The letter is lowercase");
        } else{
            System.out.println("Invalid character detected!!!");
        }
        if(c3 >= 65 && c3 <=90){
            System.out.println("The letter is uppercase");
        } else if (c3 >= 97 && c3 <= 122) {
            System.out.println("The letter is lowercase");
        } else{
            System.out.println("Invalid character detected!!!");
        }
        System.out.println("\n-------Task 5-------");
        char cOne = '#';
        char cTwo = 'e';
        char cThree = 'R';
        if((cOne >= 65 && cOne <= 90) || (cOne >= 97 && cOne <= 122)) {
            if (cOne == 'a' || cOne == 'e' || cOne == 'i' || cOne == 'o' || cOne == 'u' ||
                    cOne == 'A' || cOne == 'E' || cOne == 'I' || cOne == 'O' || cOne == 'U')
                System.out.println("The letter is vowel");
            else{
                System.out.println("The letter is consonant");
            }
        }
        else{
            System.out.println("Invalid character detected!!!");
        }
        if((cTwo >= 65 && cTwo <= 90) || (cTwo >= 97 && cTwo <= 122)) {
            if (cTwo == 'a' || cTwo == 'e' || cTwo == 'i' || cTwo == 'o' || cTwo == 'u' ||
                    cTwo == 'A' || cTwo == 'E' || cTwo == 'I' || cTwo == 'O' || cTwo == 'U')
                System.out.println("The letter is vowel");
            else{
                System.out.println("The letter is consonant");
            }
        }
        else{
            System.out.println("Invalid character detected!!!");
        }
        if((cThree >= 65 && cThree <= 90) || (cThree >= 97 && cThree <= 122)) {
            if (cThree == 'a' || cThree == 'e' || cThree == 'i' || cThree == 'o' || c3 == 'u' ||
                    cThree == 'A' || cThree == 'E' || cThree == 'I' || cThree == 'O' || c3 == 'U')
                System.out.println("The letter is vowel");
            else{
                System.out.println("The letter is consonant");
            }
        }
        else{
            System.out.println("Invalid character detected!!");
        }
        System.out.println("\n------Task 6------");
        char sp1 ='8';
        char sp2 = '*';
        if((sp1 >= 33 && sp1 <= 47) || (sp1 >= 58 && sp1 <= 64)){
            System.out.println("Special character is = " + sp1);
        } else{
            System.out.println("Invalid character detected!!!");
        }
        if((sp2 >= 33 && sp2 <= 47) || (sp2 >= 58 && sp2 <= 64)){
            System.out.println("Special character is = " + sp2);
        } else{
            System.out.println("Invalid character detected!!!");
        }
        System.out.println("\n------Task 7------");
        char d1 = 'g';
        char d2 = '5';
        char d3 = '@';
        if((d1 >= 65 && d1 <= 90) || (d1 >= 97 && d1 <= 122)) {
            System.out.println("Character is a letter");}
        else if ((d1 >= 33 && d1 <= 47) || (d1 >= 58 && d1 <= 64)){
            System.out.println("Character is a special character");
        }
        else{
            System.out.println("Character is a digit");
        }
        if((d2 >= 65 && d2 <= 90) || (d2 >= 97 && d2 <= 122)) {
            System.out.println("Character is a letter");}
        else if ((d2 >= 33 && d2 <= 47) || (d2 >= 58 && d2 <= 64)){
            System.out.println("Character is a special character");
        }
        else{
            System.out.println("Character is a digit");
        }
        if((d3 >= 65 && d3 <= 90) || (d3 >= 97 && d3 <= 122)) {
            System.out.println("Character is a letter");}
        else if ((d3 >= 33 && d3 <= 47) || (d3 >= 58 && d3 <= 64)){
            System.out.println("Character is a special character");
        }
        else{
            System.out.println("Character is a digit");
        }
    }
}
