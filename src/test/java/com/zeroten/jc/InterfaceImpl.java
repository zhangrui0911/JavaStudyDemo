package com.zeroten.jc;

/**
 * @author Zr
 * @create 2020-01-29 0:22
 */
public class InterfaceImpl implements Interface,Interface2 {
    @Override
    public void method() {
        System.out.println("实现接口方法");
    }
}