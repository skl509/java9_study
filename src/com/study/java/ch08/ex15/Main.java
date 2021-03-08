package com.study.java.ch08.ex15;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Double> numbers = Stream.of(3d, 2d, 10d);//숫자 double형에 맞춰주기
        System.out.println(average(numbers));
    }
    public static double average(Stream<Double> numbers) {
        Tuple t = numbers.reduce( //tuple 자료구조,구글링 이용 ,recduce 메서드 이용해 결과를 합친다
                new Tuple(0, 0), // 0으로 초기화선언 , 아무것도 없다, 요소 그자체 없다... 시작점...
                (tuple, number) -> new Tuple(tuple.total + number, tuple.count + 1),
                //람다식으로 합 구해주기 , count +1 해줘야 무한대 안뜬다, 그리고 요소 더해질때 마다 카운트 + 1 된다.
                (t1, t2) -> new Tuple(t1.total + t2.total, t1.count + t2.count));
        //실제로 스트림에 들어간 값 호출
        return t.total / t.count;
    }
    private static class Tuple {//tuple 자료구조,구글링 이용 ,list 사용 x , 리스트 사용시 합이랑 나누기 따로 메서드 구현 해줘야된다
        // 파라미터 값 2개,합이랑 나누기,몇개 카운팅했는지 구하기(숫자나문자) 동시에 변수에 저장
        double total;
        double count;
        Tuple(double total, double count) {
            this.total = total;
            this.count = count;
        }
    }
}
