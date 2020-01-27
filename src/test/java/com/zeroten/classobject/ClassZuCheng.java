package com.zeroten.classobject;

import org.testng.annotations.Test;

/**
 * @author Zr
 * @create 2020-01-22 22:59
 */
public class ClassZuCheng {

    //构造方法
    public ClassZuCheng(int a){

    }

    //成员变量、实例变量、域变量
    private String name;
    //类变量、静态域变量
    private static String count;


    //静态方法
    public static void staticPrintln(){

    }

    //实例方法
    public void println(){

    }

    //代码块（实例代码块），也可以叫做初始化代码块
    {

        System.out.println("类里、方法之外用大括号括起来的一段代码");
    }

    //静态代码块，也可以称为静态初始化代码块
    static {
        System.out.println("类里、方法之外用大括号括起来的，且前面有static修饰的一段代码");
    }

    @Test
    public void test1() {

    }
}