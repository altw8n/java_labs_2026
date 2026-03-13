/*Доп задание:
Реализовать методы, имитирующие класс ArrayList:
(Только методы, без класса).
1 - Добавление в конец (принимает массив, заполненность массива, элемент, возвращает массив)
2 - Добавление по индексу (принимает массив, элемент, заполненность массива, индекс, возвращает массив)
3 - Получение по индексу (принимает массив, заполненность массива, индекс, возвращает массив)
*/

package org.example.chapter01.task22;

import java.util.Arrays;

public class Main {
    static void main() {
        String[] array = {"a", "b"};
        int size = 2;
        array = addToEnd(array, size, "c");
        size++;
        printArray(array, size);
        array = insert(array, size, "f", 1);
        size++;
        printArray(array, size);
        System.out.println(get(array, size, 2));
    }

    public static String[] resize(String[] array) {
        return Arrays.copyOf(array, array.length * 2);
    }

    public static String[] addToEnd(String[] array, int size, String element) {
        if (size >= array.length) {
            array = resize(array);
        }
        array[size] = element;
        return array;
    }

    public static String[] insert(String[] array, int size, String element, int index) {
        if (index > size || index < 0) {
            return null;
        }
        if (size >= array.length) {
            array = resize(array);
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        return array;
    }

    public static String get(String[] array, int size, int index) {
        if (index >= size || index < 0) {
            return null;
        }
        return array[index];
    }

    public static void printArray(String[] array, int size) {
        System.out.println("Array:");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
    }
}
