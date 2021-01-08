package com.study.java.ch03.ex01;

public class Employee implements Measurable {
    @Override
    public double getMeasure() {
        return 0;
    }

    @Override
    public void average(Measurable[] objects) {
        int sum = 0;
        float avg = 0f;
        int[] Measurable = {200, 300, 400, 500};
        for (int i = 0; i < Measurable.length; i++) {
            sum += Measurable[i];
        }
        avg = sum / (float) Measurable.length;
    }
}
