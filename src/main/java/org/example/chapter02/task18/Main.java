package org.example.chapter02.task18;

public class Main {
    public static void main() {
        Queue queue = new Queue();
        queue.add("a");
        queue.add("b");
        queue.add("c");

        Queue.Iterator it = queue.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}