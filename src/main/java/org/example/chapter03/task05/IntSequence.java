/*Добавьте статический метод с именем constant класса IntSequence,
который возвращает бесконечную постоянную последовательность.
Например, IntSequence.constant(1) выдает значения 1, 1, 1, ... ad infinitum.
Дополнительное задание: сделайте это с помощью лямбда-выражения.*/

package org.example.chapter03.task05;

public interface IntSequence {
    default boolean hasNext() {
        return true;
    }

    int next();

    static IntSequence constant(int value) {
        return () -> value;
    }
}
