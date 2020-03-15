package com.zenroten.javales.class04.demo01;

/**
 * @author Zr
 * @create 2020-03-10 23:22
 */
public class Test7 {
    public static void main(String[] args) {
        /*
          打印等腰梯形


             ***
            *****
           *******
          *********
           对称 2n + 3，1是代表中轴线，每次增加就是 该行坐标 x 2 + 1

         */


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2) + 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


}