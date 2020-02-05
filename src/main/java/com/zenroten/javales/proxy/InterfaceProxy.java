package com.zenroten.javales.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Zr
 * @create 2020-02-04 22:39
 */
public class InterfaceProxy implements InvocationHandler {

    Object obj;

    public InterfaceProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理类执行");

        Object result = method.invoke(obj, args);
        return result;
    }
}