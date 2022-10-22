package com.java.operator;

public class Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 10;

        a = b++;
        c = --a;
        b = ++a;
        a = c--;

//        b = 11;
//        a = 10;
//
//        a = 9;
//        c = 9;
//
//        a = 10;
//        b = 10;
//        c = 8;
//        a = 9;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        /*
		int a = 10;
		int b = 10;
		int c = 10;
		a = b++;//a=10,b=11,c=10
		c = --a;//a=9,b=11,c=9
		b = ++a;//a=10,b=10,c=9
		a = c--;//a=9,b=10,c=8
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("--------------");
		*/

		/*
		int a = 4;
		int b = (a++)+(++a)+(a*10);
			  //= 4 + 6 + 60
			  //= 70
		System.out.println(a);
		System.out.println(b);
		*/

        //int i = 1;
        //System.out.println(i+++i+++i+++i++);
        //i++ + i++ + i++ + i++
        //1	+ 2	  + 3	+ 4

        int i = 1;
        System.out.println(i++ + ++i + i++ + ++i);//1+3+3+5
        //i++ + ++i + i++ + ++i
        //1 + 3 + 3 + 5
    }
}
