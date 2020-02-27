package com.zenroten.javales.genericity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zr
 * @create 2020-02-21 22:37
 */
public class Demo3 {
    public static void main(String[] args) {
        test(new ArrayList<Integer>());
    }

    //泛型边界，往上，往下都行
    static void test(List<? extends Number> ls) {

    }
}