package Day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        int arrayLenght = scanner.nextInt();
        Random random = new Random();
        int[] array = new int[arrayLenght];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);


        }
        System.out.println(Arrays.toString(array));
        System.out.println("Длинна массива: " + array.length);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8) {
                count++;
            }
        }
        System.out.println("Чисел больше 8: " + count);

        int count1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count1++;
            }

        }
        System.out.println("Чисел равных 1: " + count1);

        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count2 ++;
            }

        }
        System.out.println("Чётных чисел: " + count2);

        int count3 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count3 ++;
            }

        }
        System.out.println("Не чётных чисел: " + count3);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];


            }

        System.out.println("Сумма элементов массива " + sum);

    }
}
