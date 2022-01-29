import java.util.Scanner;

public class SwitchCity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        whil (true) {
            System.out.println("Enter the name of the city: ");
            String city = new Scanner(System.in).nextLine();

            if (city.equals("Stop")) {
                System.out.println("Have you finished checking");
                break;
            }

            switch (city) {
                case ("Москва"):
                case ("Владивосток"):
                case ("Ростов"):
                    System.out.println("This is Russia");
                    break;
                case ("Рим"):
                case ("Милан"):
                case ("Турин"):
                    System.out.println("This is Italy");
                    break;
                case ("Ливерпуль"):
                case ("Манчестер"):
                case ("Лондон"):
                    System.out.println("This is England");
                    break;
                case ("Берлин"):
                case ("Мюнхен"):
                case ("Кёльн"):
                    System.out.println("This is Germany");
                    break;
                default:
                    System.out.println("Unknown city");


            }


        }
    }
}
