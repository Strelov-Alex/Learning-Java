package Day4;

public class FindMinElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, -4, 5, 6, -9};

        int min = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        System.out.println(min);




    }
}
