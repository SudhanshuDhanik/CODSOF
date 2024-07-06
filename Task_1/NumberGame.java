package Task_1;

import java.lang.Math;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        // Math.random() gives double value between 0.0 (inclusive) and 1.0 (exclusive).
        // By multiplying it by 100 and casting it to an int, we get a range from 0 to
        // 99,
        // so we have to add 1 to get range from 1 to 100.

        Scanner sc = new Scanner(System.in);
        System.out.print("Guess the number between 1 to 100: ");

        int n = 10;// Total no of guesses
        while (n != 0) {
            int no = sc.nextInt();
            if (no == randomNumber) {
                System.out.println("\nYou guess it correct!");
                System.out.println("Your score is:" + n * 10);
                System.out.print("\nTo play again enter 10 and to exit enter 1");
                n = sc.nextInt();
            } else if (no < randomNumber)
                System.out.println("You guessed lower than the expected answer");
            else
                System.out.println("You guessed higher than the expected answer");
            n--;
            if (n != 0)
                System.out.print("\nEnter the number between 1 to 100:");

        }
        if (n == 0)
            System.out.println("\nYou lose!");
        sc.close();
    }
}
