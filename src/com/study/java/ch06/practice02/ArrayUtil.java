package com.study.java.ch06.practice02;

public class ArrayUtil {
    public static <T> void swap(T[] array, int i, int j) { // 임의의 배열에 들어 있는 요소 교환
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static <T> T[] swap(int i, int j, T... values) {
        T temp = values[i];
        values[i] = values[j];
        values[j] = temp;
        return values;
    }
}
