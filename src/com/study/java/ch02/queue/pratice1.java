package com.study.java.ch02.queue;

import java.util.*;

public class pratice1 { //queue 연습
int x,y;
    pratice1(int x, int y)
{
    this.x=x;
    this.y=y;

}




    public static void main(String[] args){
Queue<pratice1> Q = new LinkedList<>();
for(int i =0; i <5; i++)
    for(int j=0;j<5;j++)   // 이중 포문(가로세로 별만들어서 출력할때 생각...)
        Q.add(new pratice1(i,j));
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<5; j++)
            {
                pratice1 obj = Q.peek();
                Q.poll();
                assert obj != null;
                System.out.println(obj.x + " " +obj.y);
                System.out.println(Q.isEmpty());
            }
        }
    }





    }





