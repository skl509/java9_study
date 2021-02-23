package com.study.java.ch07.practice05;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackQueueDemo {
    public static void main(String[] args) {
        ArrayDeque<String> stack = new ArrayDeque<>();//스택 , 가장 나중에 들어온것 부터 출력되서 나감
        stack.push("Peter");
        stack.push("Paul");
        stack.push("Mary");
        while (!stack.isEmpty())
            System.out.println(stack.pop());

        System.out.println();//엔터기능
        
        Queue<String> queue = new ArrayDeque<>();//큐, 가장 먼저 들어온것 부터 출력되서 나감
        queue.add("Peter");
        queue.add("Paul");
        queue.add("Mary");
        while (!queue.isEmpty())//병행 프로그램 스레드 안전큐 10장에서 배움
            System.out.println(queue.remove());
        
    }
}
