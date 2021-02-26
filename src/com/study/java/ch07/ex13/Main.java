package com.study.java.ch07.ex13;

import java.util.LinkedHashMap; // 입력된 순서대로 k 값 보장
import java.util.Map;

public class Main {
    public static void main(String[] args) {
    }
    public static class Cache<K, V> extends LinkedHashMap<K, V> {//맵의 크기를 생성자에 지정한 크기로 제한한다.
        private final int capacity; //불변, 내가 정하는 값 , 기본생성자
        public Cache(int capacity) {
            super(); //부모 클래스(LinkedHashMap)의 생성자를 호출 , 상속받았으니까
            this.capacity = capacity;
        }
        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            return size() > capacity;
        }
        //가장 마지막에 들어온 값 삭제 , 지정한 사이즈 보다 배열의 크기가 커지면 삭제 시킨다
    }
}

