package com.java.data_conversion;

public class DataConversion {
    public static void main(String[] args) {
        System.out.println('a');
        System.out.println('a'+1);
        System.out.println('A'+0);
        System.out.println('0'+0);
        System.out.println("-----------");


        System.out.println('a'+'b');
        System.out.println("a"+"b");

        System.out.println("hello"+'a'+1); //左边字符串，往后拼的都是字符串
        System.out.println('a'+1+"hello");
        System.out.println("5+5="+5+5);
        System.out.println(5+5+"=5+5");
    }
}
