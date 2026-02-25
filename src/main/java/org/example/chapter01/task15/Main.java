/*Придумайте полезный сценарий,
где поведение проваливания полезно для switch-выражения или инструкции*/

package org.example.chapter01.task15;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number: ");
        int month = in.nextInt();
        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("autumn");
                break;
            default:
                System.out.println("not a month");
        }
    }
}
