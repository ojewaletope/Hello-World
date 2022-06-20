package section_5;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to guess: ");

        int guessedNumber = scanner.nextInt();

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);

        if(guessedNumber == randomNumber) {
            System.out.print("You are correct");
        } else {
            System.out.format("You are wrong, correct number is %d", randomNumber);
        }


    }
}
