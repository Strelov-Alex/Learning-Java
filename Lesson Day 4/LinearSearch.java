package Day4;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {2, 6, 8, 12, 7, 9, 11, 16};
        int query = 16;

        int inde = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == query) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
