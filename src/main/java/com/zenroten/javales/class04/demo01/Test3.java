package com.zenroten.javales.class04.demo01;

/**
 * @author Zr
 * @create 2020-03-10 23:22
 */
public class Test3 {
    public static void main(String[] args) {

        /*
        打印一个直角三角形
        *
        **
        ***
        ****
        *****

         */

        for (int i = 0; i < 5; i++) {
            //内层约束一行打印的个数：个数等于行数
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}