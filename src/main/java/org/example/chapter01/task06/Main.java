/*Напишите программу, которая вычисляет факториал
 n! = 1 × 2 × ... × n, используя BigInteger.
 Вычислите факториал числа 1000.*/

package org.example.chapter01.task06;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter number: ");
        int n = in.nextInt();
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= n; i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(n + "! = " + factorial);
    }
}