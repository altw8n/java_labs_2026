/*Используя только условный оператор, напишите программу,
 которая читает три целых числа и выводит наибольшее.
 Повторите с Math.max.*/

package org.example.chapter01.task03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("enter first number: ");
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        System.out.print("enter second number: ");
        int second = in.nextInt();
        System.out.print("enter third number: ");
        int third = in.nextInt();
        int max1 = (first > second) ? ((first > third) ? first : third) : ((second > third) ? second : third);
        System.out.println("max: " + max1);
        int max2 = Math.max(Math.max(first, second), third);
        System.out.print("max: " + max2);
        in.close();
    }
}
