package com.study.java.ch07.ex14;

import java.util.AbstractList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = getNoDieList(5);
        System.out.println(list.get(3));
        System.out.println(list.size());
    }
    public static List<Integer> getNoDieList(int n) { //뷰 만들기,(저장없이)
        return new AbstractList<Integer>() { //생성자 만들기
            final private int cap1 = n;
            @Override
            public Integer get(int cap2) {
                if (cap2 >= 0 && cap2 < cap1) { //논리 연산자 and, cap2 값 0 이상 그리고 cap2값 cap1 미만
                    return cap2; //cap2 호출
                }
                return null; // 그외는 전부 값 없다
            }
            @Override
            public int size() {
                return cap1;
            } //반환값이 >= 0 이 되는 것이 보증시키기 위해서
        };
    }
}

