package com.study.java.ch03.ex04;



// 인터페이스 도 스테틱함수는 예외로 논리를 넣을수 있다.
interface IntSequence { // 인터페이스에서는 함수만 만들어준다...
    boolean hasNext(); // 참거짓 가려주는 함수, 특정한 조건달아줄때 사용, false 나올때까지 이용가능하다 ex)배열의 위치 이동에 관해서
    int next(); // 배열위치를 이동 시킬때 이용
    static IntSequence of(int... list) { // of 메서드 만들어주기 ...list는 배열
        int n = 0; // n은 0부터 시작한다, 초기화
        for(int i=0; i<list.length; i++) { // 0부터 배열의 길이까지 계속 1씩 더해준다, 1칸씩 이동해간다.
            n += Math.pow(10, i) * list[i]; // n = n+Math.pow() * i(배열에 들어간 수)
        }
        return new DigitSequence(n); // 결과값은 DigitSequence 값으로 출력된다 배열이 아니라 int 값으로 나온다...
    }//맨처음 출력되는 숫자 951413(처음 3+ 10*1+100*4 ...이런식으로) 그다음 95141

}