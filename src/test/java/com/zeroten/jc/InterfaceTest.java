package com.zeroten.jc;

import org.testng.annotations.Test;

/**
 * @author Zr
 * @create 2020-01-29 0:23
 */
public class InterfaceTest {

    @Test
    public void test1() {
        Interface i = new InterfaceImpl();
        i.method();

        InterfaceImpl i2 = new InterfaceImpl();
        System.out.println(i2 instanceof Interface);
        System.out.println(i2 instanceof Interface2);
        i2.print();

        //建议直接使用接口名来访问其属性
        System.out.println(Interface.MAX_COUNT);
        System.out.println(InterfaceImpl.MAX_COUNT);
        System.out.println(i.MAX_COUNT);
        //接口中的静态方法，子类无法实现，所以只能使用接口名去调用接口中的静态方法
        Interface.print0();

    }
}