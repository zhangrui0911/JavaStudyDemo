package com.zenroten.javales.class04.demo03;

import java.util.Arrays;

/**
 * @author Zr
 * @create 2020-03-12 14:04
 */
public class Test2 {
    public static void main(String[] args) {
        int[] is1 = {11, 22, -11, 0, 18, 99};
        int[] is2 = {11, 22, -11, 0, 18, 99};

        //查询元素值val在数组array中的下标（要求数组中元素已经按升序排序）
        Arrays.sort(is1);
        int i = Arrays.binarySearch(is1, 11);
        System.out.println(i);


        /**
         * 1.复制一个数组，到一个新的地址（数组长度是不可变的）
         * 2.也可以将复制的数组再次赋值给原数组
         * 3.复制后的数组地址，是一个新的地址
         * 4.可以在复制的同时指定新数组的长度
         *
         */
        System.out.println(is1);
        is1 = Arrays.copyOf(is1, is1.length + 1);
        System.out.println(is1);
        System.out.println(Arrays.toString(is1));

        //给数组填充默认值
        Arrays.fill(is2, 100);
        System.out.println(Arrays.toString(is2));


        //将数组转换为一个字符串
        String str = Arrays.toString(is1);
        System.out.println(str);

        //排序：直接对数组地址排序
        Arrays.sort(is1);//JDK当中Arrays的排序使用的是【快速排序法】
        System.out.println(Arrays.toString(is1));


        //比较array1和array2两个数组是否相等：值和长度一一对应
        boolean b1 = Arrays.equals(is1, is2);
        System.out.println(b1);



    }
}