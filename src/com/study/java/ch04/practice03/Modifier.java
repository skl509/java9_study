package com.study.java.ch04.practice03;

public enum Modifier {
    PUBLIC, PRIVATE, PROTECTED, STATIC, FINAL, ABSTRACT;
    private int mask;

    static { //정적 적 초기화 블록에서 초기화
        int maskBit = 1; // 생성자가 정적 멤버를 참조할 수 있다. 열거 상수가 정적 멤버보다 먼저 생성 되서...
        for (Modifier m : Modifier.values()) { //열거 상수 생성 뒤 위쪽 부터 차례대로 실행된다.
            m.mask = maskBit;
            maskBit *= 2; 
        }
    }
    
    public int getMask() {
        return mask;
    }
}
