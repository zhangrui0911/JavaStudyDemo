package com.zenroten.javales.class04.demo02;

/**
 * @author Zr
 * @create 2020-03-11 22:23
 */
public class Test1 {
    public static void main(String[] args) {
        //数组的声明：两种方式一样，没有任何区别
        int[] is1;
        int is2[];

        //给数组分配空间，数组的长度是有上限的
        //int的长度
        is1 = new int[10];//定义数组的长度
        //边声明边分配空间
        int[] is3 = new int[20];

        //数组赋值
        //数组的游标的上限是数组长度 -1，下限是0
        is1[0] = 11;
        is1[1] = 22;
//        is1[-1] = 222;

        //取值
        int is1_0 = is1[0];
        int is1_1 = is1[1];
        System.out.println(is1_0);
        System.out.println(is1_1);
    }
}