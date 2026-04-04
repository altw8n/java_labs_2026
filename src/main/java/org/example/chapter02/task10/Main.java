package org.example.chapter02.task10;

public class Main {
    public static void main() {
        System.out.println("efficiency: 15, fuel: 50");
        Car car = new Car(15, 50);
        System.out.println(car);
        System.out.println("has fuel: " + car.hasFuel());
        Car.drawMap(car, 11);

        System.out.println("100 km, angle: 90");
        car.drive(100, 90);
        Car.drawMap(car, 11);
        System.out.println(car);

        System.out.println("50 km, angle: 45°");
        car.drive(50, 45).addFuel(30);
        Car.drawMap(car, 11);
        System.out.println(car);

        System.out.println("max dist: " + car.getMaxDistance());
        System.out.println("dist from start: " + car.getDistanceFromStart());

        System.out.println("drive to point (100, 50)");
        car.driveToPoint(100, 50).addFuel(15);
        Car.drawMap(car, 11);
        System.out.println(car);

        car.drive(500, 0);
        Car.drawMap(car, 11);
        System.out.println(car);

    }
}