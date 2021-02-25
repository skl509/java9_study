package com.study.java.ch07.ex02;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.*;

public class Main {
    public static void main(String[] args) { // 배열기능 추가해서 생성자 만들기 출력...
        ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b", "c"));
        toUpperCaseReplaceAll(a);
        System.out.println(a);
    }
    public static void toUpperCase(ArrayList<String> a) { //반복자, 모든 요소 방문 hasnext, next 기능으로
        ListIterator<String> iterator = a.listIterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            iterator.set(s.toUpperCase()); //내부에서 대문자 만들어주는 기능
        }
    }
    public static void toUpperCaseLoop(ArrayList<String> a) { // 인덱스 값 이용 루프
        for (int i = 0; i < a.size(); i++) {
            a.set(i, a.get(i).toUpperCase());
        }
    }
    public static void toUpperCaseReplaceAll(ArrayList<String> a) {
        a.replaceAll(String::toUpperCase);
    }
    // replaceAll 메서드 이용
}

    

