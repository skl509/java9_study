package com.study.java.ch03.ex04.solution;

public class Main {
    public static void main(String[] args) {
        IntSequence intSequence1 = IntSequence.forwardOf(3, 1, 4, 1, 5, 9);
        System.out.print("forwardOf : ");
        while (intSequence1.hasNext())
            System.out.print(intSequence1.next() + " ");
        System.out.println();
        System.out.print("backwardOf : ");
        IntSequence intSequence2 = IntSequence.backwardOf(3, 1, 4, 1, 5, 9);
        while (intSequence2.hasNext())
            System.out.print(intSequence2.next() + " ");
    }
}
