package com.study.java.ch03.ex04;


public class Main {
        public static void main(String[] args) {
            IntSequence digit = IntSequence.of(3,1,4,1,5,9); // 생성자 생성하고 of 메소드를 이용하게 만들어준다
            while (digit.hasNext()) // hasNext()이용해서 배열의 끝까지 연산하게 해준다 , 조건 메소드
                System.out.print(digit.next() + " "); // 각 자리의 값(1의자리 순 ,그다음 10의자리...)을 DigitSequence 값으로 출력하게 만들어준다 next()메서드 이용


        }
    }

