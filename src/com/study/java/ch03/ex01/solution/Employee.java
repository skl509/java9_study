package com.study.java.ch03.ex01.solution;

public class Employee implements Measurable {
    private double pay;

    /**
     * 생성자 (직원 생성 시 급여를 바로 설정)
     * @param pay 직원 급여
     */
    public Employee(double pay) {
        this.pay = pay;
    }

    /**
     * 직원 급여 정보 전달
     * @return 직원 급여
     */
    @Override
    public double getMeasure() {
        return this.pay;
    }
}
