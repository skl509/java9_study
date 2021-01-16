package com.study.java.ch03.practice01;

public class Average {
    public static double average(IntSequence seq, int n) {
        int count = 0;
        double sum = 0;
        while (seq.hasNext() && count < n) {
            count++;
            sum += seq.next();

        }
        return count == 0 ? 0 : sum / count;
    }



    public static void main(String[] args) {  //100개 평균 구하기 출력
        SquareSequence squares = new SquareSequence();
        double avg = average(squares, 100);
        System.out.println("100개 사각형의 평균은 : " + avg); //1부터 100까지 제곡들의 합 나누기 100

        IntSequence digits = new DigitSequence(1729);
        while (digits.hasNext())
            System.out.print(digits.next() + " "); // hasNext 메서드가 거짓값을 반환 하기 전까지 출력한다.
            System.out.println(); // 1729 -> 172(9 출력) -> 17 (2출력)-> 1 (7출력)-> 0(1출력) (연산종료)

        digits = new DigitSequence(1729);
        avg = average(digits, 100);
        // 처음 네 개 시퀀스 값만 살펴본다.
        System.out.println("숫자들의 평균은 : " + avg);


    }
}






