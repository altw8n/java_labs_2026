package org.example.chapter03.task23;

public class Main {
    public static void main() throws InterruptedException {

        System.out.println("Наследование от Thread");
        Thread t1 = new MyThread();
        t1.start();

        System.out.println("\nРеализация Runnable ");
        Runnable task = new MyTask();
        Thread t2 = new Thread(task);
        t2.start();

        System.out.println("\n Лямбда");
        Thread t4 = new Thread(() -> System.out.println("lambda"));
        t4.start();

        t1.join();
        t2.join();
        t4.join();
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("MyThread: " + getName());
        }
    }

    static class MyTask implements Runnable {
        @Override
        public void run() {
            System.out.println("MyTask: " + Thread.currentThread().getName());
        }
    }
}