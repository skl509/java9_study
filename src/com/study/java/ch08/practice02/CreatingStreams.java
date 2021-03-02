package com.study.java.ch08.practice02;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreatingStreams {
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

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("alice.txt");
        String contents = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);

        Stream<String> words = Stream.of(contents.split("\\PL+"));
        //split은 String[] 배열을 반환한다.
        show("words", words);
        Stream<String> song = Stream.of("gently", "down", "the", "stream");
        //of 메서드는 가변 인수 매개변수를 받으므로 인수가 몇개든 스트림을 생성 한다.
        show("song", song);
        Stream<String> silence = Stream.empty();// 요소가 없는 스트림 만든다
        show("silence", silence);

        Stream<String> echos = Stream.generate(() -> "Echo");//인수 없는 함수 받음
        show("echos", echos);

        Stream<Double> randoms = Stream.generate(Math::random);// 난수 스트림 만들기
        show("randoms", randoms);

        Stream<BigInteger> integers = Stream.iterate(BigInteger.ONE, n -> n.add(BigInteger.ONE));
        show("integers", integers);// 수열만들때 interate 메서드 이용

        BigInteger limit = new BigInteger("10000000");
        show("integers", integers);
        
        Stream<String> wordsAnotherWay = Pattern.compile("\\PL+").splitAsStream(contents);
        show("wordsAnotherWay", wordsAnotherWay);

        try (Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8)) {
            show("lines", lines);
        }
    }
}
