package Day5;

import org.w3c.dom.ls.LSOutput;

public class StringVerificationMethods {
    public static void main(String[] args) {
        String s = "Hello world!";

        System.out.println("s.contains(\"world\"): " + s.contains("world")); // встречается ли нужное слово в строке. Выдаёт или True или False
        System.out.println("s.contains(\"world\"): " + s.contains("World")); // встречается ли нужное слово в строке. Выдаёт или True или False

        System.out.println("s.indexOf('o'): " + s.indexOf('o')); // Находим индекс нужного символа строки. В данном случае первое вхождение
        System.out.println("s.lastIndexOf('o'): " + s.lastIndexOf('o')); // Находим индекс нужного символа строки. В данном случае последнее вхождение

        System.out.println("s.startsWith(\"Hello\": " + s.startsWith("Hello")); // Содержит ли начало строки нужные нам символы
        System.out.println("s.endsWith(\"!\"): " + s.endsWith("!")); // Содержит ли конец строки нужные нам символы

        System.out.println("s.isEmpty(): " + s.isEmpty()); // Является ли наша строка пустой. Пробелы считает за символы
        System.out.println("s.s.isBlank(): " + s.isBlank()); // Является ли наша строка пустой. Пробелы тоже не учитывает

    }
}
