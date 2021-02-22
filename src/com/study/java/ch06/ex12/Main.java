package com.study.java.ch06.ex12;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    }
    public static <T> void minmax(List<T> elements, Comparator<? super T> comp, List<? super T> result) {
        T min = Collections.min(elements, comp);//elements에서 가장 작은 요소와 큰요소를 result 리스트에 저장하는 메서드
        T max = Collections.max(elements, comp);//자바 유틸 콜렉션 이용
        result.add(min);
        result.add(max);
    }
}

