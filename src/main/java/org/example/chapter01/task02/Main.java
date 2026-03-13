/*Напишите программу, которая читает целочисленный угол
(может быть положительным или отрицательным)
 и нормализует его до значения между 0 и 359 градусами.
Попробуйте сначала с оператором %, затем с floorMod.*/

package org.example.chapter01.task02;

import java.util.Scanner;

public class Main {
    public static void main() {
        System.out.println("enter angle: ");

        Scanner in = new Scanner(System.in);
        int angle = in.nextInt();

        int res = normalizeAngle(angle);
        System.out.println("normalised angle: " + res);

        int res2 = Math.floorMod(angle, 360);
        System.out.println("normalised angle with floor mod: " + res2);
    }

    public static int normalizeAngle(int angle) {
        int res = angle % 360;
        if (res < 0) {
            res += 360;
        }
        return res;
    }
}
