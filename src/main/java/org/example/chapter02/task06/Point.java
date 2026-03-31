/*Повторите предыдущее упражнение,
но теперь реализуйте Point как класс и сделайте translate и scale мутаторами.*/


package org.example.chapter02.task06;

/**
 * Класс {@code Point} представляет точку на плоскости с координатами x и y
 */

public class Point {
    private double x;
    private double y;

    /**
     * Конструктор создающий точку с заданными координатами
     *
     * @param x координата X
     * @param y координата Y
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * сеттер x
     *
     * @param newX новое значение x
     */
    public void setX(double newX) {
        this.x = newX;
    }

    /**
     * геттер x
     */
    public double getX() {
        return this.x;
    }

    /**
     * сеттер y
     *
     * @param newY новое значение y
     */
    public void setY(double newY) {
        this.y = newY;
    }

    /**
     * геттер y
     */
    public double getY() {
        return this.y;
    }

    /**
     * Перемещает точку на заданные смещения.
     * <p>
     * Метод изменяет текущий объект (мутатор).
     * </p>
     *
     * @param dx смещение по оси x
     * @param dy смещение по оси y
     */
    public void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    /**
     * Масштабирует координаты точки на заданный коэффициент.
     * <p>
     * Метод изменяет текущий объект (мутатор).
     * </p>
     *
     * @param coef коэффициент масштабирования
     */
    public void scale(double coef) {
        this.x *= coef;
        this.y *= coef;
    }
}
