package com.zenroten.javales.reflect;

import java.lang.reflect.Method;

/**
 * @author Zr
 * @create 2020-02-28 15:21
 */
public class TestA {
    public static void main(String[] args) {
        Class c = Person.class;
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}