package com.study.java.ch07.ex15;

import java.util.AbstractList;
import java.util.List;
import java.util.function.IntFunction;

public class Main {
    public static void main(String[] args) {
        List<Double> list = getNoDieList(Double::valueOf); //메서드 참조를 통해 람다식을 간략히...
        System.out.println(list.get(100));
    }
    public static <E> List<E> getNoDieList(IntFunction<E> fn) { //14번 일반화
        return new AbstractList<E>() {
            @Override
            public E get(int cap1) {
                return fn.apply(cap1);
            } //get 메서드 추가
            @Override
            public int size() {
                throw new UnsupportedOperationException();
            } //특정 메서드 던져주기
        };
    }
}
