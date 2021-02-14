package com.study.java.ch05.practice01; // 스텍추적

public class DefaultUncaughtExceptionHandlerDemo {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler((thread, ex) -> { //예외를 기록한다
            System.err.println(ex.getMessage()); // 오류 메시지용 스트림 , System.err 스택추적
            System.err.println("Goodbye, cruel world!");
        });
        System.out.println(1 / 0);
    }
}
