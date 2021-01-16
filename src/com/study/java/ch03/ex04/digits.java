package com.study.java.ch03.ex04;




public abstract class digits implements IntSequence {

    public static void main(String[] args) {
        IntSequence a= IntSequence.of(3, 1, 4, 1, 5, 9);
         //a만 넣으면 메모리 위치로 값이 이상하게 나온다.
        while(a.hasNext())
            System.out.println("구성된 시퀀스는 "+ a.next() + "이다");

    }
}
