package com.java.classtest;

public class Computer {
    public Computer(){

    }

    public void installUSB(USB u){
        u.connect();

        if(u instanceof Mouse){
            Mouse m = (Mouse) u;
            m.click();
        } else if(u instanceof Keyboard) {
            Keyboard k = (Keyboard) u;
            k.keyDown();
        }

        u.unconnect();
    }
}
