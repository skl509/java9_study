package com.study.java.ch08.ex13;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) { //만든 메서드 작동 잘되는지 확인
        Stream<Integer> a1 = Stream.of(1, 2, 3);
        Stream<Integer> b1 = Stream.of(6, 7, 8, 9);
        System.out.println(Arrays.toString(zip(a1, b1).toArray())); //배열로 만들어주기
    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) { //요서 번갈아 넣어주는 메서드
        Iterator<T> a = second.iterator(); //second 스트릠의 모든 요소 값을 가져온다
        Stream<T> b = first.flatMap((e) -> { //flatMap ,이중 for문 처럼 이용, 처음 받은 값 stream에 리턴
            if (a.hasNext()) { //hasNext() 메소드는 읽어 올 요소가 남아있는지 확인하는 메소드 , 있으면 참값 없으면 거짓값 반환
                T el = a.next(); // next(), second에서 공백전까지 한문자씩 입력 받음
                return Stream.of(e, el); //있으면 el 값
            }
            return Stream.of(e, null);//없으면 null 값넣어주기
        });
        if (a.hasNext()) {
            Stream<T> second2 = StreamSupport
                    .stream(Spliterators.spliteratorUnknownSize(a, 0), false)
                    //병렬 처리 지원Spliterators 메서드,처음보고 된 크기가 소스의 실제 요소 수와 같지 않은 경우 분할 안됨.
                    .flatMap(e -> Stream.of(null, e));//가져올 요소가 바닥나면 null 값 넣어주기 stream에
            b = Stream.concat(b, second2);//스트림에 문자열 붙이기 메서드 concat
        }
        return b;
    }
}

