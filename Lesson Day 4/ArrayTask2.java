package Day4;

import java.util.Arrays;
import java.util.Random;

public class ArrayTask2 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);

        }
        System.out.println(Arrays.toString(array));

        int minElementArray = array[0];
        for (int min : array) {
            if (min < minElementArray) {
                minElementArray = min;
            }

        }
        System.out.println("Minimum array element: " + minElementArray);

        int maxElementArray = array[0];
        for (int max : array) {
            if (max > maxElementArray) {
                maxElementArray = max;
            }

        }
        System.out.println("Maximum array element: " + maxElementArray);

        int countElemenArrayZero = 0;
        for (int i : array) {
            if (i % 10 == 0) {
                countElemenArrayZero++;
            }
        }
        System.out.println("The number of array elements that end in zero: " + countElemenArrayZero);

        int sumElementArrayZero = 0;
        for (int i : array) {
            if (i % 10 == 0) {
                countElemenArrayZero += i;
            }
        }
        System.out.println("The sum of the array elements that end in zero: " + countElemenArrayZero);
    }
}
