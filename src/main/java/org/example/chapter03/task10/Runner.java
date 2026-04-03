/*Реализуйте методы:
public static void runTogether(Runnable... tasks)
public static void runInOrder(Runnable... tasks)
Первый метод должен запускать каждую задачу в отдельном потоке
и затем возвращать управление. Второй метод должен выполнять
все задачи в текущем потоке и возвращать управление,
когда последняя задача завершится.*/

package org.example.chapter03.task10;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void runTogether(Runnable... tasks) {
        if (tasks == null || tasks.length == 0) {
            return;
        }
        List<Thread> threads = new ArrayList<>();
        for (Runnable task : tasks) {
            Thread thread = new Thread(task);
            threads.add(thread);
            thread.start();
        }
        System.out.println("все " + tasks.length + " задач запущены в параллельных потоках");
    }

    public static void runInOrder(Runnable... tasks) {
        if (tasks == null) {
            return;
        }
        for (int i = 0; i < tasks.length; i++) {
            System.out.println("задача " + (i + 1) + " из " + tasks.length);
            tasks[i].run();
        }
        System.out.println("все " + tasks.length + " задач выполнены последовательно");
    }

}
