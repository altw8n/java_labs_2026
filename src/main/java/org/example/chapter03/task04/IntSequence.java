package org.example.chapter03.task04;

public interface IntSequence {
    boolean hasNext();
    int next();
    static IntSequence of(int... values){
        return new IntSequence() {
            private int index = 0;
            private final int[] data = values;

            @Override
            public boolean hasNext() {
                return index < data.length;
            }

            @Override
            public int next() {
                if (!hasNext()){
                    throw new IllegalStateException("no more elements");
                }
                return data[index++];
            }
        };
    }
}
