package com.study.java.ch06.ex22;

import java.util.concurrent.Callable;
import java.util.function.Function;

public class Main { // 절대 사용되지 않을 예외 객체를 전달 안해도 된다, 그대신 예외 클래스의 생성자 참조를 받게한다.
    public static void main(String[] args) {
    }
    public static <V, T extends Throwable> V doWork(Callable<V> c, Function<Throwable, T> constructor) throws T {
        try {
            return c.call(); //에러 가능성 있는 기능
        } catch (Throwable Ex) { //예외 처리 코드(예외발생시 기능한다) , throws 와 연결되어있다...
            throw constructor.apply(Ex); //예외 발생 클래스 생성자 참조, 일부러 예외 발생시켜주기 ,Ex 겹쳐서 예외 전달 안함
        }
    }
}

