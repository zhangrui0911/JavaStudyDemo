package com.zenroten.javales.class05.demo01;

import sun.security.util.Length;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

/**
 * @author Zr
 * @create 2020-03-12 22:57
 */
public class Test4 {
    public static void main(String[] args) {
        int[] is = {11, 0, -1, 21, 97, 99, -15};

        //选择排序

        for (int i = 0; i < is.length - 1; i++) {

            int minIndex = i;//最小数值的坐标
            for (int j = i + 1; j < is.length; j++) {
                //比较两个值的大小，把小的数值的坐标赋值给minIndex
                if(is[j] < is[minIndex]){
                    minIndex = j;
                }
            }
            //将minIndex的值赋值给基准值
            int temp = is[minIndex];
            is[minIndex] = is[i];
            is[i] = temp;
        }


        System.out.println(Arrays.toString(is));
    }
}