/*Напишите программу, которая создает случайную строку из букв и цифр,
 генерируя случайное значение типа long и выводя его в системе счисления с основанием 36.*/

package org.example.chapter01.task10;

import java.util.Random;

public class Main {
    public static void main() {
        Random rand = new Random();
        long num = rand.nextLong();

        String strBase36 = Long.toString(num, 36);

        System.out.println("random number: " + num);
        System.out.println("random number base 36: " + strBase36);
    }
}
