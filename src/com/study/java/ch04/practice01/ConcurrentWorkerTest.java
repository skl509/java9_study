package com.study.java.ch04.practice01;

public class ConcurrentWorkerTest {
    public static void main(String[] args) {
        ConcurrentWorker worker = new ConcurrentWorker();
        worker.work();
        System.out.println("Done");
    }
}
