package com.study.java.ch03.practice05;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name) {
        this(name, 0);
    }


    public String getName() {
        return name;
    }
}
    
