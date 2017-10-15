package com.sample;

public class Keyboard {
    private boolean numLock = true;
    static boolean capLock = false;
    public static void main(String... shortcuts) {
        System.out.print(numLock+" "+capLock);
    }
}
