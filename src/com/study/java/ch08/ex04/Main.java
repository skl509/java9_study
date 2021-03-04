package com.study.java.ch08.ex04;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Long> random = random(25214903917L, 11L, (long) Math.pow(2, 48), 0L); //시드값 초기화 그리고 요소 값들 초기화
        System.out.println(random.limit(5).collect(Collectors.toList())); // 조건에 맞춰서 출력해주기, 5이하의 크기를 갖는 스트림 반환 그리고 별도의 리스트 생성
        // collect(Collectors.toList())
    }
    public static Stream<Long> random(Long a, Long c, Long m, Long seed) { // 파라미터 넣어주기, 난수 스트림 만들기
        return Stream.iterate(seed, (pre) -> (a * pre + c) % m);// literate()함수 이용(연산 반복이용할때), seed 초기값, seed=xn의 값어떻게 변경될지 람다식
    }
}