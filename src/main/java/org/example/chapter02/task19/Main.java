package org.example.chapter02.task19;

import java.util.List;

public class Main {
    public static void main() {
        Circle c1 = new Circle(0, 0, 5);
        Circle c2 = new Circle(8, 0, 5);
        List<Point> points = Circle.intersections(c1, c2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("точки пересечения: " + points);
        System.out.println();

        Circle c3 = new Circle(0, 0, 3);
        Circle c4 = new Circle(6, 0, 3);
        points = Circle.intersections(c3, c4);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println("точки пересечения: " + points);
        System.out.println();

        Circle c5 = new Circle(0, 0, 2);
        Circle c6 = new Circle(10, 0, 2);
        points = Circle.intersections(c5, c6);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println("точки пересечения: " + points);
    }
}