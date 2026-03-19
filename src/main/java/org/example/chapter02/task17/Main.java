package org.example.chapter02.task17;

public class Main {
    static void main() {
        Queue q = new Queue();
        q.add("1");
        q.add("22");
        q.printQueue();
        System.out.println(q.isEmpty());
        q.add("34");
        q.add("8");
        q.printQueue();
        String str1 = q.remove();
        System.out.println(str1);
        q.printQueue();
    }
}
