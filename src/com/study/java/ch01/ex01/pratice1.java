package com.study.java.ch01.ex01;

public class pratice1 import java.util.Scanner;

public class pratice1 { //챕터1 연습문제 1
    public static void main(String[] args){ //
        Scanner in = new Scanner(System.in);
        System.out.println("정수를 입력해주십시오");
        int a = in.nextInt();
        String binaryString = Integer.toBinaryString(a);
        System.out.println(binaryString);
        String octalString = Integer.toOctalString(a);
        System.out.println(octalString);
        String hexString = Integer.toHexString(a);
        System.out.println(hexString);
        double b = 1%a;
        b = in.nextDouble();
        System.out.println(b);


    }




}

