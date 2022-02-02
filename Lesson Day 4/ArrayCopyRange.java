package Day4;

import java.util.Arrays;

public class ArrayCopyRange {
    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5};

        int startIndex = 1;
        int endIndex = 4;

        int[] destination = new int[endIndex - startIndex];
        for (int i = 0; i < destination.length; i++) {
            destination[i] = source[i + startIndex];


        }
        System.out.println(Arrays.toString(destination));
    }
}
