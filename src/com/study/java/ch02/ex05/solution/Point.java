package com.study.java.ch02.ex05.solution;

public class Point {
    private double x;   // 변수선언
    private double y;

    public Point(double x, double y) { //생성자 만들기
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return this.x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return this.y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public Point translate(double x, double y){ // 특정한 점에서 다른 점(get함수 설정받은 값)까지 이동시키는 메서드
        setX(this.x + x);
        setY(this.y + y);
        return this;
    }
    public Point scale(double s){ // 특정한 점에서 주어진 비율(get함수 설정 받은 값)로 좌표 크기 조절하는 메서드
        setX(this.x * s);
        setY(this.y * s);
        return this;
    }

    public static void main(String[] args) {
        Point p = new Point(3,4).translate(1,3).scale(0.5);
        System.out.println("새로운 점의 좌표는 x : " + p.getX()+ ", y : " + p.getY());
    }
}
