package com.study.java.ch04.practice02;

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
    
    public String toString() {
        return super.toString() + "[bonus=" + bonus + "]";
    }
    
    public Manager clone() throws CloneNotSupportedException {
        return (Manager) super.clone();
    }
}
