package com.study.java.ch03.ex08; //비교판별했을때 요소들이 오름차순으로 정렬될때까지 luckysort, comparator<String> 메소드이용해서 출력하기

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    static public void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(); // 생성자 설정, 배열에 aa,aaa,a 순으로 넣어준다
        strings.add("aa");
        strings.add("aaa");
        strings.add("a");
        luckySort(strings, (s1, s2) -> s1.length() - s2.length()); //람다식으로 표현
        System.out.println(strings);
    }
    static void luckySort(ArrayList<String> strings, Comparator<String> c) { //조건식 만들어주기 !=not이다,isSorted가 거짓이면 참이다.
        while (!isSorted(strings, c)) {
            Collections.shuffle(strings);
        }
    }
    static boolean isSorted (ArrayList<String> strings, Comparator<String> c) {
        for (int i = 0; i < strings.size() - 1; i++) {
            if (c.compare(strings.get(i), strings.get(i + 1)) > 0) { // 오름차순으로 정렬하기
                return false;
            }
        }
        return true;
    }
}
