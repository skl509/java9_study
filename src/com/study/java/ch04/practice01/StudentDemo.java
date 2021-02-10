package com.study.java.ch04.practice01;

public class StudentDemo {
    public static void main(String[] args) {
        Person p = new Student("Fred", 1729); // 구체적인 서브클래스이므로 할당해도 된다
                                                        // Student를 생성해서 Person 변수에 할당한다.
        System.out.println(p.getName());
        Student s = (Student) p;
        System.out.println(s.getName());
        Named n = s;
        System.out.println(n.getName());
    }
}
