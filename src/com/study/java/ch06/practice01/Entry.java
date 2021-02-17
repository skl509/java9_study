package com.study.java.ch06.practice01;

public class Entry<K, V> {
    private K key;
    private V value;
    
    public Entry(K key, V value) { //타입 매개변수 K, V
        this.key = key;
        this.value = value;
    }
    
    public K getKey() { return key; }
    public V getValue() { return value; }
}
