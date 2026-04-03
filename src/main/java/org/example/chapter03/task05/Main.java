package org.example.chapter03.task05;

public class Main {
    static void main() {
        IntSequence ones = IntSequence.constant(1);
        for (int i = 0; i < 10; i++) {
            System.out.println(ones.next() + " ");
        }
    }
}
