package com.study.java.ch03.practice05; //메서드참조와 생성자 참조

import java.util.ArrayList;

public class ConstructorReferenceDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(); //생성자 참조, 타입별로 맞춰주기 객체 배열이 아닌, 직원이름의 배열로
        names.add("Peter");
        names.add("Paul");
        names.add("Mary");
        Employee[] employees = names.stream().map(Employee::new).toArray(Employee[]::new);
        for (Employee e : employees) System.out.println(e.getName());
    }
}
