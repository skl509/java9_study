package com.study.java.ch03.practice03;

public interface Comparator<T> {  //comparator 인터페이스 , 문자열대 문자열 그리고 직원식대 직원식으로 비교...
    int compare(T first, T second);
}
