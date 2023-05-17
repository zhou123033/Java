package com.study.Arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Josh
 * @version 1.0
 */
public class ArraysSortCustom {
    public static void main(String[] args) {

        int[] arr = {1, -1, 8, 0, 20};
        bubble01(arr);
        System.out.println("排序后的情况");
        System.out.println(Arrays.toString(arr));
    }

    //使用冒泡完成排序
    public static void bubble01(int[] arr) {
        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                //从小到大排序
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    //结合冒泡 + 定制
    public static void bubble02(int[] arr, Comparator c) {

    }
}
