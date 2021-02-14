package com.study.java.ch05.practice01;

public class ThrowDemo {
    public static int randInt(int low, int high) { // 두 경계값 사이에 있는 임의의 정수를 돌려주는 메서드
        if (low > high)
            throw new IllegalArgumentException( // 예외 던지기
                "low should be <= high but low is "
                + low + " and high is " + high);

        return low + (int)(Math.random() * (high - low + 1));
    }
    
    public static void main(String[] args) {
        System.out.println("Generating a random number...");
        int r = randInt(10, 20);
        System.out.println("r = " + r);
        System.out.println("And another...");
        r = randInt(10, 5); // 예외던져서 실행흐름 중단 시키기
        System.out.println("r = " + r);
    }
}
