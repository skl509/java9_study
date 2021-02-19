package com.study.java.ch06.ex03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    }
    class Table<K, V> {
        private ArrayList<Entry<K, V>> table = new ArrayList<>(); //생성자 만들기,Entry요소로 구성된 배열리스트 관리 메서드
        public void put(K key, V value) { // 입력기능 메서드
            for (Entry<K, V> entry : table) {
                if (entry.key == key) {
                    entry.value = value;
                    return;
                }
            }
            table.add(new Entry<>(key, value));
        }
        public V get(K key) { //연관된 값 얻어오는 메서드
            for (Entry<K, V> entry : table) {
                if (entry.key == key) {
                    return entry.value;
                }
            }
            return null; //지정키에 해당하는 데이터를 반환(중복제외)
        }
        public void remove(K key) { // 삭제하는 메서드
            for (Entry<K, V> entry : table) {
                if (entry.key == key) {
                    table.remove(entry);
                    return;
                }
            }
        }
    }
    class Entry<K, V> {
        K key;
        V value;
        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
