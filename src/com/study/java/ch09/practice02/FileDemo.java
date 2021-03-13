package com.study.java.ch09.practice02;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        Path tempPath = Files.createTempDirectory("corejava");

        Path workDir = Files.createDirectory(tempPath.resolve("work"));//파일 디렉터리 생성,
        // 경로의 부모를 기준으로 경로를 해석해서 이웃 경로로 돌려준다
        System.out.println(workDir);
        Path tempFile = Files.createTempFile(workDir, "test", ".txt");
        System.out.println(tempFile);
        Files.write(tempFile, "Hello".getBytes(StandardCharsets.UTF_8));
        Files.copy(tempFile, workDir.resolve("hello.txt"));//파일을 다른 위치로 복사한다

        Path target2 = workDir.resolve("hello2.txt");
        Files.move(tempFile, target2, StandardCopyOption.ATOMIC_MOVE);//파일을 이동한다(원본 복사한 후 삭제)
        boolean deleted = Files.deleteIfExists(target2);
        if (deleted) System.out.println("Deleted " + target2);
    }
}
