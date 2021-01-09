package com.study.java.ch01.ex13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("6개 번호를 입력 해 주십시오");
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for ( int i = 1 ; i <=49; i++){
            list.add(i);
        }
        System.out.println(" 로또 번호 확인 : " + list.toString());
        System.out.println("섞기 전 : " + list.toString());
        Collections.shuffle(list);
        System.out.println("섞은 후 : " + list.toString());
        for(int i = 0; i < 6 ; i++){
            System.out.println((i+1)+"번째 번호는" + list.get(i) + "입니다");
        }
    }
}
