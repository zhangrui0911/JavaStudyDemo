package com.zenroten.javales.class04.demo01;

/**
 * @author Zr
 * @create 2020-03-10 23:22
 */
public class Test8 {
    public static void main(String[] args) {
        /*
          打印空心矩形
           ********
           ********
           **    **  if i = 2 && j >= 2 && j <= 5
           **    **  if i = 3 && j >= 2 && j <= 5
           **    **  if i = 4 && j >= 2 && j <= 5
           ********
           ********


         */

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 8; j++) {
                if(i >= 2 && i <= 4 && j >= 2 && j <= 5){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }


}