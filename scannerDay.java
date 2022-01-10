package learning.Java;

import java.util.Scanner;

public class scannerDay {
    public static void main(String[] args) {
        System.out.println("Write a number from 1 to 7: ");
        var day = new Scanner(System.in).nextInt();

        String result = null;
        if (day == 1) {
            result = "Your day - Monday";
        } else if (day == 2) {
            result = "Your day - Tuesday";
        } else if (day == 3) {
            result = "Your day - Wednesday";
        } else if (day == 4) {
            result = "Your day - Thursday";
        } else if (day == 5) {
            result = "Your day - Friday";
        } else if (day == 6) {
            result = "Your day - Saturday";
        } else if (day == 7) {
            result = "Your day - Sunday";
        } else {
            System.out.println("You have not fulfilled the input condition");
        }
        System.out.println(result);

    }

}
