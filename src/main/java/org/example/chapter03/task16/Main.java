package org.example.chapter03.task16;

public class Main {
    static void main() {
        RandomSequence dice = new RandomSequence(1, 6);
        for (int i = 0; i < 10; i++) {
            System.out.print(dice.next() + " ");
        }
        System.out.println("\n");
    }
}
