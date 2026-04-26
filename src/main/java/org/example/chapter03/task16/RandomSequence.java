/*Реализуйте RandomSequence из раздела 3.9.1 как вложенный класс вне метода randomInts.*/

package org.example.chapter03.task16;

import java.util.random.RandomGenerator;

public class RandomSequence implements IntSequence {
    private static final RandomGenerator GENERATOR = RandomGenerator.getDefault();
    private final int low;
    private final int high;

    public RandomSequence(int low, int high) {
        if (low > high) {
            throw new IllegalArgumentException("low must be <= high");
        }
        this.low = low;
        this.high = high;
    }

    private int getRange() {
        return high - low + 1;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public int next() {
        return low + GENERATOR.nextInt(getRange());
    }

    public int getLow() {
        return low;
    }

    public int getHigh() {
        return high;
    }

    public static IntSequence randomInts(int low, int high) {
        return new RandomSequence(low, high);
    }
}


