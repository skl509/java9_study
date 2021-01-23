package com.study.java.ch03.practice03;

import java.util.Arrays;
import java.util.Comparator;

public class SortDemo {
    public static void main(String[] args) {
        String[] friends = { "Peter", "Paul", "Mary" };
        Arrays.sort(friends); //
        System.out.println(Arrays.toString(friends));
        
        friends = new String[] { "Peter", "Paul", "Mary" };
        Arrays.sort(friends, new LengthComparator());// 배열을 정렬하려면 lengthComparator 객체를 Arrays.sort 메서드에 전달...
        System.out.println(Arrays.toString(friends));
    }
}

class LengthComparator implements Comparator<String> {
    public int compare(String first, String second) {
        return first.length() - second.length();
    }//람다 표현식의 바디에서
    //표현식 하나로는 표현 할 수 없는 계산을 수행한다면 {}감싸고 명시적인 return문을 사용...
}
