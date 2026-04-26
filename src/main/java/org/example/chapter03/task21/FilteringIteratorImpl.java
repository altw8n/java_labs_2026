package org.example.chapter03.task21;

import java.util.*;
import java.util.Iterator;
import java.util.function.Predicate;

class FilteringIteratorImpl<T> implements FilteringIterator<T> {
    private final Iterator<T> source;
    private final Predicate<T> filter;
    private T nextElement;
    private boolean hasNextCached;

    FilteringIteratorImpl(Iterator<T> source, Predicate<T> filter) {
        this.source = source;
        this.filter = filter;
        this.hasNextCached = false;
        this.nextElement = null;
    }

    private void findNext() {
        if (hasNextCached) {
            return;
        }
        while (source.hasNext()) {
            T current = source.next();
            if (filter == null || filter.test(current)) {
                nextElement = current;
                hasNextCached = true;
                return;
            }
        }
        hasNextCached = false;
        nextElement = null;
    }

    @Override
    public boolean hasNext() {
        findNext();
        return hasNextCached;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T result = nextElement;
        hasNextCached = false;
        nextElement = null;
        return result;
    }

    @Override
    public FilteringIterator<T> filter(Predicate<T> newFilter) {
        Predicate<T> combinedFilter;
        if (this.filter == null) {
            combinedFilter = newFilter;
        } else {
            combinedFilter = this.filter.and(newFilter);
        }
        return new FilteringIteratorImpl<>(this.source, combinedFilter);
    }
}
