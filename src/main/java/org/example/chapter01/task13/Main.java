/*Напишите switch-инструкцию, которая,
 получив строку с направлением компаса "N", "S", "E" или "W",
  изменяет переменные x и y.
   Например, "W" должно уменьшить x на 1./*
 */

package org.example.chapter01.task13;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("enter x: ");
        int x = in.nextInt();

        System.out.print("enter y: ");
        int y = in.nextInt();
        in.nextLine();

        System.out.print("enter direction (N, S, E, W): ");
        String direction = in.nextLine();

        switch (direction) {
            case "N":
                y++;
                break;
            case "S":
                y--;
                break;
            case "E":
                x++;
                break;
            case "W":
                x--;
                break;
            default:
                System.out.println("wrong direction");
        }

        System.out.println(x + " " + y);
    }
}