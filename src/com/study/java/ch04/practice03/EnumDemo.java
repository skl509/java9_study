package com.study.java.ch04.practice03;

public class EnumDemo {
    public static void main(String[] args) {
        Size notMySize = Size.valueOf("SMALL");
        System.out.println(notMySize);
        
        for (Size s : Size.values()) { System.out.println(s); }
        
        System.out.println(Size.MEDIUM.ordinal());
    }
}
