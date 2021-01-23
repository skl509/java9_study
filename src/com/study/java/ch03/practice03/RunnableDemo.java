package com.study.java.ch03.practice03;

public class RunnableDemo {//특정 일을 정의시 인터페이스를 구현, runnable 인터페이스, 모든 코어 작업중인 상태로 유지
    public static void main(String[] args) {
        Runnable task = new HelloTask();
        Thread thread = new Thread(task);
        thread.start();
        System.out.println("Thread started");
    }
}

class HelloTask implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello, World!");
        }
    }
}
