package com.study.java.ch08.practice04;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExtractingCombining {
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

    public static Stream<String> codePoints(String s) {
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
        Stream<Double> randoms = Stream.generate(Math::random).limit(5);//난수 5개가 든 스트림
        show("randoms", randoms);

        String contents = "   Hello, World!   ";
        Stream<String> words = Stream.of(contents.split("\\PL+")).skip(1);//split 메서드 동작방식때문에 skip 호출해 불필요한 요소 사라지게함
        show("words", words);
        

        Stream<String> combined = Stream.concat(codePoints("Hello"),
                codePoints("Cat\uD83D\uDE3B"));
        show("combined", combined);
    }
}
