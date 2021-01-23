package com.study.java.ch03.ex10;



public class Run {
    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println("r1");
        Runnable r2 = () -> System.out.println("r2");
        runTogether(r1, r2); // 따로 System.out.println 해줄 필요없다.
        runInOrder(r1, r2);
    }
    public static void runTogether(Runnable... tasks) { //각 태스크르 별도의 스레드에서 실행한 후 반환
        for (Runnable task : tasks) { //tasks 에서 차례대로 객체를 꺼낸뒤 Runnable에 넣는다...
            new Thread(task).start(); //start()메소드는 새로운 쓰레드가 작업을 실행하는데 필요한 호출스택(공간)을 생성한 다음 run()을 호출해서 그 안(스택)에 run()이 저장되는 것이다.
        }
    }
    public static void runInOrder(Runnable... tasks) {// 모든태스크를 현재 스레드에서 실행하고 마지막 태스크가 완료될 때 반환.
        for (Runnable task : tasks) { //tasks 에서 차례대로 객체를 꺼낸뒤 Runnable에 넣는다...
            task.run();
        }
    }
}
