package com.java.classtest;

public class Keyboard extends USB {
    String name;

    public Keyboard(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(this.name + "接入设备");
    }

    @Override
    public void unconnect() {
        System.out.println(this.name + "拔出设备");
    }


    public void keyDown(){
        System.out.println(this.name + "按下了按键");
    }
}
