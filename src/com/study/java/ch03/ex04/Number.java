package com.study.java.ch03.ex04;

public class Number implements IntSequence {
    double n;

    public Number(double n) {
        this.n = n;
    }

    public double getNumber() {
        return this.n;
    }
}
