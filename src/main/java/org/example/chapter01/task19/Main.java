/*Напишите программу, которая читает
двумерный массив целых чисел и определяет,
является ли он магическим квадратом
(то есть сумма всех строк, всех столбцов и диагоналей одинакова).
Принимайте строки ввода, которые вы разбиваете на отдельные целые числа,
и останавливайтесь, когда пользователь вводит пустую строку.*/

package org.example.chapter01.task19;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        while (true) {
            String line = in.nextLine();
            if (line.isEmpty()) {
                break;
            }
            String[] numbers = line.split(" ");
            ArrayList<Integer> row = new ArrayList<>();
            for (String num : numbers) {
                row.add(Integer.parseInt(num));
            }
            matrix.add(row);
        }

        int targetSum = 0;
        for (int i = 0; i < matrix.getFirst().size(); ++i){
            targetSum += matrix.getFirst().get(i);
        }
        boolean isMagic = true;
        for (int i = 0; i < matrix.size(); ++i){
            int rowSum = 0;
            for (int j = 0; j < matrix.size(); ++j){
                rowSum += matrix.get(i).get(j);
            }
            if (rowSum != targetSum){
                isMagic = false;
                break;
            }
        }

        for (int j = 0; j < matrix.size(); ++j){
            int colSum = 0;
            for (int i = 0; i < matrix.size(); ++i){
                colSum += matrix.get(i).get(j);
            }
            if (targetSum != colSum){
                isMagic = false;
                break;
            }
        }

        int diagSum1 = 0;
        for (int i = 0; i < matrix.size(); ++i){
            diagSum1 += matrix.get(i).get(i);
        }
        if (targetSum != diagSum1){
            isMagic = false;
        }

        int diagSum2 = 0;
        for (int i = 0; i < matrix.size(); ++i){
            diagSum2 += matrix.get(i).get(matrix.size() - 1 - i);
        }
        if (targetSum != diagSum2){
            isMagic = false;
        }
        if (isMagic){
            System.out.println("magic square");
        } else {
            System.out.println("not magic square");
        }
    }
}
