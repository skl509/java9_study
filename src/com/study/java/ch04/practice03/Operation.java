package com.study.java.ch04.practice03;

public enum Operation {
    ADD("+") {
        public int eval(int arg1, int arg2) { return arg1 + arg2; } //덧셈
    },
    SUBTRACT("-") {
        public int eval(int arg1, int arg2) { return arg1 - arg2; } //뺄셈
    },
    MULTIPLY("*") {
        public int eval(int arg1, int arg2) { return arg1 * arg2; } // 곱
    },
    DIVIDE("/") {
        public int eval(int arg1, int arg2) { return arg1 / arg2; } // 나누기
    };

    private String symbol;
    Operation(String symbol) { this.symbol = symbol; }  //사칙연산 중 하나를 변수로 설정
    public String getSymbol() { return symbol; }
    
    public abstract int eval(int arg1, int arg2); // 열거에 정의된 메서드를 사용자 입력에 따라 이값 중 하나를 변수에 설정한후 eval 에 호출한 것.
}
