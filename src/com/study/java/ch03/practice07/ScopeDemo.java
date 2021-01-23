package com.study.java.ch03.practice07;

public class ScopeDemo {
    public static void main(String[] args) {
        repeatMessage("Hello", 1000); //헬로우 10번 출력하기
        
        for (String a : args) 
            new Thread(() -> System.out.println(a));
    }

    public static void repeatMessage(String text, int count) { //코드블록, 매개변수(text,count) ,자유변수들의 값(hello,1000) 람다식의 구조
        Runnable r = () -> {
           for (int i = 0; i < count; i++) {
              System.out.println(text);
           }
        };
        new Thread(r).start();                  
     }
}
