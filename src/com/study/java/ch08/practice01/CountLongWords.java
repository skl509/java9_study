package com.study.java.ch08.practice01;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;


public class CountLongWords {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("alice.txt")),
                StandardCharsets.UTF_8);// 파일을 문자열로 읽어 온다.
        List<String> words = Arrays.asList(contents.split("\\PL+"));
        // list.of 보단 Arrays.asList 이용, 둘 다 초기화 이후 변경 불가능한 list 만들기
        // 단어로 분리한다(비문자(글자가 아닌 문자)를 구분자로 사용한다.)

        long count = 0; // count 선언 후 0으로 초기화
        for (String w : words) { //향상된 for 문,
            if (w.length() > 12) //w 길이 12보다 크면 몸통 실행(참일경우) 아니면 몸통 빠져나온다(거짓일 경우)
                count++; //count 하나씩 증가
        }
        System.out.println(count);

        count = words.stream().filter(w -> w.length() > 12).count();
        // 스트림 이용시 필터링과 카운팅확인하려고 루프 안살펴 봐도됨
        System.out.println(count);

        count = words.parallelStream().filter(w -> w.length() > 12).count();
        System.out.println(count);//parallelStream은 필터링과 카운팅을 병렬로 수행함
    }
}
