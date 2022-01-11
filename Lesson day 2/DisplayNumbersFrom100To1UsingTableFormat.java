package learning.Java;

public class DisplayNumbersFrom100To1UsingTableFormat {
    public static void main(String[] args) {
        var from = 1;
        var to = 100;

        for (int i = from; i <= to ; i ++) {
            System.out.print(i + "\t");
            if (i % 10 == 0) {
                System.out.println();
            }

        }
    }
}
