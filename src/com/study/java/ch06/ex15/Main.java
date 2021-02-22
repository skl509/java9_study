package com.study.java.ch06.ex15;

import java.util.ArrayList;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(0);
        a.add(1);
        a.add(3);
        ArrayList<Integer> MAP = map(a, e -> e * 2);//e로 알아서 추정해서 변환해줌
        System.out.println(MAP);
    }
    public static <T, R> ArrayList<R> map(ArrayList<T> t, Function<? super T, ? extends R> function) {
        //배열리스트 한 개와 객체 한개 받고 전달하는 함수를 리스트에 있는 요소에 적용한 결과로 구성된 배열 리스트를 반환하는 map 메서드
        ArrayList<R> r = new ArrayList<>();
        t.forEach((element) -> r.add(function.apply(element))); //자바 foreach 람다식 , t.forEach(변수 -> 반복처리(변수))
        return r;
    }
}



