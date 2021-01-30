package com.study.java.ch04.practice01;

public interface Named {
    default String getName() { return ""; }
}
