package com.study.java.ch09.practice04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindingOneOrAllMatches {
    public static void main(String[] args) {
        String regex = "[+-]?\\d+";
        CharSequence input = "-123";
        if (Pattern.matches(regex, input)) //정적 메서드 matches 사용
            System.out.println(input + " is an integer");
        
        
        Pattern pattern = Pattern.compile(regex); //입력에 사용할 matches 생성
        input = "Fred";
        Matcher matcher = pattern.matcher(input);
        if (!matcher.matches())  
            System.out.println(input + " is not an integer");
        
        Stream<String> strings = Stream.of("99 bottles of beer on the wall, 99 bottles of beer.".split(" "));
        Stream<String> result = strings.filter(pattern.asPredicate()); //결과 정규표현식과 일치하는 문자열을 모두 포함한다.
        System.out.println(result.collect(Collectors.toList()));
        
        input = "June 14, 1903";
        matcher = pattern.matcher(input);
        while (matcher.find()) {
            String match = matcher.group();            
            System.out.println(match);        
        }
    }
}
