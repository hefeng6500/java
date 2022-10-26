package com.java.extend;

public class ExtendDemo {
    public static void main(String[] args) {
        Student student = new Student("jack", 19);

        student.walk();
        System.out.println(student.name);
    }
}
