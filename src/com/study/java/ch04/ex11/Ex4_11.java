package com.study.java.ch04.ex11;

import java.lang.reflect.Field; // 임의 필드 호출
import java.lang.reflect.Method; //임의 메서드 호출

public class Ex4_11 {
    public static final String message = "Hello, World!";

    public static void main(String... args) throws Exception { //예외처리..
        Class<?> clazz = Class.forName("java.lang.System");
        Field out = clazz.getDeclaredField("out");// 필드 배열 반환
        Class<?> outPs = out.getType(); //필드 클래스의 gettype 메서드...
        Method println = outPs.getMethod("println", String.class);//메서드 배열 반환
        println.invoke(out.get(null), message); //invoke 로 println 메서드 호출..
    }

}


