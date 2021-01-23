package com.study.java.ch03.ex05;


    interface IntSequence {
        static IntSequence constant (int value) {
            return () -> value;
        } //(매개변수목록) -> { 함수몸체 }
        default boolean hasNext() {
            return true;
        }
        int next();
    }


