package org.example.chapter03.task18;

interface Greeting {
    void say(String name);
}

public class Main {
    public static void main() {
        Greeting g1 = new Greeting() {
            @Override
            public void say(String name) {
                System.out.println("Привет, " + name);
            }
        };

        Greeting g2 = (name) -> System.out.println("Привет, " + name);

        g1.say("1");
        g2.say("2");
    }
}