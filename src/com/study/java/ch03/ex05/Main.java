package com.study.java.ch03.ex05;

public class Main {
    public static void main(String[] args) {
        IntSequence constant = IntSequence.constant(1); // 매개변수(constant) , 자유변수값(1)
        System.out.println(constant.next());
    }
}
