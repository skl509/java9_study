package com.study.java.ch03.practice01;

public class SquareSequence implements IntSequence {
    private int i;

    public boolean hasNext() {
        return true;
    }


    public int next(){
        i++;
        return i*i;

    }

}
