package org.example.chapter03.task06;

import java.math.BigInteger;

public class SquareSequence implements Sequence<BigInteger> {
    private BigInteger i = BigInteger.ZERO;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public BigInteger next() {
        i = i.add(BigInteger.ONE);
        return i.multiply(i);
    }
}
