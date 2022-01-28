import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int random = new Random().nextInt(10);

        while (true) {
            System.out.println("Guess the number from 0 to 10: ");
            int number = new Scanner(System.in).nextInt();
            if (number > random) {
                System.out.println("number < " + number + " Try again!");
            } else if (number < random) {
                System.out.println("number > " + number + " Try again!");
            } else {
                System.out.println("Congratulations, you guessed the number!");
                break;

            }
        }
    }
}
