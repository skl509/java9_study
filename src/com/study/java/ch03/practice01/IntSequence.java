package com.study.java.ch03.practice01;

public interface IntSequence {
    boolean hasNext();
    int next();

    static IntSequence digitsOf(int n) {
        return new DigitSequence(n);
    }



}



