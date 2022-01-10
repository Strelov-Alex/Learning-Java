package learning.Java;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        System.out.println("Guess the number from 1 to 9: ");
        var a = new Scanner(System.in).nextInt();
        var number = new Random().nextInt(10);
        String result = null;
        if(a == number) {
            result = "Congratulations, you guessed the number!";
        } else {
            result = "Sorry, but your number is invalid! Try again later...";
        }
        System.out.println(result);
    }
}
