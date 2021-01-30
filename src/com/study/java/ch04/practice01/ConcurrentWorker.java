package com.study.java.ch04.practice01;
//object::instnaceMetod 형태로 사용한것, 객체 참조대신 super사용
public class ConcurrentWorker extends Worker {
    public void work() { 
        Thread t = new Thread(super::work);
        t.start();
    }
}
