package org.example.chapter01.task24;

public class Main {
    static void main() {
        IntArrayList array = new IntArrayList();
        for (int i = 0; i < 10; i++){
            array.add_to_end(i);
        }
        array.print();
        array.add_by_index(22, 2);
        array.print();
        array.add_by_index(80, 0);
        array.print();
        array.replace(0, 5);
        array.print();
        array.remove(0);
        System.out.println(array.get(3));
        System.out.println(array.size());
    }
}
