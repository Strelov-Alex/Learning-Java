public class MultiplicationTableCase1 {
    public static void main(String[] args) {
        int to = 9;
        for (int i = 1; i <= to ; i++) {
            for (int j = 1; j <= to ; j++) {
                var result = i * j;
                System.out.print((result == 1 ? "" : result) + "\t");

            }
            System.out.println();

        }
    }
}
