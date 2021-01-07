package com.study.java.ch01.ex10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("숫자를 입력해 주십시오");
        long a = in.nextLong(); // 임의의 long 값 생성
        String b = Long.toString(a, 36); //임의 생성된 a값을 문자열(결과값)로 변환 to.string 메서드는(val(숫자) , n) 진수 변환해준다.
        System.out.println(b); //결과값 출력... // 문자열은 숫자와 문자 모두다 포함...
    }
}