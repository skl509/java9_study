package com.study.java.ch02.ex09;

import java.util.Scanner;

public class Car {
    Scanner in = new Scanner(System.in);

    private double maile ;
    private double galon ;
    private double MPG  ; // 갤런당 마일 단위


    public Car(double MPG) {

        this.MPG = maile/galon;
        this.maile = 0;
        this.galon = 0;// 생성자 통해서 만들어지는 객체의 초기 속도는 0마일, 연료 넣는것도 0 갤론
    }
    public double getMaile(){
        return maile;

    }

    public void setMaile(double maile) {
        this.maile = maile;
    }

    public double getGalon(){

        return galon;
    }

    public void setGalon(double galon) {
        this.galon = galon;
    }

    public Car drive(Car other){

        return new Car(other.getMaile()); // 지정한 마일만큼 드라이브하는 메서드
    }
    public Car fuel(Car other1){

        return new Car(other1.getGalon()); // 지정한 갤런만큼 탱크를 채우는 메서드
    }

    public Car distance(Car other2){    // 연료레벨로 현재 거리를 구하는 메서드
        return new Car(other2.getGalon());
    }

    public static void main(String[] args) {

        Car one = new Car(1);
        Car two = new Car(2);
        Car result = one.drive(two);

        System.out.println(result.getMaile());




    }


}