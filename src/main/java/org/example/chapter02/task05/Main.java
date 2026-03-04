/*Добавьте методы translate и scale в запись Point.
Метод translate перемещает точку на заданное расстояние по осям x и y.
Метод scale масштабирует обе координаты на заданный коэффициент.
Реализуйте эти методы так, чтобы они возвращали новые точки с результатами.*/

package org.example.chapter02.task05;

record Point(double x, double y){
    public Point translate(double dx, double dy){
        return new Point(x + dx, y + dy);
    }

    public Point scale(double coef){
        return new Point(x * coef, y * coef);
    }
}

public class Main {
    static void main() {
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p);
    }
}
