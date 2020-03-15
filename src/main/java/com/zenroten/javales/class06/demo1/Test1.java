package com.zenroten.javales.class06.demo1;

/**
 * @author Zr
 * @create 2020-03-14 15:24
 */
public class Test1 {
    public static void main(String[] args) {
        testDoWhile();
    }


    public static void testFor() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void testWhile() {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);

    }


    public static void testDoWhile() {
        int sum = 0;
        int i = 1;
        do {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        } while (i <= 100);

        System.out.println(sum);
    }
}