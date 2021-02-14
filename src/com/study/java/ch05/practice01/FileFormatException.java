package com.study.java.ch05.practice01;

import java.io.IOException;

public class FileFormatException extends IOException {
    public FileFormatException() {}
    public FileFormatException(String message) {
        super(message);
    }
}
