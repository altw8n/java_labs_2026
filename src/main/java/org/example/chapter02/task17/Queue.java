package org.example.chapter02.task17;

import java.util.NoSuchElementException;

public class Queue {
    private static class Node {
        private String value;
        private Node next;

        public Node(String value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public Queue() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty(){
        return (size == 0);
    }

    public void add(String value) {
        Node node = new Node(value);
        if (isEmpty()){
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public String remove() {
        if (isEmpty()){
            throw new NoSuchElementException("queue is empty");
        }
        String value = head.value;
        head = head.next;
        size--;
        if (isEmpty()){
            tail = null;
        }
        return value;
    }

    public void printQueue(){
        Node current = head;
        while (current != null){
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

}
