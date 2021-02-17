package com.study.java.ch06.practice04;

import java.util.function.Predicate;

public class ArrayUtil {
    public static <T> void printAll(T[] elements, Predicate<? super T> filter) {//모든 타입의 배열에 작동하는 rintALL
        for (T e : elements)  // 이 메서드는 T타입이나 T의 슈퍼타입 요소용 필터를 매개변수로 받는다
            if (filter.test(e))
                System.out.println(e.toString());
    }
}
