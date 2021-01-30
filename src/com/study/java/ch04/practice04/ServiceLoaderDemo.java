package com.study.java.ch04.practice04;

import java.io.UnsupportedEncodingException;;
import java.util.ServiceLoader;

public class ServiceLoaderDemo {
    public static ServiceLoader<Cipher> cipherLoader = ServiceLoader.load(Cipher.class);

    public static void main(String[] args) throws UnsupportedEncodingException {
        int strength = args.length == 0 ? 1 : Integer.parseInt(args[0]);
        Cipher cipher = getCipher(strength);
        String message = "Meet me at the toga party.";
        byte[] bytes = cipher.encrypt(message.getBytes(), 
                new byte[] { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9, 3 });
        String encrypted = new String(bytes, "UTF-8");
        System.out.println(encrypted);
    }
    
    public static Cipher getCipher(int minStrength) {
        for (Cipher cipher : cipherLoader) // 암시적으로 cipherLoader의 iterator를 호출한다.
            if (cipher.strength() >= minStrength) return cipher;
        return null;
    }
    

}
