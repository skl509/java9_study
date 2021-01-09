package com.study.java.ch03.ex01;

public class Employee implements Measurable { //임플로이 4개만들거고 //미저러블 배열만들고// 그 배열에 임플로이 집어넣기//
    //배열들어가는 상태에서 포문 돌려서 페이 돌려주고 그것이 셋 페이 xx // 셋페이 없에고 그냥 average(Measurable[] objects 에다 계산


    double pay1;
    double pay2;
    double pay3;
    double pay4;



    @Override
    public double getMeasure1() { return this.pay1; }
    public void setMeasure1(double pay) { this.pay1 = pay1; }
    public double getMeasure2() { return this.pay2; }
    public void setMeasure2(double pay) { this.pay2 = pay2; }
    public double getMeasure3() { return this.pay3; }
    public void setMeasure3(double pay) {this.pay3 = pay3; }
    public double getMeasure4() { return this.pay4; }
    public void setMeasure4(double pay) { this.pay4 = pay4; }
}