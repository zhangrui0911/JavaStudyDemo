package com.zenroten.javales.enumeration;

/**
 * @author Zr
 * @create 2020-02-22 15:10
 */
public interface Food {
    //在接口中所有属性都是常量 ，所有方法都是静态方法
    enum A implements Food{
        A,AA,AAA
    }

    enum B implements Food{
        B,BB,BBB
    }
}