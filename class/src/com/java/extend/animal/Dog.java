package com.java.extend.animal;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String getName(){
        System.out.println("Dog getName...");
        return super.getName();
    }
}
