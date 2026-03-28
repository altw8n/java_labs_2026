/*Добавьте методы translate и scale в запись Point.
Метод translate перемещает точку на заданное расстояние по осям x и y.
Метод scale масштабирует обе координаты на заданный коэффициент.
Реализуйте эти методы так, чтобы они возвращали новые точки с результатами.*/

package org.example.chapter02.task05;

public class Main {
    static void main() {
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p);
    }
}
