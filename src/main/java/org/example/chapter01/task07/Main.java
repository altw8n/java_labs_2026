/*Напишите программу, которая читает два целых числа
между 0 и 4294967295, сохраняет их в переменных
типа int и вычисляет и отображает их беззнаковую
сумму, разность, произведение, частное и остаток.
Не преобразуйте их в тип long.*/

package org.example.chapter01.task07;

import java.util.Scanner;

public class Main {
    public static void main(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter first num (0;65535)");
        int intFirst = in.nextInt();

        System.out.println("enter second num (0;65535)");
        int intSecond = in.nextInt();

        short shortFirst = (short) intFirst;
        short shortSecond = (short) intSecond;

        int sum = Short.toUnsignedInt(shortFirst) + Short.toUnsignedInt(shortSecond);
        System.out.println("сумма: " + sum);

        int diff = Short.toUnsignedInt(shortFirst) - Short.toUnsignedInt(shortSecond);
        System.out.println("разность: " + diff);

        int prod = Short.toUnsignedInt(shortFirst) * Short.toUnsignedInt(shortSecond);
        System.out.println("произведение: " + prod);

        int div = Short.toUnsignedInt(shortFirst) / Short.toUnsignedInt(shortSecond);
        System.out.println("частное: " + div);

        int mod = Short.toUnsignedInt(shortFirst) % Short.toUnsignedInt(shortSecond);
        System.out.println("остаток: " + mod);

        in.close();
    }
}
