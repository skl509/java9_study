package com.study.java.ch06.ex20;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] A = repeat(2, "a", "b");
        System.out.println(Arrays.toString(A));
    }
    @SafeVarargs
    public static final <T> T[] repeat(int n, T... objs) {
        //Class값이나 생성자 참조 필요없이 전달받은 객체의 사본 n개로 구성된 배열을 반환
        T[] B = (T[]) Array.newInstance(objs.getClass().getComponentType(), n * objs.length);
        //java.lang.reflect.Array; 기능 이용해서 B배열 만들기,
        // Component type 은 array 를 구성하는 object 의 type 을 이야기한다.
        for (int i = 0; i < objs.length; i++) {
            System.arraycopy(objs, 0, B, i * objs.length, objs.length);
            //System.arraycopy는 자바 배열값 복사에 사용 된다 각 피라미터가 의미하는 것은 1.전송원 배열 2.소스배열 시작위치
            //                                      3. 전송처 배열 4. 전송처 소스배열 시작 위치 5. 복사되는 배열 길이
        }
        return B;
    }
}


