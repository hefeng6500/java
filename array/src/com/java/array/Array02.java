package com.java.array;

public class Array02 {
    public static void main(String[] args) {
//        数组求最值

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        System.out.println(maxValue);
    }
}
