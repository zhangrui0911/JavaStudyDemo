package com.zenroten.javales.class05.demo01;

import java.util.Arrays;

/**
 * @author Zr
 * @create 2020-03-12 22:57
 */
public class Test6 {
    public static void main(String[] args) {
        int[] is = {11, 0, -1, 21, 97, 99, -15};


        //插入排序

        //j首先是从1开始，也就是从第二元素开始，倒着往前数
        //j不能为0，因为要与前面的值进行比较
        //j前面的一个值，一定比他小，后面一定比他大
        //就以上两点，倒过来说：j如果没到1，同时j比前面一个小的时候，循环要继续下去
        for (int i = 1; i < is.length; i++) {
            for (int j = i; j > 0 && is[j] < is[j-1]; j--) {
                int temp = is[j];
                is[j] = is[j - 1];
                is[j - 1] = temp;
            }
        }

        System.out.println(Arrays.toString(is));

    }
}