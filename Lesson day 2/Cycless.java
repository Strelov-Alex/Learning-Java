package learning.Java;

import java.util.Scanner;

public class Cycless {
    public static void main(String[] args) {
        System.out.println("What is your name: ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("How many times do I need to type your name: ");
        int quantity = new Scanner(System.in).nextInt();

        for (int i = 1; i <= quantity; i++  ) {
            System.out.println(name);
        }
    }
}
