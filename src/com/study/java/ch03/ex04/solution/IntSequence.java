package com.study.java.ch03.ex04.solution;

public interface IntSequence {
    boolean hasNext();
    int next();

    static IntSequence forwardOf(int... arrays) {
        int n = 0;
        for(int i=0; i<arrays.length; i++) {
            n += Math.pow(10, i) * arrays[i];
        }
        return new DigitSequence(n);
    }

    static IntSequence backwardOf(int... arrays) {
        int n = 0;
        for (int array : arrays) {
            n *= 10;
            n += array;
        }
        return new DigitSequence(n);
    }
}
