package com.study.java.ch03.practice01;

public class DigitSequence implements IntSequence{
    private int number;

    public DigitSequence(int n){ number = n; }
    public boolean hasNext() { return number !=0; } // number와 0이 값이 다르면 참 , 같으면 거짓을 출력(끝)
    public int next() { int result = number % 10;
        number /= 10;
        return result; }
    public int rest(){ return number; }


}
