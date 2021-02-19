package com.study.java.ch06.ex06; // 한 배열 리스트에 들어 있는 모든 요소를 다른 배열 리스트에 추가하는 제네릭 메서드...

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<>();
        listA.add(1);
        ArrayList<Integer> listB = new ArrayList<>();
        listB.add(2);
        Type1(listA, listB);
        System.out.println(listA);
        Type2(listA, listB);
        System.out.println(listB);
    }
    public static <E> void Type1(ArrayList<? extends E> source, ArrayList<E> dest) {//와일드카드 사용
        for (E e : source) {
            dest.add(e);
        }
    }
    public static <E> void Type2(ArrayList<E> source, ArrayList<? super E> dest) {
        for (E e : source) {
            dest.add(e);
        }
    }
}
