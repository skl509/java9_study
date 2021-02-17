package com.study.java.ch06.practice03;

import java.util.ArrayList;

public class Closeables { // 타입경계, 특정 클래스 확장하거나 인터페이스 구현 가능
    public static <T extends AutoCloseable> void closeAll(ArrayList<T> elems) throws Exception {
        for (T elem : elems) elem.close();
    }
}
