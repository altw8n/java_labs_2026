package org.example.chapter02.task09;

public class Main {
    static void main() {
        TimeOfDay t2 = new TimeOfDay(23, 27);
        TimeOfDay t1 = new TimeOfDay(14, 25);
        System.out.println(t2.minutesFrom(t1));
        t1.plusMinutes(30);
        System.out.println(t1);
    }


}
