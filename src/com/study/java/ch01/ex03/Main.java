package com.study.java.ch01.ex03;

public class Main {

    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    int MAX;
    if (a>b && a>=c) {
        MAX = a;
    }else if (b>=a && b >= c){
    MAX = b;
    }
        else{
        MAX=c;

}
    System.out.println(Math.max(Math.max(a,b),c));

    }
}