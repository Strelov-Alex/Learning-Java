package learning.Java;

import java.util.Random;
import java.util.Scanner;

public class TernarnyOperator {
    public static void main(String[] args) {
        System.out.println("Guess the number from 1 to 9: ");
        var userCase = new Scanner(System.in).nextInt();
        var number = new Random().nextInt(10);
        String result = number == userCase ?
                "Congratulations, you guessed the number!" :
                "Sorry, but your number is invalid! Try again later...";
        System.out.println(result);
    }
}

