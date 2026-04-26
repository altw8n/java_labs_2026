package org.example.chapter03.task09;

public class Main {
    static void main() {
        Greeter greeter1 = new Greeter(3, "first");
        Greeter greeter2 = new Greeter(4, "second");
        greeter1.run();
        greeter2.run();
    }
}
