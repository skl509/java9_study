package com.study.java.ch02.ex05;

public class Point {

    private double x;   // 변수선언
    private double y;


    public Point(double x, double y){ //생성자 만들기
        this.x = x;
        this.y = y;

    }
    public double getX(){
        return x;
    }
    public void setX(double x){ //setX 입력받을수 있게 x 집어넣음
        this.x=x;

    }
    public double getY(){
        return y;
    }
    public void setY(double y){
        this.y=y;
    }
    public Point translate(Point other){ // 특정한 점에서 다른 점(get함수 설정받은 값)까지 이동시키는 메서드
        return new Point((this.x+other.getX()),this.y+other.getY());

    }
    public Point scale(Point otehr1){ // 특정한 점에서 주어진 비율(get함수 설정 받은 값)로 좌표 크기 조절하는 메서드
        return new Point((this.x* otehr1.getX()), this.y* otehr1.getY());
    }
    public static void main(String[] args) {
        Point n = new Point(3,4);
        Point t = new Point(1,3);
        Point s = new Point(0.5 , 0.5);
        Point result = n.translate(t).scale(s);
        System.out.println("새로운 점의 좌표는 x : " + result.getX()+ ", y : " + result.getY());
    }



}
