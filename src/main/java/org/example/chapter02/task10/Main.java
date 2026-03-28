package org.example.chapter02.task10;

public class Main {
    public static void main(String[] args) {
        System.out.println("efficiency: 15, fuel: 50");
        Car car = new Car(15, 50);
        System.out.println(car);
        System.out.println("has fuel: " + car.hasFuel());
        car.drawMap(11);

        System.out.println("100 km, angle: 90");
        double driven = car.drive(100, 90);
        System.out.println("driven: " + driven + "km");
        System.out.println(car);
        car.drawMap(11);

        System.out.println("50 km, angle: 45°");
        driven = car.drive(50, 45);
        System.out.println("driven: " + driven + "km");
        System.out.println(car);
        car.drawMap(11);

        System.out.println("add 30 liters");
        car.addFuel(30);
        System.out.println(car);

        System.out.println("max dist: " + car.getMaxDistance());
        System.out.println("dist from start: " + car.getDistanceFromStart());

        System.out.println("drive to point (100, 50)");
        driven = car.driveToPoint(100, 50);
        System.out.println("driven: " + driven + "km");
        System.out.println(car);
        car.drawMap(11);


        driven = car.drive(500, 0);
        System.out.println("driven: " + driven + "km");
        System.out.println(car);
        car.drawMap(11);

    }
}