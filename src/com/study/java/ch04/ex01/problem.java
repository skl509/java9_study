package com.study.java.ch04.ex01;

import java.util.Objects;

public class problem {
    static public void main(String[] args) {
        Point a = new Point(1, 1); // 포인트 생성자
        Point b = new Point(1, 1);
        System.out.println(a);
        System.out.println(a.equals(b)); // a,b equals 기능 확인
        LabeledPoint c = new LabeledPoint("A", 1, 1);
        LabeledPoint d = new LabeledPoint("A", 1, 1);
        System.out.println(c);
        System.out.println(c.equals(d)); // c,d equals 기능확인
    }
}

class Point {
    private double x; // 문제3 에서 x,y 를 protected로 바꾼다
    private double y;
    public Point(double x, double y) { this.x = x;this.y = y; }
    public double getX() {
        return x;
    } // 접근자 메서드 정의
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) { this.y = y; }
    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }//toString 메서드 기능
    @Override
    public boolean equals(Object obj) { // equals 메서드 기능
        if (this == obj) { return true; }
        if (obj == null) { return false; } //매개변수가 null이면 거짓을 반환
        if (getClass() != obj.getClass()) { return false; } //인스턴스 변수들 동일한지 검사
        Point other = (Point) obj; //두 객체 동일 한지 확인
        return x == other.x && y == other.y;
    }
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    } //해시코드 메서드, equals 메서드와 호환
}
class LabeledPoint extends Point { // Point의 서브클래스, LabeledPoint
    private String label;
    public LabeledPoint(String label, double x, double y) { //보호된 변수 x,y는 이 인스턴스에 있는 변수에만 접근 가능하다.
        super(x, y);
        this.label = label;
    }
    public String getLabel() {
        return label;
    } // getLabel의 접근자 메서드
    @Override
    public String toString() {
        return "LabeledPoint [x=" + getX() + ", y=" + getY() + "]";
    } //toString 메서드 기능
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) { return false; }
        LabeledPoint other = (LabeledPoint) obj; //캐스트 변환 타입별로 동일해야 된다.
        return label.equals(other.label);
    }
    @Override
    public int hashCode() {
        return Objects.hash(label, getX(), getY());
    }
}

