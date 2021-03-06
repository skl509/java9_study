package com.study.java.ch03.practice02;

public class Employee implements Person, Identified {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() { return Identified.super.getId(); } //person,identified 의 getid메서드 충돌 가능성있다, 충돌한 메서중 하나에 위임함
}

