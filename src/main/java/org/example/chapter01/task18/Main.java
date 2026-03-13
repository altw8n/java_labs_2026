/*Напишите программу, которая выводит лотерейную комбинацию,
выбирая шесть различных чисел от 1 до 49.
Чтобы выбрать шесть различных чисел,
начните со списочного массива, заполненного числами 1...49.
Выберите случайный индекс и удалите элемент.
Повторите шесть раз. Выведите результат в отсортированном порядке.*/

package org.example.chapter01.task18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main() {
        ArrayList<Integer> numbers = new ArrayList<>(50);
        for (int i = 1; i <= 49; i++) {
            numbers.add(i);
        }
        ArrayList<Integer> result = new ArrayList<>(6);
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int n = random.nextInt(numbers.size());
            int chosen = numbers.remove(n);
            result.add(chosen);
        }
        Collections.sort(result);
        System.out.println(result);
    }
}