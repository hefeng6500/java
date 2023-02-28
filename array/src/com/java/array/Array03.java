package com.java.array;

import java.util.Random;
import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        Random random = new Random();

//        int target = (int)random.nextInt(100) + 1; // 1 - 100 之间

//        Math.random()是令系统随机选取大于等于 0.0 且小于 1.0 的伪随机 double 值
        int target = (int)(Math.random() * 100) + 1;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("请输入一个数字");
            int i = scanner.nextInt();

            if(i > target) {
                System.out.println("大了");
            }
            if(i < target) {
                System.out.println("小了");
            }
            if(i == target) {
                System.out.println("恭喜你输入正确！");
                break;
            }
        }


        scanner.close();
    }
}
