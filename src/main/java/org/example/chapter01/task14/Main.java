/*Можно ли использовать break в switch-инструкции без проваливания?
 В switch-выражении? Почему или почему нет?*/

package org.example.chapter01.task14;

import java.util.Scanner;

public class Main {
    static void main() {
        // switch инструкции
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        String s = "";
        System.out.println("без проваливания");
        // без проваливания

        switch (day) {
            case 1:
                System.out.println("monday");
                s = "monday";
                break;
            case 2:
                System.out.println("tuesday");
                s = "tuesday";
                break;
            case 3:
                System.out.println("wednesday");
                s = "wednesday";
                break;
            default:
                System.out.println("error");
        }
        System.out.println(s);

        int day1 = in.nextInt();
        System.out.println("с проваливанием");
        // с проваливанием!!
        switch (day1) {
            case 1:
                System.out.println("monday");
            case 2:
                System.out.println("tuesday");
            case 3:
                System.out.println("wednesday");
                break;
            default:
                System.out.println("error");
        }
        // switch выражение

        int day2 = in.nextInt();
        String dayWeek  = switch (day2){
            case (1) -> "monday";
            case (2) -> "tuesday";
            case (3) -> "wednesday";
            default -> "error";
        };
        System.out.println("switch выражение");
        System.out.println(dayWeek);
    }
}
