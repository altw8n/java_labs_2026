/*Напишите программу, которая читает целое число и выводит его в двоичной,
восьмеричной и шестнадцатеричной системе.
Выведите обратное значение в виде шестнадцатеричного числа с плавающей точкой.*/

package org.example.chapter01.task01;

import java.util.Scanner;

public class Main {
    public static void main(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter number: ");
        int num = in.nextInt();

        System.out.println("binary " + Integer.toBinaryString(num));
        System.out.println("octal " + Integer.toOctalString(num));
        System.out.println("hex " + Integer.toHexString(num));

        int invN = ~num;
        float floatInvN = Float.intBitsToFloat(invN);

        System.out.println("inv hex float " + Float.toHexString(floatInvN));
        in.close();
    }
}