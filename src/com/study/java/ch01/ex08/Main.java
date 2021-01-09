package com.study.java.ch01.ex08;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("문자를 입력 해 주십시오");
        Scanner scan = new Scanner(System.in);
        String str = new String();
        String str1 = scan.nextLine();
        str1 = str1.replaceAll(" ", "");
        System.out.println(str1);
    }
}
