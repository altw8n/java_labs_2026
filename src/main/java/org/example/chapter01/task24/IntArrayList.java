package org.example.chapter01.task24;

public class IntArrayList {
    private Integer[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public IntArrayList() {
        elements = new Integer[DEFAULT_CAPACITY];
        size = 0;
    }

    public IntArrayList(int capacity) {
        elements = new Integer[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return elements.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void resize() {
        int newCapacity;
        if (elements.length == 0) {
            newCapacity = DEFAULT_CAPACITY;
        } else {
            newCapacity = elements.length + (elements.length / 2);
        }
        Integer[] newArray = new Integer[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = elements[i];
        }
        elements = newArray;
    }

    public void add_to_end(Integer el) {
        if (size == elements.length) {
            resize();
        }
        elements[size] = el;
        size++;
    }

    public void add_by_index(Integer el, int index) {
        if (index < 0 || index > size) {
            System.out.println("index out of range");
            return;
        }
        if (size == elements.length) {
            resize();
        }
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = el;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index > size) {
            System.out.println("index out of range");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
    }

    public void replace(int index, Integer newElement) {
        if (index < 0 || index > size) {
            System.out.println("index out of range");
            return;
        }
        elements[index] = newElement;
    }

    public Integer get(int index) {
        if (index < 0 || index > size) {
            System.out.println("index out of range");
            return null;
        }
        return elements[index];
    }

    public void print() {
        System.out.println("array: ");
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
        System.out.println();
    }
}
