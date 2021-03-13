package com.study.java.ch09.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;


public class Main {
    public static void FileNioChannelFromCopy(String source, String dest) throws IOException {
        try (FileInputStream fis = new FileInputStream(source); //inputstream 생성
             FileOutputStream fos = new FileOutputStream(dest); //outputstream 생성
             FileChannel fic = fis.getChannel();
             FileChannel foc = fos.getChannel();) {
            foc.transferFrom(fic, 0, fic.size());//nio 클래스 파일채널 메서드 이용,
            // inputstream 모든 내용 outputstream 으로 복사
        }
    }
}
