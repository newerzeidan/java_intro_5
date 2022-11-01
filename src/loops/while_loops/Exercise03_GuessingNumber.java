package loops.while_loops;

import utilities.RandomNumberGenerator;

public class Exercise03_GuessingNumber {
    public static void main(String[] args) {

        int number = 7;

        int random = RandomNumberGenerator.getARandomNumber(1,10);

        int attempt = 1;

        while(random != number){
            System.out.println("The random number is = " + random);
            random = RandomNumberGenerator.getARandomNumber(1,10);
            attempt++;
        }

        System.out.println("It took " + attempt + " times to generate 7");
    }
}
