package com.study.java.ch04.practice01;
//object::instnaceMetod 형태로 사용한것, 객체 참조대신 super사용
public class ConcurrentWorker extends Worker { //Work 기능 상속받아서 사용한다.
    public void work() { 
        Thread t = new Thread(super::work); //super를 이용한 메서드 표현식, Super::instanceMethod
        t.start();
    }
}
