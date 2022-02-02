package Day4;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length / 2; i++) {
            var temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;

        }
        System.out.println(Arrays.toString(array));
    }
}
