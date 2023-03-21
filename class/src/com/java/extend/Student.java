package com.java.extend;

public class Student extends People {

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void test(){}
}
