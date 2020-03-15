package com.zenroten.javales.class04.demo01;

/**
 * @author Zr
 * @create 2020-03-10 23:22
 */
public class Test9 {
    public static void main(String[] args) {
        /*
          打印空心三角形

           *
          * *   if i == 1 && j
         *   *
        *     *
       *********


         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2) +1 ; j++) {
                if(i >= 1 && i <= 3 && j == 1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }


}