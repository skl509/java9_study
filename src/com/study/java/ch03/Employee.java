package ch03;

public class Employee implements Measurable {
    @Override
    public double getMeasure() {
        return 0;
    }

    @Override
    public double average() {
        double sum = 0;
        double result=0 ;
        double[] Measurable = {200, 300, 400, 500};
        for (int i = 0; i < Measurable.length; i++) {
            sum += Measurable[i];

        }
        return result = sum / Measurable.length;
    }
}