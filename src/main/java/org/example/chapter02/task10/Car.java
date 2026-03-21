/*Реализуйте класс Car, который моделирует автомобиль,
движущийся вдоль оси x и потребляющий бензин по мере движения.
Предоставьте методы для проезда заданного количества миль,
для добавления заданного количества галлонов в бак
и для получения текущего расстояния от начала координат и уровня топлива.
Укажите эффективность использования топлива (в милях на галлон) в конструкторе.
Должен ли этот класс быть неизменяемым? Почему да или почему нет?*/

package org.example.chapter02.task10;

public class Car {
    private final double rate;
    private double x;
    private double fuel;

    public Car(double rate, double fuel){
        this.rate = rate;
        this.x = 0;
        this.fuel = fuel;
    }

    public double getRate() {
        return rate;
    }

    public double getX() {
        return x;
    }

    public double getFuel() {
        return fuel;
    }

    public boolean fuelIsExist(){
        return fuel > 0;
    }

    public double drive(double miles){
        double maxDistance = rate * fuel;
        double resDistance = Math.min(maxDistance, miles);
        double fuelSpend = resDistance / rate;
        x += resDistance;
        fuel -= fuelSpend;
        return resDistance;
    }

    public void addFuel(double gallons){
        if (gallons < 0){
            return;
        }
        fuel += gallons;
    }

    public double getMaxDistance(){
        return fuel * rate;
    }
}
