package com.study.java.ch03.practice04; // 람다표현식


import java.util.ArrayList;
import java.util.Arrays;

public class LambdaDemo {
    public static void main(String[] args) {
        String[] friends = { "Peter", "Paul", "Mary" };
        Arrays.sort(friends,
                (first, second) -> first.length() - second.length()); //둘다 문자열(string 타입)
        System.out.println(Arrays.toString(friends));
        ArrayList<String> enemies = new ArrayList<>(Arrays.asList("Malfoy", "Crabbe", "Goyle", null));
        enemies.removeIf(e -> e == null);
        System.out.println(enemies);        
    }
}
