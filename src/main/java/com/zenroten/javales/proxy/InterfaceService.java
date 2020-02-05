package com.zenroten.javales.proxy;

import java.lang.reflect.Proxy;

/**
 * @author Zr
 * @create 2020-02-04 22:42
 */
public class InterfaceService {
    public static void main(String[] args) {
        InterfaceA a = new InterfaceAImpl();

        InterfaceProxy interfaceProxy = new InterfaceProxy(a);
        InterfaceA aProxy = (InterfaceA) Proxy.newProxyInstance(
          a.getClass().getClassLoader(),
          a.getClass().getInterfaces(),
          interfaceProxy
        );

        aProxy.print();
    }
}