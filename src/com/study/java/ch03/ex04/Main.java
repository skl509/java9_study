package com.study.java.ch03.ex04;

public class Main {

    public static void main(String[] args) {
        IntSequence[] intSequences = new IntSequence[6];
        Number n1 = new Number(3.0D);
        Number n2 = new Number(1.0D);
        Number n3 = new Number(4.0D);
        Number n4 = new Number(1.0D);
        Number n5 = new Number(5.0D);
        Number n6 = new Number(9.0D);
        IntSequence[] objects1 = new IntSequence[]{n1, n2, n3, n4, n5, n6};
        double print = of(objects1);
        System.out.println(print);
    }

    public static double of(IntSequence[] objects1) {
        double result = 0.0D;

        for(int i = 0; i < objects1.length; ++i) {
            result += objects1[i].getNumber() % 10.0D * Math.pow(10.0D, (double)(5 - i));
        }

        return result;
    }
}

