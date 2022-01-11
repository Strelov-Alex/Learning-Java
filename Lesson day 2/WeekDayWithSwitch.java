package learning.Java;

import java.util.Scanner;

public class WeekDayWithSwitch {
    public static void main(String[] args) {
        //"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        System.out.println("Write a number from 1 to 7: ");
        var day = new Scanner(System.in).nextInt();

        switch (day) {
            case 1: {
                System.out.println("Your day a Monday");
                break;
            }
            case 2: {
                System.out.println("Your day a Tuesday");
                break;
            }
            case 3: {
                System.out.println("Your day a Wednesday");
                break;
            }
            case 4: {
                System.out.println("Your day a Thursday");
                break;
            }
            case 5: {
                System.out.println("Your day a Friday");
                break;
            }
            case 6: {
                System.out.println("Your day a Saturday");
                break;
            }
            case 7: {
                System.out.println("Your day a Sunday");
                break;
            }
            default: {
                System.out.println("You entered an incorrect number");
                break;
            }
        }
    }
}
