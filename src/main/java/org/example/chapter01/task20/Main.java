/*Напишите программу,
 которая сохраняет треугольник Паскаля
 до заданного n в ArrayList<ArrayList<Integer>>.*/

package org.example.chapter01.task20;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = in.nextInt();

        ArrayList<ArrayList<Integer>> triangle = pascalTriangle(n);

        for (int i = 0; i < triangle.size(); i++) {
            for (int s = 0; s < triangle.size() - i; s++) {
                System.out.print(" ");
            }
            for (Integer num : triangle.get(i)) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> pascalTriangle(int n) {
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int val = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                    row.add(val);
                }
            }

            triangle.add(row);
        }

        return triangle;
    }
}