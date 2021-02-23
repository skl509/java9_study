package com.study.java.ch07.practice02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("Peter");
        coll.add("Paul");
        coll.add("Mary");
        Iterator<String> iter = coll.iterator(); //모든 요소 방문하는데 사용할 반복자 사용(literator)
        while (iter.hasNext()) { //hasNext 거짓나올때까지 while문 돌려주기
            String element = iter.next();
            process(element);
        }
        
        iter = coll.iterator();
        while (iter.hasNext()) {
            String element = iter.next();
            if (element.startsWith("M"))
                iter.remove(); //제거 메서드 remove
        } 
        
        coll.removeIf(e -> e.endsWith("r"));
        
        for (String element : coll) //향상된 for 루프이용
            process(element);
    }
    
    public static void process(String s) { System.out.println("Processing " + s); }
}
