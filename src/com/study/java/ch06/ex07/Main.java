package com.study.java.ch06.ex07;

public class Main {
    public static void main(String[] args) { //8번 문제 출력
        Pair<Integer> pair = new Pair<>(3, 2);
        System.out.println(pair.min());
        System.out.println(pair.max());
    }
}
class Pair<E extends Comparable<E>> { //객체 정렬 메서드 comparable
    private final E first;
    private final E second;
    public Pair (E first, E second) {//요소 얻어오는 메서드
        this.first = first;
        this.second = second;
    }
    public E max() {
        if (first.compareTo(second) >= 0) { //compareTo 정렬에서 람다식으로 비교함, 현재 객체 > 파라미터로 넘어온 객체 , -> 양수리턴(최댓값 결정)
            return first;
        }
        return second;
    }
    public E min() {
        E max = max();
        if (max == first) { // 최댓값이미 결정 됏으면 최소 자동으로 나온다
            return second;
        }
        return first;
    }
}

