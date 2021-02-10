
package com.study.java.ch04.ex10;

import java.io.PrintStream;
import java.lang.reflect.Method;//임의 메서드 호출1
import java.lang.reflect.Modifier;// 임의 메서드 호출2
import java.util.Arrays;

public class ex4_10 { // 15장 자바플랫폼 모듈 시스템에서 배운다...
    public static void main(String[] args){}
    public static void printMembers(PrintStream out, Class clazz) { // 지정한 클래스(clazz)의 모든 메서드를 출력하는 방법...
        while (clazz != null) {
            for (Method m : clazz.getDeclaredMethods()) {
                out.println(Modifier.toString(m.getModifiers()) + " "
                        + m.getReturnType().getCanonicalName() + " "
                        + m.getName() + Arrays.toString(m.getParameters()));
            }
            clazz = clazz.getSuperclass();
        }
    }
}



