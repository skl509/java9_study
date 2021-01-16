package com.study.java.ch03.practice02;

public interface Identified {
    default int getId() { return Math.abs(hashCode()); }



}
