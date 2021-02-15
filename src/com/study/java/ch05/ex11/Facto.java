package com.study.java.ch05.ex11;

public class Facto {
    public static void main(String[] args) {
        System.out.println(factorial(0));
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) { //0팩토리얼은 1 , 0 또는 1이면 몸체에서 코딩한대로 출력
            Exception ex = new Exception();//예외객체 생성하기
            ex.printStackTrace();//스택추적 출력
            return 1;
        }
        return n * factorial(n - 1);//재귀형태 팩토리얼,마지막으로 계산
    }
}

