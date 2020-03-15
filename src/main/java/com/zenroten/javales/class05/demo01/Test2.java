package com.zenroten.javales.class05.demo01;

/**
 * @author Zr
 * @create 2020-03-12 18:49
 */
public class Test2 {
    public static void main(String[] args) {
        //找最小值和最大值
        int[] is = {11, 0, -1, 21, 97, 99, -15};

        int min = is[0];
        int max = is[0];

        for (int i : is) {
            if(min > i){
                min = i;
            }

            if(max < i){
                max = i;
            }
        }

        System.out.println(min);
        System.out.println(max);

    }
}