package org.example.chapter03.task21;

import java.util.*;
import java.util.function.Predicate;


public class Main {
    static void main() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        printFiltered(numbers, "1. вывести только чётные числа:", n -> n % 2 == 0);
        printFiltered(numbers, "2. вывести все числа:", null);
        printFiltered(numbers, "3. вывести ничего", n -> n > 100);
    }

    private static void printIterator(Iterator<Integer> iterator) {
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    private static void printFiltered(List<Integer> numbers, String title, Predicate<Integer> filter) {
        System.out.println(title);
        FilteringIterator<Integer> iterator = FilteringIterator.fromIterator(numbers.iterator()).filter(filter);
        printIterator(iterator);
        System.out.println();
    }
}
