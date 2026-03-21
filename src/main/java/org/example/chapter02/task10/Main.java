package org.example.chapter02.task10;

public class Main {
    static void main() {
        Car car1 = new Car(3.5, 50);
        System.out.println(car1.fuelIsExist());
        System.out.println(car1.drive(100));
        System.out.println(car1.getX());
        System.out.println(car1.getFuel());
        System.out.println(car1.getRate());
        System.out.println(car1.getMaxDistance());
        car1.addFuel(12);
        System.out.println(car1.getFuel());
    }
}
