/*Напишите программу, которая выводит
наименьшее и наибольшее положительные значения типа double.
Подсказка: посмотрите Math.nextUp в Java API.*/

package org.example.chapter01.task04;

public class Main {
    public static void main(String[] args){
        double max = Double.MAX_VALUE;
        System.out.println("max val: " + max);
        double min = Math.nextUp(0.0);
        System.out.println("min positive val: " + min);
    }
}
