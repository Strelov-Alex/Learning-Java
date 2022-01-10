package learning.Java;

import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        var a = new Scanner(System.in).nextInt();
        System.out.println("Enter the second number: ");
        var b = new Scanner(System.in).nextInt();
        System.out.println("What action do you want to do: +, -, *, /, %  ");
        char operation = new Scanner(System.in).nextLine().charAt(0);

        String result = null;
        if(operation == '+') {
            result = "a + b = " + (a + b);
        } else if(operation == '-') {
            result = "a - b = " + (a - b);
        } else if(operation == '*') {
            result = "a * b = " + (a * b);
        } else if(operation == '/') {
            result = "a / b = " + (a / b);
        } else if(operation == '%') {
            result = "a % b = " + (a % b);
        } else {
            System.out.println("You have chosen the wrong operation");
        }
        System.out.println(result);
    }
}
