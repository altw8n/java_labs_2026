/*Можно ли использовать break в switch-инструкции без проваливания?
 В switch-выражении? Почему или почему нет?*/

package org.example.chapter01.task14;

public class Main {
    static void main() {
        // switch инструкции
        int day = 1;
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

        int day1 = 1;
        String s1 = "";
        System.out.println("с проваливанием");
        // с проваливанием!!
        switch (day1) {
            case 1:
                System.out.println("monday");
                s1 = "monday";
            case 2:
                System.out.println("tuesday");
                s1 = "tuesday";
            case 3:
                System.out.println("wednesday");
                s1 = "wednesday";
                break;
            default:
                System.out.println("error");
        }

        // switch выражение

        int day2 = 1;
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
