package com.study.java.ch05.practice03;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingDemo {
    public static void main(String[] args) { // 로그 핸들러 들...
        Logger.getGlobal().info("Starting program");
        Logger.getGlobal().setLevel(Level.OFF);//로깅레벨 조정
        Logger.getGlobal().info("Global logger turned off");
        Logger logger = Logger.getLogger("com.horstmann.corejava");
        logger.fine("Global logger turned off");
        logger.setLevel(Level.FINE); // 로그 핸들러 레벨 조정
        logger.fine("Set logger to fine");
        logger.setUseParentHandlers(false);
        Handler handler = new ConsoleHandler(); //생성자 생성
        handler.setLevel(Level.FINE);
        logger.addHandler(handler);
        logger.fine("Configured handler");
    }
}
