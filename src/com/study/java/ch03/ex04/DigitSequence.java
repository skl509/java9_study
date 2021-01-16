package com.study.java.ch03.ex04;


public class DigitSequence implements IntSequence {
    private int number;

    public DigitSequence(int n) {
        number = n;
    } // interface IntSequence의 기능을 사용할수 있다. DigitSequence가 of 메소드 출력값으로 사용 하기 위해서

    public boolean hasNext() {
        return number != 0;
    }
    public int next() {
        int result = number % 10;
        number /= 10;
        return result;
    }
}