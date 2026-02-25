/*Придумайте полезный сценарий,
где поведение проваливания полезно для switch-выражения или инструкции*/

package org.example.chapter01.task15;

public class Main {
    static void main() {
        int month = 4;
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
                System.out.println("outemn");
                break;
        }
    }
}
