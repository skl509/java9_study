package com.study.java.ch07.ex11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(shuffle("this is a apple"));
    }
    public static String shuffle(String sentence) {
        List<String> list = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        //split 기능 공백 기준으로 문자열 나눠서 저장후 호출
        List<String> sublist = list.subList(1, list.size() - 1); //배열 위치 처음 끝 빼고 나머지 호출
        Collections.shuffle(sublist); // 호출된 부분 셔플
        return String.join(" ", list);
        // join 메서드, list 를 일단 정지 sublist 계산 끝날때 까지 그리고 그 다음 list 계산 시작
        // 먼저 sublist에서 2 3 번째 배열 위치 호출(이미 list 생성자로 만들어져서 띄어 쓰기 기준으로 배열 만들어짐)
        // 그다음 list에서 전체문장 호출
        // 만약 순서가 바뀌면 2 단어 밖에 호출이 안된다.
    }
}
