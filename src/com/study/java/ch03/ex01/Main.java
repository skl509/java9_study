package com.study.java.ch03.ex01;

import java.util.List;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Employee emp = new Employee();
        List<String> list = new ArrayList<>();
        list.add("a씨");
        list.add("b씨");
        list.add("c씨");
        list.add("d씨");
        for (String s : list) {
            System.out.println(s);
        }



    }



    public static double average(Measurable[ ] objects) {

        setAverage(this.line0/4); // 오류나는 이유를 잘 모름
        return this;
    }




    public static void setAverage(double Measurable[],double pay){
        for(int i=0; i<4; i++) {
        }
        double line0 = Measurable[0] + Measurable[1] + Measurable[2] + Measurable[3];
        Measurable[0] = pay;
        Measurable[1] = pay;
        Measurable[2] = pay;
        Measurable[3] = pay;
    }





}