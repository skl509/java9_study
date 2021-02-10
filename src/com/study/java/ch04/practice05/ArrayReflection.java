package com.study.java.ch04.practice05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayReflection {
    public static Object[] badCopyOf(Object[] array, int newLength) { // 유용하지 않다.
        Object[] newArray = new Object[newLength]; // 자바 배열은 요소의 타입을 기억한다,Object 맞춰주기
        for (int i = 0; i < Math.min(array.length, newLength); i++)
            newArray[i] = array[i];
        return newArray;
    }
    
    public static Object goodCopyOf(Object array, int newLength) { // 어떤 타입의 배열이든 길이를 늘릴 수 있다.
                                                                    // 매개변수 타입은 Object , Object[] x
        Class<?> cl = array.getClass();
        if (!cl.isArray()) return null;
        Class<?> componentType = cl.getComponentType();
        int length = Array.getLength(array);
        Object newArray = Array.newInstance(componentType, newLength);
        for (int i = 0; i < Math.min(length, newLength); i++)
            Array.set(newArray, i, Array.get(array,  i));
        return newArray;
    }
    
    public static void main(String[] args) {
        int[] primes = { 2, 3, 5, 7, 11 };
        primes = (int[]) goodCopyOf(primes, 10);
        System.out.println(Arrays.toString(primes));
    }
}
