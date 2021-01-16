package com.study.java.ch03.ex04;

interface IntSequence {
    static IntSequence of(int... list) {
        // api 에서 찾아냄
        return new IntSequence() { // 생성자 만들기, 메인에서 만들었는데 의미가 없다.
            private int n = 0;

            @Override
            public boolean hasNext() {
                return n < list.length;
            }  // 리스트에서 정수 몇개 까지 입력하는지...

            @Override
            public int next() {
                return hasNext() ? list[n++] : 0;
            }// 삼항연산자, 조건식 ? 피연산자1 : 피연산자2 ,순차적으로 비교해서 hasNext()값 나오게 해준다.
        };
    }

    boolean hasNext(); // 참,거짓 가리기 위해서 boolean

    int next();


}