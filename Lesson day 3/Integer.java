import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Введите число, которое делим: ");
            double a = new Scanner(System.in).nextDouble();
            System.out.println("Введите число, на которое делим: ");
            double b = new Scanner(System.in).nextDouble();

            if (b == 0) {
                break;
            }
            System.out.println(a / b);
        }
    }
}
