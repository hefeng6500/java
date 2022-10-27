package com.java.classtest;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();

        USB u1 = new Mouse("罗技");

        USB u2 = new Keyboard("双飞燕");

        computer.installUSB(u1);
        computer.installUSB(u2);
    }
}
