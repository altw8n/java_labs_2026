package org.example.chapter03.task06;

public class Main {
    static void main() {
        SquareSequence s = new SquareSequence();
        for (int i = 0; i < 10; i++) {
            System.out.println(s.next());
        }
    }
}
