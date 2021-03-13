package com.study.java.ch09.practice01;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// http://en.wikipedia.org/wiki/BMP_file_format 참고

public class BinaryIO {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("chart.bmp");//경로 정의하기
        try (InputStream inStream = Files.newInputStream(path)) {   //파일에서 스트림 얻기
            DataInput in = new DataInputStream(inStream);
            byte[] header = new byte[2];
            in.readFully(header);
            int size = swap(in.readInt());
            in.readInt();
            in.readInt();
            int headerSize = swap(in.readInt()); // 숫자, 문자, 불값, 문자열을 바이너리 형식으로 쓰는 메서드
            int width = swap(in.readInt());
            int height = swap(in.readInt());
            short planes = swap(in.readShort());
            short depth = swap(in.readShort());
            int compressionMode = swap(in.readInt());;
            System.out.println("Header: " + new String(header, StandardCharsets.US_ASCII));
            System.out.println("Size: " + size);
            System.out.println("Header size : " + headerSize);
            System.out.println("Width : " + width);
            System.out.println("Height : " + height);
            System.out.println("Planes : " + planes);
            System.out.println("Depth : " + depth);
            System.out.println("Compression mode : " + compressionMode);
        }
    }
    
    public static int swap(int n) {
        return (n & 0xFF000000) >> 24 | (n & 0xFF0000) >> 8 | (n & 0xFF00) << 8 | (n & 0xFF) << 24; 
    }

    public static short swap(short n) {
        return (short) ((n & 0xFF00) >> 8 | (n & 0xFF) << 8); 
    }

}
