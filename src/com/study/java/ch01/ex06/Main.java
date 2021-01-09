package com.study.java.ch01.ex06;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
    System.out.println("1000을 입력해 주십시오");
    BigInteger bitest = new BigInteger("1");
    int a;
    for(a=1 ; a<= 1000; a++){
        bitest = bitest.multiply(new BigInteger(""+a));
    }
        System.out.println(--a + "! = " + bitest);
    }
}