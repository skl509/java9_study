package com.study.java.ch05.ex01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) { // 출력부분
        try {
            System.out.println(readValues("error")); //에러 발생 가능한 코드
        } catch (FileNotFoundException err) {// 에러 발생시 수행 , 에러 발생의 변수 선언
            System.out.println(err); // 오류 출력
        }
    }
    public static ArrayList<Double> readValues(String filename) throws FileNotFoundException { // 파일을 열 수 없는 경우
        ArrayList<Double> lines = new ArrayList<>(); // 배열 더블 타입의 생성자 호출
        try (Scanner in = new Scanner(new File(filename))) { // 입력받을수 있도록 스캔 생성자 호출
            while (in.hasNextDouble()) {//문자열등 잘못 입력할 수도 있어서 잘못된 입력값 버리는 것 line에 추가해주기 , 부동 소수점이 아닌 것
                lines.add(in.nextDouble());
            }
        }
        return lines; //제대로 마지막 출력
    }
}
