package com.zenroten.javales.class07.demo3;

/**
 * @author Zr
 * @create 2020-03-15 9:04
 */
public class A {
    void test(B b){
        System.out.println(b.i);//15
        System.out.println(b.hashCode());//hashCode内存地址
        b.i = 20;
        System.out.println(b.i);//20
        System.out.println(b.hashCode());//hashCode内存地址
    }

    void test1(int i){
        System.out.println(i);//1
        i = 2;
        System.out.println(i);//2
    }

}