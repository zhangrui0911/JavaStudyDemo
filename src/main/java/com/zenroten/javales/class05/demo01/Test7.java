package com.zenroten.javales.class05.demo01;

import java.util.Arrays;

/**
 * @author Zr
 * @create 2020-03-13 18:43
 */
public class Test7 {
    public static void main(String[] args) {
        xuanze();
    }


    public static void maopao(){
        int[] is = {11, 0, -1, 21, 97, 99, -15};

        for (int i = 0; i < is.length - 1; i++) {
            for (int j = i; j < is.length; j++) {
                if(is[i] > is[j]){
                    int temp = is[j];
                    is[j] = is[i];
                    is[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(is));
    }

    //选择排序，是要将最小的数据的坐标保存下来，然后将每一轮比较的第一个值进行替换
    public static void xuanze(){
        int[] is = {11, 0, -1, 21, 97, 99, -15};

        for (int i = 0; i < is.length - 1; i++) {
            int minIndex = i;
            for (int j = i; j < is.length ; j++) {
                if (is[i] > is[j]) {
                    minIndex = j;
                }
            }
            int temp = is[minIndex];
            is[minIndex] = is[i];
            is[i] = temp;
        }
        System.out.println(Arrays.toString(is));
    }


    /**
     * 插入排序需要从后向前比较
     * 将每次比较的值放在前面已排好序的数组中最合适的位置，前面的比他小，后面的比他大
     *
     */
    public static void charu(){
        int[] is = {11, 0, -1, 21, 97, 99, -15};

        for (int i = 1; i < is.length; i++) {
            for(int j = i; j > 0 && is[j] < is[j-1]; j--){
                int temp = is[j];
                is[j] = is[j - 1];
                is[j - 1] = temp;
            }
        }
        System.out.println(Arrays.toString(is));
    }
}