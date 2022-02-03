package Day4;

import java.util.Arrays;

public class SwapMinAndMaxArrayElement {
    public static void main(String[] args) {

        int[] array = {1, -2, 3, 8, 5};
        System.out.println(Arrays.toString(array));

        int indexOfMinElement = 0;
        int min = array[0];
        int indexOfMaxElement = 0;
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            var current = array[i];
            if (current < min) {
                min = current;
                indexOfMinElement = i;
            }
            if (current > max) {
                max = current;
                indexOfMaxElement = i;
            }

        }

        var temp = array[indexOfMaxElement];
        array[indexOfMaxElement] = array[indexOfMinElement];
        array[indexOfMinElement] = temp;

        System.out.println(Arrays.toString(array));
    }
}
