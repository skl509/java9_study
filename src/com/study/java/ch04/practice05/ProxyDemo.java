package com.study.java.ch04.practice05;


import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyDemo { // 프록시 메커니즘
    public static void main(String[] args) {
        Object[] values = new Object[1000];
        
        for (int i = 0; i < values.length; i++) { // Integer 객체의 프록시로 배열을 채워넣고
                                                 // 추적메시지를 표시한 후 호출을 원래 객체로 전달
            Object value = new Integer(i);
            values[i] = Proxy.newProxyInstance(
                null, value.getClass().getInterfaces(), // 호출 핸들러에 해당하는 람다 표현식
                (Object proxy, Method m, Object[] margs) -> {
                    System.out.println(value + "." + m.getName() + Arrays.toString(margs));
                    return m.invoke(value, margs);
                });
        }
        
        int position = Arrays.binarySearch(values, new Integer(500));
        System.out.println(values[position]); // compareTo 메서드가 프록시를 거쳐 호출된다.
    }
}
