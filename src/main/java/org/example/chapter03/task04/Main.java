package org.example.chapter03.task04;

public class Main {
    static void main() {
        IntSequence sequence = IntSequence.of(3, 1, 4, 1, 5, 9);
        while (sequence.hasNext()) {
            System.out.print(sequence.next() + " ");
        }
        System.out.println();
    }
}
