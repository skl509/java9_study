package com.study.java.ch03.ex04;


import com.study.java.ch03.practice01.DigitSequence;

public abstract class digits implements IntSequence {

    public static void main(String[] args) {
        com.study.java.ch03.practice01.IntSequence digits = new DigitSequence(314159);
        while(digits.hasNext())
            System.out.print(digits.next() + " ");

    }
}
