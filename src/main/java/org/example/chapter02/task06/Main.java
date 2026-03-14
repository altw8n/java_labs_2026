/*Повторите предыдущее упражнение,
но теперь реализуйте Point как класс и сделайте translate и scale мутаторами.*/

package org.example.chapter02.task06;

class Point{
    private double x;
    private double y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setX(double newX){
        this.x = newX;
    }

    public double getX(){
        return this.x;
    }

    public void setY(double newY){
        this.y = newY;
    }

    public double getY(){
        return this.y;
    }

    public void translate(double dx, double dy){
        this.x += dx;
        this.y += dy;
    }

    public void scale(double coef){
        this.x *= coef;
        this.y *= coef;
    }
}

public class Main {
    static void main() {
        Point p = new Point(2, 3);
        p.translate(1, 5);
        System.out.println(p.getX() + "; " + p.getY());
    }
}
