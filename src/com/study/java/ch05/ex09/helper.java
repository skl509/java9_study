package com.study.java.ch05.ex09;

import java.util.concurrent.locks.ReentrantLock;//동기화인데 시작점과 끝점을 수동적으로 설정이 가능한 명시적인 동기화


public class helper {
    public static void main(String[] args) {
    }
    public static AutoCloseableReentrantLock add() {
        AutoCloseableReentrantLock lock = new AutoCloseableReentrantLock();//생성자 만들기
        lock.lock();//동기화의 시작 락건다...
        return lock;
    }
}
class AutoCloseableReentrantLock extends ReentrantLock implements AutoCloseable {//autocloseable 반환
    public void close() {
        this.unlock(); //언락 호출 동기화 끝
    }
}

