package ch03.ex01;

public class Employee implements Measurable {
    @Override
    public double getMeasure() {
        return 0;
    }

    @Override
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