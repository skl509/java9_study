package com.study.java.ch07.ex05;

import java.util.*;


public class Main {
    public static void main(String[] args) { //배열 위치에서 서로 자리 바꾸는 메서드 출력...
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));
        swap(list, 4, 0);
        System.out.println(list);
    }
    public static <E> void swap(List<E> list, int i, int j) { //서로 바꿔주는 메서드
        if (list instanceof RandomAccess) {//객체가 무엇으로 이루어져 있는지 판단하는 instanceof 연산자
            E temp = list.get(i);//배열에서 i 값 참조
            list.set(i, list.get(j)); //i위치에서 list.get(j)값으로 바꿔준다
            list.set(j, temp); //j위치에서 list.get(i)값으로 바꿔준다
        }
        else {
            if (i > j) { //i가 큰수로 순서 바뀌어도 똑같이 기능 하게 만들어 준다
                int temp = i;
                i = j;
                j = temp;
            }
        }
    }
}
