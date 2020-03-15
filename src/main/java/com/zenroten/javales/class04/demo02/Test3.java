package com.zenroten.javales.class04.demo02;

/**
 * @author Zr
 * @create 2020-03-11 23:03
 */
public class Test3 {
    public static void main(String[] args) {
        //直接初始化元素值：长度就是默认元素的个数
        //1.必须在一行内完成赋值
        int[] is1 = {11, 22, 33, 44};

        //获取数组长度
        System.out.println(is1.length);//调用数组的length属性

        //2.可以不必在一行内完成
        // int[] is2 = new int[]{22,33,44,55};
        int[] is2;
        is2 = new int[]{33,44,55,66};


    }
}