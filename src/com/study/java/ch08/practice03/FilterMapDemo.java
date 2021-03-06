package com.study.java.ch08.practice03;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterMapDemo {
    public static <T> void show(String title, Stream<T> stream) {
        final int SIZE = 10;
        List<T> firstElements = stream.limit(SIZE + 1).collect(Collectors.toList());
        System.out.print(title + ": ");
        if (firstElements.size() <= SIZE)
            System.out.println(firstElements);
        else {
            firstElements.remove(SIZE);
            String out = firstElements.toString();
            System.out.println(out.substring(0, out.length() - 1) + ", ...]");
        }
    }

    public static Stream<String> codePoints(String s) {// 문자열을 문자열 스트림으로 바꾸는 메서드
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int j = s.offsetByCodePoints(i, 1);
            result.add(s.substring(i, j));
            i = j;
        }
        return result.stream();
    }

    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("alice.txt")),
                StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(contents.split("\\PL+")); //list.of 보단 Arrays.asList이용 기능 똑같다
        Stream<String> longWords = words.stream().filter(w -> w.length() > 12);
        show("longWords", longWords);

        Stream<String> lowercaseWords = words.stream().map(String::toLowerCase);//// 문자열 스트림펼치기
        show("lowercaseWords", lowercaseWords);

        String[] song = { "row", "row", "row", "your", "boat", "gently", "down",
                "the", "stream" };
        Stream<String> firstChars = Stream.of(song).filter(w -> w.length() > 0).map(s -> s.substring(0, 1));
        show("firstChars", firstChars);// 스트림펼치기

        Stream<String> letters = Stream.of(song).flatMap(w -> codePoints(w));
        show("letters", letters);
    }
}
