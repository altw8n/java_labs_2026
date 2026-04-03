/*Реализуйте класс Greeter, который реализует Runnable
и чей метод run печатает n копий "Hello, " + target,
где n и target устанавливаются в конструкторе.
Создайте два экземпляра с разными сообщениями и выполните их одновременно в двух потоках.*/


package org.example.chapter03.task09;

public class Greeter implements Runnable {
    private final int n;
    private final String target;

    public Greeter(int n, String target) {
        this.n = n;
        this.target = target;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello " + target);
        }
    }
}
