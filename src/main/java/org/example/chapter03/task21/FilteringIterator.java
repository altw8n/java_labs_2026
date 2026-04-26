package org.example.chapter03.task21;

import java.util.*;
import java.util.function.Predicate;

public interface FilteringIterator<T> extends Iterator<T> {
    static <T> FilteringIterator<T> fromIterator(Iterator<T> source) {
        return new FilteringIteratorImpl<>(source, null);
    }

    FilteringIterator<T> filter(Predicate<T> predicate);
}
