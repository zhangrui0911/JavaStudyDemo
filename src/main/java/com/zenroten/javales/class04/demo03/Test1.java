package com.zenroten.javales.class04.demo03;

/**
 * @author Zr
 * @create 2020-03-12 13:20
 */
public class Test1 {
    public static void main(String[] args) {
        //内存
        //除了8个基本数据类型，都是引用类型
        int[] is1 = {11, 22, 33};
        int[] is2 = is1;//赋值的是内存地址
        int[] is3 = {11, 22, 33};//一个新的地址


        System.out.println(is1 == is2);//true：地址一样，所以为true
        System.out.println(is1 == is3);//false：地址不一样，所以是false

        /**
         * 因为is1与is2指向同一个地址
         * 所以在修改is1的第一个元素值，is2的第一个元素也被修改
         */
        is1[0] = 111;
        System.out.println(is2[0]);

    }
}