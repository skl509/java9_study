package com.study.java.ch08.ex16;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(find500Primesnumbers()));
    }
    public static BigInteger[] find500Primesnumbers() { //소수 찾는 매서드 배열, 크니까 biginteger로 만들기
        BigInteger a = BigInteger.valueOf((long) Math.pow(10, 50));//조건의 소수 구할려면 10의 50승필요, 지정된 값 변환해서 반환 long 형으로
        return Stream
                .iterate(a, pre -> pre.add(BigInteger.ONE)) //요소 가져오기
                .filter(b -> b.isProbablePrime(10))//10진법 숫자로 뽑아오기
                .limit(500) //스트림 500으로 제한
                .toArray(BigInteger[]::new); //배열로 나열해주기
    }
}
