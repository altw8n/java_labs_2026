/*Напишите программу, которая читает строку
 и выводит все её непустые подстроки.*/

package org.example.chapter01.task08;

import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter string: ");
        String str = in.nextLine();

        for (int start = 0; start < str.length(); start++) {
            for (int end = start + 1; end <= str.length(); end++) {
                String substr = str.substring(start, end);
                System.out.println(substr);
            }
        }

        in.close();
    }
}
