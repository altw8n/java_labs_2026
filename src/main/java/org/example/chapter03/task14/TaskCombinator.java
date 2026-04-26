/*Напишите метод, который принимает массив экземпляров Runnable
и возвращает Runnable, чей метод run выполняет их по порядку.
Верните лямбда-выражение.*/

package org.example.chapter03.task14;

public class TaskCombinator {
    public static Runnable combine(Runnable... tasks) {
        if (tasks == null) {
            return () -> {
            };
        }
        return () -> {
            for (Runnable task : tasks) {
                if (task != null) {
                    task.run();
                }
            }
        };
    }
}
