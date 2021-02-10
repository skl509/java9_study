package com.study.java.ch04.practice01;

public class Student extends Person implements Named {// Student를 생성해서 Person 변수에 할당할수 있다.
    private int id;

    public Student(String name, int id) { super(name); this.id = id; }
    public int getId() { return id; } //변수에 구체적인 서브클래스의 객체참조를 저장,
                                        // 추상클래스 타입으로 변수를 선언 가능하다.
}
