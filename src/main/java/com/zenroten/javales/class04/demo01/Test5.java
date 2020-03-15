package com.zenroten.javales.class04.demo01;

/**
 * @author Zr
 * @create 2020-03-10 23:22
 */
public class Test5 {
    public static void main(String[] args) {
        /*
        打印一个直角三角形
            *
           **
          ***
         ****
        *****

            打印五行
            1.一行5个（包括空格和星星）
            2.第一行开始，空格是5-1个
            3.第一行开始，星星首先是1个，然后是星星递增
            4.空格递减的规律，空格是每行 -1，根据行的递增，依次减
            5.星星递增的规律，每行 +1，根据行的递增，依次递增

         */
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5 - j - 1; i++) {
                System.out.print(" ");

            }
            for (int i = 0; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*for (int i = 0; i < 5; i++) {
            //内层约束一行打印的个数：个数等于一行个数减去行数
            //每一行先打（空格 - 行数） + 星星
            for (int j = 1; j < 5 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
    }
}