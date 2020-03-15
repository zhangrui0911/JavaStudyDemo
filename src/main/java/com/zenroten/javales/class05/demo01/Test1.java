package com.zenroten.javales.class05.demo01;

/**
 * @author Zr
 * @create 2020-03-12 18:48
 */
public class Test1 {
    public static void main(String[] args) {
        //交换两个数的位置
        int i = 11;
        int j = 12;

        System.out.println(i);
        System.out.println(j);
        int temp = 0;
        temp = i;
        i = j;
        j = temp;

        System.out.println(i);
        System.out.println(j);
    }
}