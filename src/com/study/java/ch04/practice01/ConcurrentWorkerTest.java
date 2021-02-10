package com.study.java.ch04.practice01;

public class ConcurrentWorkerTest {
    public static void main(String[] args) {
        ConcurrentWorker worker = new ConcurrentWorker(); //생성자 생성
        worker.work(); // 람다식표현
        System.out.println("Done");
    }
}
