package com.study.java.ch01.ex14.solution;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int[][] square = new int[4][4];
        inputSquare(square);
        printSquare(square);
        boolean check1 = checkMagicSquareSimple(square);
        System.out.println("magic square is " + check1);
        boolean check2 = checkMagicSquareSolution(square);
        System.out.println("magic square is " + check2);
    }

    static void inputSquare(int[][] square) {
        Scanner in = new Scanner(System.in);
        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                square[i][j] = in.nextInt();
            }
        }
    }

    static void printSquare(int [][] square) {
        for(int i=0; i<4; i++) {
            System.out.println(square[i][0] + " " + square[i][1] + " " + square[i][2] + " " + square[i][3]);
        }
    }

    static boolean checkMagicSquareSimple(int[][] square) {
        int rowSum0 = square[0][0] + square[0][1] + square[0][2] + square[0][3];
        int rowSum1 = square[1][0] + square[1][1] + square[1][2] + square[1][3];
        int rowSum2 = square[2][0] + square[2][1] + square[2][2] + square[2][3];
        int rowSum3 = square[3][0] + square[3][1] + square[3][2] + square[3][3];
        int colSum0 = square[0][0] + square[1][0] + square[2][0] + square[3][0];
        int colSum1 = square[0][1] + square[1][1] + square[2][1] + square[3][1];
        int colSum2 = square[0][2] + square[1][2] + square[2][2] + square[3][2];
        int colSum3 = square[0][3] + square[1][3] + square[2][3] + square[3][3];
        int crossSum1 = square[0][0] + square[1][1] + square[2][2] + square[3][3];
        int crossSum2 = square[0][3] + square[1][2] + square[2][1] + square[3][0];

        if(rowSum0 != rowSum1)
            return false;
        if(rowSum1 != rowSum2)
            return false;
        if(rowSum2 != rowSum3)
            return false;
        if(rowSum3 != colSum0)
            return false;
        if(colSum0 != colSum1)
            return false;
        if(colSum1 != colSum2)
            return false;
        if(colSum2 != colSum3)
            return false;
        if(colSum3 != crossSum1)
            return false;
        if(crossSum1 != crossSum2)
            return false;

        return true;
    }

    static boolean checkMagicSquareSolution(int[][] square) {
        int sum = 0;
        // 기준값 설정
        for(int i=0; i<square.length; i++) {
            sum = sum + square[0][i];
        }
        // row, column 합 체크
        for(int i=0; i<square.length; i++) {
            // row 합 체크
            if (sum != getSumRow(square, i))
                return false;
            // column 합 체크
            if (sum != getSumCol(square, i))
                return false;
        }
        if(sum != getSumCross1(square))
            return false;
        if(sum != getSumCross2(square))
            return false;

        return true;
    }

    static int getSumRow(int[][] square, int r) {
        int sum = 0;
        for(int i=0; i<square.length; i++) {
            sum += square[r][i];
        }
        return sum;
    }

    static int getSumCol(int[][] square, int c) {
        int sum = 0;
        for(int i=0; i<square.length; i++) {
            sum += square[i][c];
        }
        return sum;
    }

    static int getSumCross1(int[][] square) {
        int sum = 0;
        for(int i=0; i<square.length; i++) {
            sum += square[i][i];
        }
        return sum;
    }

    static int getSumCross2(int[][] square) {
        int sum = 0;
        for(int i=0; i<square.length; i++) {
            sum += square[i][square.length-i-1];
        }
        return sum;
    }

}
