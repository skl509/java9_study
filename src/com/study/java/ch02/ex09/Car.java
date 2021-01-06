package com.study.java.ch02.ex09;

public class Car {
    private double x;     // 변수선언 ,거리
    private double gallon; // 연료(시간)
    private double MPS ; // 연비

    public Car(double MPS) {  // 생성자 만들기
        this.MPS = 30; // 1갤런으로 30마일 간다...
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getGallon() {
        return this.gallon;
    }

    public void setGallon(double gallon) {
        this.gallon = gallon;
    }

    public double getMPS() {
        return this.MPS;
    }

    public void setMPS(double MPS) {
        this.MPS = MPS;
    }

    public Car drive(double x) { // 지정한 마일만큼 움직이는 메서드, 연료없으면 그 곳에서 멈춘다...
        if(this.x <= MPS*this.gallon){
            setX(this.x + x);
            return this;}
        else{
            setX(this.MPS*this.gallon);
            return this;
        }
    }

    public Car fuel(double gallon) {   // 지정한 수만큼 연료 채우는 메서드
        setGallon(this.gallon + gallon);
        return this;
    }

    public Car distance(double gallon) { // 현제 가지고 있는 연료로 얼만큼 갈 수 있는지 알려주는 메서드, 연료는 내가 지정
        if(this.x >= MPS*this.gallon){ // 디버깅 하고 알아냈따 여기서도 this.x + x 해줄 필요는 없다 위에서 이미 하고 내려와서...
            setMPS(0);
            return this;}
        else{
            setMPS(MPS*this.gallon - this.x);
            return this;
        }
    }


    public static void main(String[] args) {
        Car d = new Car(30).fuel(3).drive(30).distance(3); // 연료 3만큼 넣고 거리를 간다고 설정
        System.out.println("차가 간 거리 \n" +  d.getX() + " \n연료의 수 \n" +  d.getGallon() + " \n남은 연료로 현제 갈 수 있는 거리 \n" + d.getMPS());
    }



}