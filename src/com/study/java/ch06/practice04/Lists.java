package com.study.java.ch06.practice04;

import java.util.List;

public class Lists {//ArrayList에 null 요소가 들어 있는지 검사하는 메서드
    public static boolean hasNulls(List<?> elements) { //제네릭 메서드만들기, 와일드카드 이용
        for (Object e : elements) {
            if (e == null) return true;
        }
        return false;
    }

    public static void swap(List<?> elements, int i, int j) {
        swapHelper(elements, i, j);
    }
    
    private static <T> void swapHelper(List<T> elements, int i, int j) {
        T temp = elements.get(i);
        elements.set(i, elements.get(j));
        elements.set(j, temp);
    }
}
