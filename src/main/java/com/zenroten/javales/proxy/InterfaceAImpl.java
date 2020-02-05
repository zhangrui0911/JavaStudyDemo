package com.zenroten.javales.proxy;

/**
 * @author Zr
 * @create 2020-02-04 22:38
 */
public class InterfaceAImpl implements InterfaceA {
    @Override
    public void print() {
        System.out.println("被代理类");
    }
}