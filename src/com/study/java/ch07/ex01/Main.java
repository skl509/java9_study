package com.study.java.ch07.ex01;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Integer[] primes = Primes(15);
        System.out.println(Arrays.toString(primes));
        Integer[] primes2 = PrimesBitSet(15);
        System.out.println(Arrays.toString(primes2));
    }
    public static Integer[] Primes(int n) {//방법1
        Set<Integer> set = new HashSet<>(n - 1);
        for (int i = 2; i <= n; i++) { //2부터 n-1 까지 매개변수(파라미터)설정, 단 n은 2 와 같거나 2보다 크다
            set.add(i);
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { //n의 제곱근까지 중복해서 넣어주기
            if (set.contains(i)) { //set 내부에 i가 있으면 중복된 것 차례대로 빼주기
                int factor = 1;
                while (i * factor <= n) { //s^2 , s(s+1) ... 차례대로 제거
                    set.remove(i * factor);
                    factor++;
                }
            }
        }
        return set.toArray(new Integer[0]); //set 인자의 크기로 배열이 만들어진다, 단 integer의 크기보다 작으면 integer 크기로 만들어짐
    }
    public static Integer[] PrimesBitSet(int n) { //방법2 , 구글링으로 방법찾음
        BitSet set = new BitSet(n + 1);
        set.set(2, n + 1); //2부터 n+1 까지 내부에 있는 값 설정 모음
        for (int i = 2; i <= Math.sqrt(n); i++) {// 제곱근 까지 중복해서 설정
            if (set.get(i)) {
                int factor = 1;
                while (i * factor <= n) {
                    set.set(i * factor, false); // i*factor 거짓값으로 설정 모음
                    factor++; //s^2 , s(s+1) ... 차례대로 제거
                }
            }
        }
        Integer[] primes = new Integer[set.cardinality()]; //중복수치에 관해서 생성자 생성
        Integer size = set.nextSetBit(0);// 배열크기0으로 맞춰주기
        for (int i = 0; i < primes.length; i++) {
            primes[i] = size;
            size = set.nextSetBit(size + 1);// setbit의 배열 크기가 primes 보다크면 setbit배열 크기로 출력된다.
        }
        return primes; //최종 소수 출력
    }
}


