package com.study.java.ch04.practice01;

public abstract class Person { //추상메서드, 서브클래스가 해당 메서드를 강제구현
    // 추상클래스는 인터페이스와 달리 인스턴스 변수와 생성자를 포함 가능 그러나 인스턴스 는 생성불가
    private String name;

    public Person(String name) { this.name = name; }
    public final String getName() { return name; }

    public abstract int getId();
}
