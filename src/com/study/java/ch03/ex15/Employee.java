package com.study.java.ch03.ex15;



public class Employee implements IntSequence {
    private int salary;
    private String name;

    Employee(String name, int salary) {
        this.salary = salary;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return this.name;
    }


}



