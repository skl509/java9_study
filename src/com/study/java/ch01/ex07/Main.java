package com.study.java.ch01.ex07;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("정수를 입력해 주십시오");
        int a = in.nextInt();
        int b = in.nextInt();
        if(a<b){
            System.out.println("큰 수를 먼저 입력 해 주십시오");
        }
        else{
            System.out.println("정수를 두 개 입력 해 주십시오");
            System.out.println(Integer.toUnsignedString(a+b));
            System.out.println(Integer.toUnsignedString(a-b));
            System.out.println(Integer.toUnsignedString(a*b));
            System.out.println(Integer.toUnsignedString(a/b));
            System.out.println(Integer.toUnsignedString(a%b));
        }
    }
}
