package com.zenroten.javales.class04.demo02;

import java.util.Arrays;

/**
 * @author Zr
 * @create 2020-03-11 22:53
 */
public class Test2 {
    public static void main(String[] args) {
        //数组元素的默认值
        int[] is = new int[1];//整数 0
        System.out.println(Arrays.toString(is));
        double[] ds = new double[1];//浮点数 0.0
        System.out.println(Arrays.toString(ds));
        char[] cs = new char[1];//字符 [ ]
        System.out.println(Arrays.toString(cs));
        boolean[] bs = new boolean[1];//布尔类型 false
        System.out.println(Arrays.toString(bs));
        String[] ss = new String[1];//引用类型 null
        System.out.println(Arrays.toString(ss));

    }
}