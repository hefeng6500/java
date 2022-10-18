package com.java.integer;

public class Integer_01 {
    public static void main(String[] args) {
        byte a1 = 127;
        byte b1 = 127;
        byte c1 = (byte) (a1 + b1);
        int c12 = a1 + b1;
        System.out.println(c1); // -2
        System.out.println(c12); // 254


        short a3 = 32767;
        short b3 = 32767;
        short c3 = (short) (a3 + b3);
        int c31 = (a3 + b3);
        System.out.println(c3); // -2
        System.out.println(c31); // 65534

        int a4 = 2147483647;
        int b4 = 2147483647;
        int c4 = a4 + b4;
        System.out.println(c4); // -2

        int a5  = 2147483647;
        int b5 = 2147483647;
        long c5 = (long) a5 + b5;
        System.out.println(c5); // 4294967294
    }
}
