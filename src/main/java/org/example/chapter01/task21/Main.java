/*Улучшите метод average так, чтобы он вызывался хотя бы с одним аргументом.*/

package org.example.chapter01.task21;

public class Main {
    static void main() {
        double average1 = average(3, 5, 5);
        System.out.println(average1);
        double average2 = average(4, 9);
        System.out.println(average2);
        double average3 = average(8);
        System.out.println(average3);
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
