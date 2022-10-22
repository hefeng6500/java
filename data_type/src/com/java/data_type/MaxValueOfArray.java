package com.java.data_type;

import java.util.Scanner;

public class MaxValueOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入三个数据：");

        int[] arr = new int[3];
        int maxValue = 0;

        for (byte i = 0; i < 3; i++) {
            arr[i] = scanner.nextInt();
            System.out.println("你输入了: " + arr[i]);

            maxValue = maxValue > arr[i] ? maxValue : arr[i];
        }

        System.out.println("你输入的最大值为： " + maxValue);
    }
}
