package com.zenroten.javales.class05.demo01;

import java.util.Arrays;

/**
 * @author Zr
 * @create 2020-03-12 22:57
 */
public class Test5 {
    public static void main(String[] args) {
        int[] is = {11, 0, -1, 21, 97, 99, -15};


        //冒泡排序

        /**
         * 优化：
         * 1.i的范围是is.length - 1，最后一轮不需要比较
         * 2.j的初始值是j=i+1，因为当i为0时，直接和游标为1的值去比较，也就是i+1
         *   这样可以减少一次比较。
         */

        for (int i = 0; i < is.length - 1; i++) {
            for (int j = i + 1; j < is.length; j++) {
                if(is[i] > is[j]){
                    int temp = is[i];
                    is[i] = is[j];
                    is[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(is));
    }
}