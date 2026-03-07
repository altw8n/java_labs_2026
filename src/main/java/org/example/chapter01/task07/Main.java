/*Напишите программу, вводящую два числа в пределах от 0 до 65535,
сохраняющую их в переменных типа short и вычисляющую их
сумму, разность, произведение, частное и остаток без знака,
не преобразуя эти величины в тип int..*/

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

        int unsignedFirst = shortFirst & 0xFFFF;
        int unsignedSecond = shortSecond & 0xFFFF;

        short sum = (short) (unsignedFirst + unsignedSecond);
        System.out.println("сумма: " + sum);

        short diff = (short) (unsignedFirst - unsignedSecond);
        System.out.println("разность: " + diff);

        short prod = (short) (unsignedFirst * unsignedSecond);
        System.out.println("произведение: " + prod);

        short div = (short) (unsignedFirst / unsignedSecond);
        System.out.println("частное: " + div);

        short mod = (short) (unsignedFirst % unsignedSecond);
        System.out.println("остаток: " + mod);

        in.close();
    }
}
