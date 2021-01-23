package com.study.java.ch03.ex15;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("a", 2),
                new Employee("b", 4),
                new Employee("c", 1)
        };

        sort(employees);
        System.out.println(Arrays.toString(employees));

        sortReversed(employees);
        System.out.println(Arrays.toString(employees)); //역순으로 출력하기
    }


    static void sort(Employee[] employees) {
        Comparator<Employee> c = Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName);
        // 람다식, 하나의 매서드만 참조 ::getSalary
        Arrays.sort(employees, c); //순위가 같은 직원은 이름으로 정렬하기...
    }

    static void sortReversed(Employee[] employees) {
        Comparator<Employee> c = Comparator.comparing(Employee::getSalary, Comparator.reverseOrder())
                .thenComparing(Employee::getName, Comparator.reverseOrder()); //역순으로 된 것 추가해주기,유틸이용해서
        // java.util.Comparator
        Arrays.sort(employees, c);
    }


}
