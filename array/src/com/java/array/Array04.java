package com.java.array;

import java.util.Arrays;
import java.util.Random;

public class Array04 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            int index = random.nextInt(arr.length - 1); // [0, 8)

//            int temp = arr[i];
//            arr[i] = arr[index];
//            arr[index] = temp;

//            巧妙使用 异或运算符
            arr[i] = arr[i] ^ arr[index];
            arr[index] = arr[i] ^ arr[index];
            arr[i]  = arr[i] ^ arr[index];
        }
        System.out.println(Arrays.toString(arr));
    }
}
