package com.zeroten.classobject;

/**
 * @author Zr
 * @create 2020-01-26 23:56
 */
public class ClassStaticImport {

    public static String name = "这是一个静态变量";

    public static void println(){
        System.out.println("这是一个静态方法");
        System.out.println("name === " + name);
    }

}