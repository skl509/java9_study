package com.study.java.ch05.ex05;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
    }
    public static void print(String a, String b) {
        Scanner in = null; //scanner 생성자 예외던지기
        PrintWriter out = null;//printwriter 생성자 예외던지기
        try {
            in = new Scanner(Paths.get(a));//리소스 지정1
            out = new PrintWriter(b);// 리소스 지정2
            while (in.hasNext()) {//hasnext 거짓 호출하면 종료
                out.println(in.next());
            }
        } catch (IOException file) {//에러발생 변수선언
            System.out.println(file);
        } finally {
            if (in != null) { //in 값이 값이 없으면 거짓 호출...
                in.close();//예외던지기
            }
            if (out != null) {//out 값이 값이 없으면 거짓 호출...
                out.close();//예외던지기
            }
        }
    }
}

