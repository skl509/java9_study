import java.util.Scanner;
package com.study.java.ch01.ex02;

public class pratice2 {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("정수(양의 정수 또는 음의 정수)를 입력 해 주십시오")
    int a = in.nextInt();
    int Return;
    if (a >= 360) {
        System.out.println(a%360);
    }
    else if(a<0) {
        System.out.println(a % 360 + 360);
    }else
            {System.out.println(a);
    }
    }

