package com.zenroten.javales.class04.demo01;

/**
 * @author Zr
 * @create 2020-03-10 23:22
 */
public class Test1 {
    public static void main(String[] args) {

        //循环嵌套来完成
        //时分秒
        for (int i = 0; i < 365; i++) {
            for (int j = 0; j < 24; j++) {
                System.out.println("第" + (i + 1) + "天，第" + (j + 1) + "个小时");
            }

        }
    }
}