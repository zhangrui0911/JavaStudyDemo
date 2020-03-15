package com.zenroten.javales.class04.demo01;

/**
 * @author Zr
 * @create 2020-03-10 23:22
 */
public class Test10 {
    public static void main(String[] args) {
       //99乘法表，相当于直角三角形
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + " = " + i * j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }


}