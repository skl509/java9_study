package com.study.java.ch06.practice04;

public class Manager extends Employee {
    private double bonus;
    
    public Manager(String name, double salary) {
        super(name, salary);
        bonus = 0;
    }
    
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public double getSalary() { // 슈퍼클래스의 메서드를 오버라이드한다.
        return super.getSalary() + bonus;
    }
}
