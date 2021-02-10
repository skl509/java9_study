package com.study.java.ch04.ex04;


public class Main {
    class Point {
        private final double x, y;
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public double getX() {
            return x;
        }
        public double getY() {
            return y;
        }
    }
    abstract class Shape { //추상클래스 shape 정의
        Point point;
        public Shape(Point point) {
            this.point = point;
        }
        public void moveBy(double dx, double dy) { this.point = new Point(this.point.getX() + dx, this.point.getY() + dy);}
        public abstract Point getCenter();
    }
    class Circle extends Shape { //서브 클래스 Circle
        private final double radius;
        public Circle(Point center, double radius) {////생성자 만들기
            super(center); //슈퍼타입 cneter
            this.radius = radius;
        }
        @Override
        public Point getCenter() {
            return this.point;
        }
    }
    class Rectangle extends Shape { //서브 클래스 Retangle
        private final double width;
        private final double height;
        public Rectangle(Point topLeft, double width, double height) {////생성자 만들기
            super(topLeft);
            this.width = width;
            this.height = height;
        }
        @Override
        public Point getCenter() { // 가운대 평균값
            double newX = (this.point.getX() + this.width) / 2;
            double newY = (this.point.getY() + this.height) / 2;
            return new Point(newX, newY);
        }
    }
    class Line extends Shape { //서브 클래스 Line
        private Point from;
        private Point to;
        public Line(Point from, Point to) { //생성자 만들기
            super(null);
            this.from = from;
            this.to = to;
            double centerX = (this.from.getX() + this.to.getX()) / 2;
            double centerY = (this.from.getY() + this.to.getY()) / 2;
            this.point = new Point(centerX, centerY);
        }
        @Override
        public Point getCenter() {
            return this.point;
        }
        @Override
        public void moveBy(double dx, double dy) {
            super.moveBy(dx, dy);
            this.from = new Point(this.from.getX() + dx, this.from.getY() + dy);
            this.to = new Point(this.to.getX() + dx, this.to.getY() + dy);
        }
    }
}
