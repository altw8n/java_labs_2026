package org.example.chapter02.task06;

public class Main {
    static void main() {
        Point p = new Point(2, 3);
        p.translate(1, 5);
        System.out.println(p.getX() + "; " + p.getY());
        p.scale(3);
        System.out.println(p.getX() + "; " + p.getY());
    }
}
