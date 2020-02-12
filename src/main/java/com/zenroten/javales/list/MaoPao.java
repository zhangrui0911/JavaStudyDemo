package com.zenroten.javales.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zr
 * @create 2020-02-10 15:17
 */
public class MaoPao {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(16);
        list.add(6);
        list.add(2);
        list.add(4);

        int temp;
        int left;
        int right;
        for (int i = 0; i < list.size(); i++) {
            for (int i1 = i; i1 < list.size(); i1++) {
                left = list.get(i);
                right = list.get(i1);

                if(left > right){
                    temp = left;
                    list.set(i, right);
                    list.set(i1, temp);
                }
            }
        }

        System.out.println(list);
    }
}