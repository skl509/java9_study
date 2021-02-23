package com.study.java.ch07.practice02;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> friends = new LinkedList<>(); //제네릭<> 생성자 만들기
        ListIterator<String> iter = friends.listIterator();
        //반복자 앞쪽에 요소추가, 방문한 요소를 다른값으로 설정하여 거꾸로 순회시키는 메서드
        iter.add("Fred"); // Fred |
        iter.add("Wilma"); // Fred Wilma |
        iter.previous(); // Fred | Wilma
        iter.set("Barney"); // Fred | Barney
        System.out.println(friends);
    }
}
