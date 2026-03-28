package org.example.chapter02.task19;

import java.util.ArrayList;
import java.util.List;

public class Circle {
    private final Point center;
    private final double radius;

    public Circle(Point center, double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("negative radius");
        }
        this.center = center;
        this.radius = radius;
    }

    public Circle(double x, double y, double radius) {
        this(new Point(x, y), radius);
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public static List<Point> intersections(Circle c1, Circle c2) {
        List<Point> result = new ArrayList<>();
        double r1 = c1.radius;
        double r2 = c2.radius;
        Point p1 = c1.center;
        Point p2 = c2.center;
        double d = p1.distanceTo(p2);

        if (d > r1 + r2 || d < Math.abs(r1 - r2)) {
            return result;
        }

        if (d == 0 && Math.abs(r1 - r2) < 1e-10) {
            return result;
        }

        if (Math.abs(d - (r1 + r2)) < 1e-10 || Math.abs(d - Math.abs(r1 - r2)) < 1e-10) {
            double t = r1 / d;
            double x = p1.getX() + (p2.getX() - p1.getX()) * t;
            double y = p1.getY() + (p2.getY() - p1.getY()) * t;
            result.add(new Point(x, y));
            return result;
        }

        double a = (r1 * r1 - r2 * r2 + d * d) / (2 * d);
        double h = Math.sqrt(r1 * r1 - a * a);

        double x0 = p1.getX() + (p2.getX() - p1.getX()) * a / d;
        double y0 = p1.getY() + (p2.getY() - p1.getY()) * a / d;

        double dx = -(p2.getY() - p1.getY()) * h / d;
        double dy = (p2.getX() - p1.getX()) * h / d;

        result.add(new Point(x0 + dx, y0 + dy));
        result.add(new Point(x0 - dx, y0 - dy));

        return result;
    }

    @Override
    public String toString() {
        return String.format("circle: [center=%s, radius=%.2f]", center, radius);
    }
}