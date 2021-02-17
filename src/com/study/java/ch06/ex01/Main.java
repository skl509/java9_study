package com.study.java.ch06.ex01;

import java.util.ArrayList;

public class Main {
    static class Stack<E> { // E 타입 요소로 구성된 배열리스트
        private final ArrayList<E> data;
        public Stack(int input) { // 매개변수 input
            this.data = new ArrayList<>(input); // 생성자 생성
        }
        public void push(E item) {
            this.data.add(item);
        } //푸쉬 매서드, 추가하는 기능
        public E pop() { // 삭제, 추출 메서드 (stack 개념에 자세히 나온다)
            if (this.data.isEmpty()) {
                throw new IllegalStateException("파일이 없습니다");// 예외던져주기
            }
            return this.data.remove(this.data.size() - 1); //제거해주는 기능
        }
        public boolean isEmpty() {
            return this.data.isEmpty();
        }
    }
}
