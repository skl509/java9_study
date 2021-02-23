package com.study.java.ch07.practice03;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;//정령된 순서로 집합을 순회시키기 위해서

public class SetDemo {
    public static void main(String[] args) {
        Set<String> badWords = new HashSet<>();//제네릭 만들어주기
        badWords.add("sex"); //추가 메서드
        badWords.add("drugs");
        badWords.add("c++");
        
        Scanner in = new Scanner(System.in);
        System.out.print("Please choose a user name: ");
        String username = in.next();        
        if (badWords.contains(username.toLowerCase()))
            System.out.println("Please choose a different user name");
        else
            System.out.println("Registered " + username + " since it wasn't one of " + badWords);
        
        TreeSet<String> countries = new TreeSet<>((u, v) ->//제네릭 키와 값 만들어주기
            u.equals(v) ? 0  // 자바 삼항연산자 거듭해서 사용됨
            : u.equals("USA") ? -1
            : v.equals("USA") ? 1
            : u.compareTo(v));// comparable 인터페이스 구현,TreeSet 사용하는 집합의 요소타입이라서
        //USA 가 항상 앞에온다
        countries.add("Bahrain");
        countries.add("Australia");
        countries.add("USA");
        countries.add("Canada");
        System.out.println(countries);
    }
}
