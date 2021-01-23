package com.study.java.ch03.ex09;

public class Greeter implements Runnable {
    private String target;
    private int times;

    Greeter(String target, int times) {
        this.target = target;
        this.times = times;
    }

    @Override //인터페이스 runnable에서 run함수를 만들어 줄렸더니 this.를 사용하지 못해서 이곳에 오버라이드 한다...
    public void run() {// 카운트 세서 타겟출력해주는 메서드
        for (int i = 0; i < this.times; i++) {
            System.out.println(this.target);
        }
    }
}