package com.study.java.ch08.ex06;

public class Main {
    public static void main(String[] args) {
        boolean isWord1 = Wordpredict("word");
        boolean isWord2 = Wordpredict("wosdfasdg"); //사전에 없는 단어도 참이라고 판단함
        boolean isWord3 = Wordpredict("word77");
        System.out.println(isWord1);
        System.out.println(isWord2);
        System.out.println(isWord3);
    }
    public static boolean Wordpredict(String str) {//문자열이 단어인지, 문자로만 구성되있는지 판단 하는 메서드
        return str.length() > 0 && str.codePoints().allMatch(Character::isAlphabetic);
        // str 크기가 0보다 크고 모든 단어 알파벳으로 문자열이 유효한지 확인하는 람다식
    }
}
