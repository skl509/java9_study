package com.study.java.ch03.practice02;

public interface IntSequence {
    default boolean hasNext() { return true; };
    int next();
}

