package com.study.java.ch03.practice08; //함수를 반환하는 메서드,수정하는 메서드

import java.util.Arrays;
import java.util.Comparator;

public class HigherOrderDemo {
    public static Comparator<String> compareInDirecton(int direction) {
        return (x, y) -> direction * x.compareTo(y);
    } //함수반환
    
    public static Comparator<String> reverse(Comparator<String> comp) {
        return (x, y) -> -comp.compare(x, y);
    }// 함수수정
    
    public static void main(String[] args) {
        String[] words = { "Mary", "had", "a", "little", "lamb" };
        Arrays.sort(words, compareInDirecton(-1));
        System.out.println(Arrays.toString(words));
        Arrays.sort(words, reverse(String::compareToIgnoreCase));
        System.out.println(Arrays.toString(words));        
    }
}
