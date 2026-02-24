/*"Куайн" - это программа, которая без чтения
любого ввода или файла выводит свой собственный исходный код.
 Напишите такую программу на Java, используя текстовый блок.*/

package org.example.chapter01.task16;

public class Main {
    public static void main(String[] args) {
        String code = """
                package org.example.chapter01.task16;
                
                public class Main {
                    public static void main(String[] args) {
                        String code = \"""
                %s\""";
                        System.out.printf(code, code);
                    }
                }
                """;
        System.out.printf(code, code);
    }
}
