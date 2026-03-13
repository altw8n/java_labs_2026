/*Напишите программу, которая читает строку текста и выводит все символы,
 которые не являются ASCII, вместе с их значениями Unicode.*/

package org.example.chapter01.task11;

import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c > 127) {
                System.out.println("not in ASCII: " + c + " , value in Unicode: " + (int) c);
            }
        }
        in.close();
    }
}
