package com.study.java.ch02.ex09.solution;

public class Car {
    // 변수 선언
    private double x;           // 이동 거리
    private double gallon;      // 보유하고 있는 연료
    private final double MPG;   // 연비

    /**
     * 생성자
     * @param MPG (연비)
     */
    public Car(double MPG) {  // 생성자 만들기
        this.MPG = MPG;
    }

    public double getX() {
        return this.x;
    }
    public double getGallon() {
        return this.gallon;
    }
    public double getMPG() {
        return this.MPG;
    }
    public double distance() {
        return MPG*gallon;
    }

    /**
     * 지정한 거리만큼 움직이는 메서드. 연료가 없으면 그곳에서 멈춘다.
     * @param x (이동할 거리. 단위 : mile)
     * @return Car Class
     */
    public Car drive(double x) {
        this.x += Math.min(x, MPG*gallon);
        this.gallon -= Math.min(this.gallon, x/MPG);
        return this;
    }

    /**
     * 지정한 연료만큼 연료 채우는 메서드
     * @param gallon (연료의 양. 단위 : gallon)
     * @return Car Class
     */
    public Car fuel(double gallon) {
        this.gallon += gallon;
        return this;
    }

    public static void main(String[] args) {
        Car c1 = new Car(5).fuel(10).drive(40);
        System.out.println("c1 - 이동거리 : " + c1.getX() + ", 남은 연료 : " + c1.getGallon() +
                ", 연비 : " + c1.getMPG() + ", 이동 가능 거리 : " + c1.distance()); // 예상 결과 x=40, gallon=2, mpg=5, distance=10
        Car c2 = new Car(10).fuel(5).drive(80);
        System.out.println("c2 - 이동거리 : " + c2.getX() + ", 남은 연료 : " + c2.getGallon() +
                ", 연비 : " + c2.getMPG() + ", 이동 가능 거리 : " + c2.distance()); // 예상 결과 x=50, gallon=0, mpg=10, distance=0
        Car c3 = new Car(5).fuel(5).fuel(3);
        System.out.println("c3 - 이동거리 : " + c3.getX() + ", 남은 연료 : " + c3.getGallon() +
                ", 연비 : " + c3.getMPG() + ", 이동 가능 거리 : " + c3.distance()); // 예상 결과 x=0, gallon=8, mpg=5, distance=40
        Car c4 = new Car(5).fuel(5).drive(20).fuel(3).drive(10);
        System.out.println("c4 - 이동거리 : " + c4.getX() + ", 남은 연료 : " + c4.getGallon() +
                ", 연비 : " + c4.getMPG() + ", 이동 가능 거리 : " + c4.distance()); // 예상 결과 x=30, gallon=2, mpg=5, distance=10
        Car c5 = new Car(5).fuel(5).drive(20).fuel(3).drive(40);
        System.out.println("c5 - 이동거리 : " + c5.getX() + ", 남은 연료 : " + c5.getGallon() +
                ", 연비 : " + c5.getMPG() + ", 이동 가능 거리 : " + c5.distance()); // 예상 결과 x=40, gallon=0, mpg=5, distance=0
    }
}
