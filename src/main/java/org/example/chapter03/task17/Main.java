package org.example.chapter03.task17;


interface Flyable {
    default void fly() {
        System.out.println("Летит");
    }

    default void takeOff() {
        System.out.println("Взлёт");
    }
}


interface Swimmable {
    default void swim() {
        System.out.println("Плывёт");
    }

    default void dive() {
        System.out.println("Ныряет");
    }
}


class Duck implements Flyable, Swimmable {
    private String name;

    public Duck(String name) {
        this.name = name;
    }
}


public class Main {
    public static void main() {
        Duck duck = new Duck("a");
        duck.fly();
        duck.takeOff();
        duck.swim();
        duck.dive();
    }
}