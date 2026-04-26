/*Реализуйте методы:
public static void runTogether(Runnable... tasks)
public static void runInOrder(Runnable... tasks)
Первый метод должен запускать каждую задачу в отдельном потоке
и затем возвращать управление. Второй метод должен выполнять
все задачи в текущем потоке и возвращать управление,
когда последняя задача завершится.*/

package org.example.chapter03.task10;

public class Runner {
    public static void runTogether(Runnable... tasks) {
        for (Runnable task : tasks) {
            new Thread(task).start();
        }
    }

    public static void runInOrder(Runnable... tasks) {
        for (Runnable task : tasks) {
            task.run();
        }
    }

}
