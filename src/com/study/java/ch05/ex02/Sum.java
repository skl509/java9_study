package com.study.java.ch05.ex02;

import com.study.java.ch05.ex01.Arraylist;// 문제 1번 호출
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Sum {
    public static void main(String[] args) {
        try {
            double sum = sumOfValues("error");//에러 발생 가능한 코드
            System.out.println(sum);
        } catch (FileNotFoundException err) {// 에러 발생시 수행 , 에러 발생의 변수 선언
            System.out.println(err);// 오류 출력
        }
    }
    public static double sumOfValues(String filename) throws FileNotFoundException {
        ArrayList<Double> values = Arraylist.readValues(filename); // 문제 1번에서 호출 람다식...
        double sum = 0;
        for (Double value : values) { //values 값 가지고 와서 value에 집어 넣기, for문 간편사용법...
            sum += value;
        }
        return sum;
    }
}

