package com.study.java.ch08.ex01;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String[] words = { "a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa"};
        getFiveLongWords(words);//words 출력
    }
    public static String[] getFiveLongWords(String[] words) {
        return Stream.of(words) //문자열 스트림 생성
                .filter((s) -> { //s로 스트림 요소 받는다, 람다식 ()닫힐때 까지
                    System.out.println("filtering");
                    return s.length() > 0; //filter 기능 요소를 특정 기준으로 걸러낸다, 길이 0 이상이면 걸러나오게 한다.
                })
                .limit(5)// 스트림 크기 5로 제한해준다 , 처음 5개 요청하도록
                .toArray(String[]::new);// 메서드참조, 람다식 String[] -> new... 생성자 만들어준다 , string 배열타입으로로 형변형...
    }
}
