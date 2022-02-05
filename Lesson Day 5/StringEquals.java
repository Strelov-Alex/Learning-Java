package Day5;

public class StringEquals {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = s1.substring(1) + s2.substring(3);

// .substring() -  удаляет символ строки


        System.out.println(s3);

// .equals - оператор сравнения строк

        if (s1.equals(s2))
            System.out.println("s1 = s2");



    }
}
