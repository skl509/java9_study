package com.study.java.ch03.ex04;

import com.study.java.ch03.practice01.DigitSequence;

interface IntSequence { // 인터페이스에서는 함수만 만들어준다...
    boolean hasNext();
    int next();
    static IntSequence of (int... list) { // of 메서드 만들어주기 ...list는 배열
        return new IntSequence() {
            private int n = 0;
            public boolean hasNext() { return n <= list.length; }
            public int next() { n++; // 자리차례대로 출력해주기 0 ,1 ,2 ,3 ,4 ,5, 순 n-1에 1씩 더해주면서
            return list[n-1]; // n-1 부터 n+4까지 차례대로 나온다. (0 ,1 ,2 ,3 ,4 ,5 위치순)
            }
        };
    }


}

