package com.study.java.ch04.practice01;

import java.util.ArrayList;

public class AnonymousSubclassDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(100) { //슈퍼 클래스 생성자 생성, 인스턴스 초기용량 100
            public void add(int index, String element) {
                super.add(index, element); // add메서드 오버라이드
                System.out.printf("Adding %s at %d\n", element, index);
            }
        };
        
        names.add(0, "Peter");
        names.add(1, "Paul");
        names.add(0, "Mary");
        System.out.println(names);
        
        invite(new ArrayList<String>() {{ add("Harry"); add("Sally"); }}); // new 익명의 서브클래스 + 초기화 블록
    }
    
    public static void invite(ArrayList<String> friends) {
        System.out.println("Guest list: " + friends);
    }
}
