package learning.Java;

public class DisplayNumbersFrom100To1 {
    public static void main(String[] args) {

        //red source data
        int from = 100;
        int to = 1;
        int step = 1;

        //processing
        for (int i = from; i >= to ; i -= step) {

         //display results
            System.out.print(i + " ");
        }
    }
}
