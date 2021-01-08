<<<<<<< HEAD
package ch03.ex01;
=======
package com.study.java.ch03.ex01;
>>>>>>> origin/main

public class Employee implements Measurable {
    @Override
    public double getMeasure() {
        return 0;
    }

    @Override
<<<<<<< HEAD
    public int average() {
        int sum = 0;
        int result=0 ;
        int[] Measurable = {200, 300, 400, 500};
        for (int i = 0; i < Measurable.length; i++) {
            sum += Measurable[i];

        }
        return result = sum / Measurable.length;
    }
}
=======
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
>>>>>>> origin/main
