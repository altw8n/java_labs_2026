package org.example.chapter02.task10;

public class Car {
    private final double fuelEfficiency;
    private double x;
    private double y;
    private double fuel;

    public Car(double fuelEfficiency, double initialFuel) {
        if (fuelEfficiency <= 0) {
            throw new IllegalArgumentException("negative value for fuel Efficiency");
        }

        if (initialFuel < 0) {
            throw new IllegalArgumentException("negative value for fuel");
        }

        this.fuelEfficiency = fuelEfficiency;
        this.x = 0;
        this.y = 0;
        this.fuel = initialFuel;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getFuel() {
        return fuel;
    }

    public boolean hasFuel() {
        return fuel > 0;
    }

    public double drive(double distance, double angleDegrees) {
        if (distance < 0) {
            throw new IllegalArgumentException("negative distance ");
        }
        if (distance == 0 || fuel <= 0) {
            return 0;
        }
        double maxPossibleDistance = fuel * fuelEfficiency;
        double actualDistance = Math.min(maxPossibleDistance, distance);
        double fuelConsumed = actualDistance / fuelEfficiency;
        double angleRadians = Math.toRadians(angleDegrees);
        double deltaX = actualDistance * Math.cos(angleRadians);
        double deltaY = actualDistance * Math.sin(angleRadians);
        x += deltaX;
        y += deltaY;
        fuel -= fuelConsumed;
        return actualDistance;
    }

    public double driveToPoint(double targetX, double targetY) {
        double deltaX = targetX - x;
        double deltaY = targetY - y;
        double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        double angleDegrees = Math.toDegrees(Math.atan2(deltaY, deltaX));
        return drive(distance, angleDegrees);
    }

    public void addFuel(double liters) {
        if (liters < 0) {
            throw new IllegalArgumentException("negative value for fuel");
        }
        if (liters == 0) {
            return;
        }
        fuel += liters;
    }

    public double getMaxDistance() {
        return fuel * fuelEfficiency;
    }

    public double getDistanceFromStart() {
        return Math.sqrt(x * x + y * y);
    }

    public void drawMap(int size) {
        double minX = Math.min(0, x);
        double maxX = Math.max(0, x);
        double minY = Math.min(0, y);
        double maxY = Math.max(0, y);

        double rangeX = maxX - minX;
        double rangeY = maxY - minY;
        double maxRange = Math.max(rangeX, rangeY);

        if (maxRange == 0) {
            maxRange = 1;
        }

        double padding = maxRange * 0.1;
        minX -= padding;
        maxX += padding;
        minY -= padding;
        maxY += padding;

        rangeX = maxX - minX;
        rangeY = maxY - minY;

        char[][] map = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = '.';
            }
        }

        int startX = (int) ((0 - minX) / rangeX * (size - 1));
        int startY = (int) ((0 - minY) / rangeY * (size - 1));

        if (startX >= 0 && startX < size && startY >= 0 && startY < size) {
            map[size - 1 - startY][startX] = 'S';
        }

        int carX = (int) ((x - minX) / rangeX * (size - 1));
        int carY = (int) ((y - minY) / rangeY * (size - 1));
        if (carX >= 0 && carX < size && carY >= 0 && carY < size) {
            if (map[size - 1 - carY][carX] == 'S') {
                map[size - 1 - carY][carX] = 'B';
            } else {
                map[size - 1 - carY][carX] = 'C';
            }
        }
        System.out.println("\nMAP (size: " + size + "x" + size + ")");
        System.out.println("start (0,0) = S, car = C, car + start = B");
        System.out.printf("X range: [%.1f, %.1f], Y range: [%.1f, %.1f]\n", minX, maxX, minY, maxY);
        System.out.println();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return String.format("car pos (%.2f, %.2f), fuel: %.2f L, efficiency: %.2f km/L", x, y, fuel, fuelEfficiency);
    }
}