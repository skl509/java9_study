package com.study.java.ch03.ex01.solution;

public class Main {
    public static void main(String[] args) {
        // 1. Employee 클래스로 정의해서 Measurable 배열에 넣는 방법
        // 1) Employee 클래스 4개 생성
        Employee e1 = new Employee(10);
        Employee e2 = new Employee(20);
        Employee e3 = new Employee(30);
        Employee e4 = new Employee(40);
        // 2) Measurable 배열 생성
        Measurable[] objects1 = new Measurable[4];
        // 3) Measurable 배열에 Employee 클래스를 저장
        objects1[0] = e1;
        objects1[1] = e2;
        objects1[2] = e3;
        objects1[3] = e4;
        // 4) 전체 직원의 평균을 구한다
        double average1 = averageEasy(objects1);
        System.out.println("1. 전체 직원의 연봉 평균은 " + average1 + " 입니다.");

        // 2. Measurable 인터페이스로 정의해서 Measurable 배열에 넣는 방법
        // 1) Measurable 인터페이스 4개 생성 (인터페이스를 new 할 수 없으니 클래스를 new 해서 인터페이스로 정의한다)
        Measurable m1 = new Employee(10);
        Measurable m2 = new Employee(30);
        Measurable m3 = new Employee(70);
        Measurable m4 = new Employee(90);
        // 2) Measurable 배열 생성
        Measurable[] objects2 = new Measurable[4];
        // 3) Measurable 배열에 Employee 클래스를 저장
        objects2[0] = m1;
        objects2[1] = m2;
        objects2[2] = m3;
        objects2[3] = m4;
        // 4) 전체 직원의 평균을 구한다
        double average2 = averageHard(objects2);
        System.out.println("2. 전체 직원의 연봉 평균은 " + average2 + " 입니다.");
    }

    /**
     * 1. 전체 직원 연봉의 평균을 구하는 함수 (쉬운 for문)
     * @param objects 직원 정보 배열
     * @return 평균 값
     */
    public static double averageEasy(Measurable[] objects) {
        double sum = 0; // 전체 연봉의 합
        // 배열을 for문으로 돌면서 전체 연봉의 합을 구한다
        for(int i = 0; i < objects.length; i++) {
            sum += objects[i].getMeasure();
        }
        // 전체 연봉의 합을 직원 수만큼 나눠서 평균을 구한다
        return sum/objects.length;
    }

    /**
     * 2. 전체 직원 연봉의 평균을 구하는 함수 (어려운, 심플한 for문)
     * @param objects 직원 정보 배열
     * @return 평균 값
     */
    public static double averageHard(Measurable[] objects) {
        double sum = 0; // 전체 연봉의 합
        // 배열을 for문으로 돌면서 전체 연봉의 합을 구한다
        for (Measurable object : objects) {
            sum += object.getMeasure();
        }
        // 전체 연봉의 합을 직원 수만큼 나눠서 평균을 구한다
        return sum/objects.length;
    }
}
