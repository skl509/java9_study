package com.study.java.ch06.ex09;


import java.util.ArrayList;
import java.util.Collections;

public class Main {
    //6.7 번 문제의 Pair<E> 클래스 구현
    static class Pair<E extends Comparable<E>> {
        private E first, second;
        public void setFirst(E first) { //Pair의 파라미터 1(요소 얻어오는 메서드) , 9번 람다식 이용 할때 사용할려고 set으로 만듬
            this.first = first;
        }
        public void setSecond(E second) {//Pair의 파라미터 2(요소 얻어오는 메서드)
            this.second = second;
        }
        // 6.8번의 최대 최소 이용 , 타입경계 지정
        public E max() {
            return this.first.compareTo(this.second) >= 0 ? this.first : this.second;
        }//compareTo 정렬에서 람다식으로 비교함, 현재 객체 > 파라미터로 넘어온 객체 , -> 양수리턴(최댓값 결정), 3항 연산자
        public E min() {
            return this.first.compareTo(this.second) < 0 ? this.first : this.second;
        }
    }
    // 6.9 번, a의 첫 번째와 마지막 요소로 구성된 쌍을 반환
    static class Arrays {
        public static <E extends Comparable<E>> Pair<E> FirstLast(ArrayList<? extends E> a) {
            Pair p = new Pair<E>(); //배열 생성자 만들어주기
            p.setFirst(a.get(0)); //배열 첫번째 람다식으로 출력 (0번째부터 출력됨으로)
            p.setSecond(a.get(a.size() - 1)); //배열 마지막 람다식으로 출력 ,ArrayList가 컬렉션프레임워크 타입이라 배열길이는 size로 써준다.
            return p;
        }
        // 6.10번
        public static <E extends Comparable<E>> E min(ArrayList<E> a) {
            return Collections.min(a);
        }//최솟값 돌려주기
        public static <E extends Comparable<E>> E max(ArrayList<E> a) {
            return Collections.max(a);
        }// 최댓값 돌려주기
        // 6.11번
        public static <E extends Comparable<E>> Pair<E> MinMax(ArrayList<E> a) {//최댓값 최솟값 쌍으로 돌려주는 메서드
            Pair p = new Pair<E>();
            p.setFirst(min(a));
            p.setSecond(max(a));
            return p;
        }
    }
}

