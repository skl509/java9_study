package com.study.java.ch03.ex01;

public interface Measurable {
    double getMeasure();
    void average(Measurable[] objects); // 인터페이스는 설계할 메소드만 있어야된다
}
