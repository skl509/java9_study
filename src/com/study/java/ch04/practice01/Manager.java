package com.study.java.ch04.practice01;

public class Manager extends Employee { //상속받은것 Employee 클래스 비공개가 아닌 클래스로
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
    } //보호된 변수인 salary에 접근할수 있다.

}
