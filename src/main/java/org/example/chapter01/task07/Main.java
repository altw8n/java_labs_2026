
package org.example.chapter01.task07;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int in1 = scanner.nextInt();
        int in2 = scanner.nextInt();

        if (in1 < 0 || in1 > 65535 || in2 < 0 || in2 > 65535) {
            throw new IllegalArgumentException("числа вне диапазона 0..65535");
        }
        short a = (short) in1;
        short b = (short) in2;

        short sum = add(a, b);
        short diff = sub(a, b);

        System.out.println("sum: " + toUnsigned(sum));
        System.out.println("diff: " + toUnsigned(diff));
    }

    public static short add(short a, short b) {
        short max = (short) 0xFFFF;
        if ((b & 0xFFFF) > ((max - a) & 0xFFFF)) {
            throw new ArithmeticException("переполнение при сложении");
        }
        return (short) (a + b);
    }


    public static short sub(short a, short b) {
        if ((a & 0xFFFF) < (b & 0xFFFF)) {
            throw new ArithmeticException("отрицательный результат");
        }
        return (short) (a - b);
    }

    public static int toUnsigned(short s) {
        return s & 0xFFFF;
    }
}