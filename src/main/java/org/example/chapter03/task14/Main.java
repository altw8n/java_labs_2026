package org.example.chapter03.task14;

public class Main {
    static void main() {
        Runnable task1 = () -> System.out.println("task 1");
        Runnable task2 = () -> System.out.println("task 2");
        Runnable task3 = () -> System.out.println("task 3");
        Runnable combined = TaskCombinator.combine(task1, task2, task3);
        combined.run();
        System.out.println("---");
    }
}
