package com.study.java.ch03.ex01;

import java.util.List;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) { //
        Measurable[] measurables = new Measurable[4];
        Employee e1 = new Employee(10);  // Employee 클래스 만들어서 Measurable[] 배열에 넣어줄려고, pay 값 이용...
        Employee e2 = new Employee(20);
        Employee e3 = new Employee(30);
        Employee e4 = new Employee(40);
        Measurable[] objects1 = new Measurable[4]; // 문제에 있는 그대로 변수 오브젝트1 배열 만들어주기...
        objects1[0] = e1; // pay 값 배열의 각 위치에 값 넣어주기...
        objects1[1] = e2;
        objects1[2] = e3;
        objects1[3] = e4;

        double average1 = averageEasy(objects1);
        System.out.println("1. 전체 직원의 연봉 평균은 " + average1 + " 입니다.");
    }


    public static double averageEasy(Measurable[] objects) {
        double sum = 0; // 전체 연봉의 합
        // 배열을 for문으로 돌면서 전체 연봉의 합을 구한다
        for (int i = 0; i < objects.length; i++) {
            sum += objects[i].getMeasure();
        }
        // 전체 연봉의 합을 직원 수만큼 나눠서 평균을 구한다
        return sum / objects.length;


    }
}
