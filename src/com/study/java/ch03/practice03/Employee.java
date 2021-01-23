package com.study.java.ch03.practice03;

public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(double salary) {
        this.name = "";
        this.salary = salary;
    }

    public Employee(String name) {
        // salary는 0으로 초기화
        this.name = name;
    }

    public Employee() {
        this("", 0);
    }





    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    } //직원 급여순으로 정렬하기
}
