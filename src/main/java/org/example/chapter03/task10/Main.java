package org.example.chapter03.task10;

public class Main {
    static void main() {
        Runnable task1 = () -> System.out.println("111");
        Runnable task2 = () -> System.out.println("222");
        Runnable task3 = () -> System.out.println("333");

        Runner.runTogether(task1, task2, task3);
        Runner.runInOrder(task1, task2, task3);
    }
}
