package com.zenroten.javales.class05.demo01;

import java.util.Arrays;

/**
 * @author Zr
 * @create 2020-03-12 21:47
 */
public class Test3 {
    public static void main(String[] args) {
        //把最后一个值，放到合适的位置
        int[] is = {11,33,44,55,66,22};

        /**
         * 1.交换的次数
         * 2.数据寻访的次数
         * 3.复杂度
         * 要做到尽可能的减少运行次数，从而提高效率
         */
        for (int i = is.length - 1 ; i > 0 ; i--) {
            if (is[i] < is[i - 1]) {
                int temp = is[i];
                is[i] = is[i - 1];
                is[i - 1] = temp;
            } else {
                break;//少一次
            }

        }
        System.out.println(Arrays.toString(is));

    }
}