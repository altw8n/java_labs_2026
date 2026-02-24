/*Улучшите метод average так, чтобы он вызывался хотя бы с одним аргументом.*/

package org.example.chapter01.task21;

public class Main {
    static void main() {
        double a = average(3, 5, 5);
        System.out.println(a);
    }
    static double average(double first, double... values){
        double sum = first;
        int cnt = 1;
        for (double v : values){
            sum += v;
            cnt++;
        }
        return sum / cnt;
    }
}
