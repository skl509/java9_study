package com.study.java.ch04.practice05;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class MethodPrinter {
    public static void main(String[] args) throws ReflectiveOperationException { // 15장 자바 플렛폼 모듈에서 설명
        System.out.print("Class name: ");
        Scanner in = new Scanner(System.in);
        String className = in.nextLine();
        Class<?> cl = Class.forName(className);
        while (cl != null) {
            for (Method m : cl.getDeclaredMethods()) { 
                System.out.println(
                    Modifier.toString(m.getModifiers()) + " " +
                    m.getReturnType().getCanonicalName() + " " +
                    m.getName() +
                    Arrays.toString(m.getParameters()));                    
            }
            cl = cl.getSuperclass();
        }
    }
}
