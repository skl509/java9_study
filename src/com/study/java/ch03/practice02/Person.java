package com.study.java.ch03.practice02;

public interface Person {
    String getName();
    default int getId(){ return 0;}



}
