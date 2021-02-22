package com.study.java.ch06.ex21;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(com.study.java.ch06.ex21.Main.<List<String>>construct(10)));
    }
    @SafeVarargs
    public static <T> T[] construct(int length, T... values) { ///가변인자 T에 여러개 메개변수가 올 수 있다
        return (T[]) Array.newInstance(values.getClass().getComponentType(), length);
        //java.lang.reflect.Array 기능 이용해서 배열 만들기
        // Component type 은 array 를 구성하는 object 의 type 을 이야기한다. length는 배열길이
    }
}


