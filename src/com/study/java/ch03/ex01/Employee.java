package com.study.java.ch03.ex01;

public class Employee implements Measurable {
    double pay;


    @Override
    public double getMeasure() {
        return this.pay;

    }

    public void setMeasure(double pay, String[] name) {
        this.pay = pay;

    }

}