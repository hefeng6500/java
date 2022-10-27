package com.java.classtest;

public class Mouse extends USB {
    String name;

    public Mouse(String name) {
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

    public void click(){
        System.out.println(this.name + "点击了");
    }
}
