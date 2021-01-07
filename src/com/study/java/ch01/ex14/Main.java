package com.study.java.ch01.ex14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [][] square = new int [4][];
        for(int i = 0 ; i<4 ; i++) {
            square[i][0] = n;
            square[i][1] = n;
            square[i][2] = n;
            square[i][3] = n;
            for (int j = 0; j < 4; j++) {
                square[0][j] = n;
                square[1][j] = n;
                square[2][j] = n;
                square[3][j] = n;
                if (square[i][0] + square[i][1] + square[i][2] + square[i][3]
                        == square[j][0] + square[j][1] + square[j][2] + square[j][3] &&
                        square[0][0] + square[1][1] + square[2][2] + square[3][3] ==
                        square[0][3] + square[1][2] + square[2][1] + square[3][0])
                    System.out.println("매직스퀘어 입니다");

                else
                    System.out.println("매직스퀘어가 아닙니다");
            }
        }
        System.out.println();
    }
}
