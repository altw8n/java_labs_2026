package org.example.chapter02.task05;

record Point(double x, double y){
    public Point translate(double dx, double dy){
        return new Point(x + dx, y + dy);
    }

    public Point scale(double coef){
        return new Point(x * coef, y * coef);
    }
}