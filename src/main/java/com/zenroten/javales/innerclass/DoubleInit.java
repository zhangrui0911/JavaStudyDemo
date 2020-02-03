package com.zenroten.javales.innerclass;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zr
 * @create 2020-01-30 20:30
 */
public class DoubleInit {
    public static void main(String[] args) {
        //双括号初始化
        List<Integer> numbs = new ArrayList<Integer>();
        numbs.add(1);
        numbs.add(2);
        numbs.add(3);
        numbs.add(4);
        numbs.add(5);
        System.out.println(numbs);

        class ArrayListNew extends ArrayList{
            {
                //初始化代码块
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
            }

        }

        List<Integer> numbs2 = new ArrayListNew();
        /*numbs2.add(1);
        numbs2.add(2);
        numbs2.add(3);
        numbs2.add(4);
        numbs2.add(5);*/

        System.out.println(numbs2);


        List<Integer> numb3 = new ArrayList() {
            {
                //初始化代码块
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
            }
        };
        System.out.println(numb3);
    }
}