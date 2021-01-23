package com.study.java.ch03.practice02;

public interface Identified {
    default int getId() { return Math.abs(hashCode()); } // 객체에서 파생한 정수를 반환
}
