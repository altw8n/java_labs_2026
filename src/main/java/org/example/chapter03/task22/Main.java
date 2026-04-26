package org.example.chapter03.task22;
/*
import lombok.experimental.Delegate;

class Engine {
    public void start() { System.out.println("Engine started"); }
    public int getHorsepower() { return 150; }
}

class Radio {
    public void playMusic() { System.out.println("Playing music"); }
    public String getStation() { return "101.2 FM"; }
}


class Car {
    @Delegate private final Engine engine = new Engine();
    @Delegate private final Radio radio  = new Radio();
}

public class Main {
    public static void main() {
        Car car = new Car();
        car.start();
        car.playMusic();
        System.out.println(car.getHorsepower() + " hp");
        System.out.println("Station: " + car.getStation());
    }
}*/