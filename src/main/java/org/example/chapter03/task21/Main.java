package org.example.chapter03.task21;

import java.util.*;


public class Main {
    static void main() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Iterator<Integer> sourceIterator = numbers.iterator();
        FilteringIterator<Integer> iterator = FilteringIterator.fromIterator(sourceIterator);

        System.out.println("1: вывести только чётные числа");
        FilteringIterator<Integer> evenIterator = iterator.filter(n -> n % 2 == 0);
        while (evenIterator.hasNext()) {
            System.out.print(evenIterator.next() + " ");
        }
        System.out.println();

        System.out.println("\n 2. вывести все");
        FilteringIterator<Integer> allIterator = FilteringIterator.fromIterator(numbers.iterator());
        while (allIterator.hasNext()) {
            System.out.print(allIterator.next() + " ");
        }
        System.out.println();

        System.out.println("\n 3. вывести ничего");
        FilteringIterator<Integer> emptyIterator = FilteringIterator
                .fromIterator(numbers.iterator())
                .filter(n -> n > 100);
        while (emptyIterator.hasNext()) {
            System.out.print(emptyIterator.next() + " ");
        }
        System.out.println(".");
    }
}
