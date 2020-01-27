package com.zeroten.classobject;

/**
 * @author Zr
 * @create 2020-01-27 18:11
 */
public class ClassCreateTest {
    private static String name;

    public ClassCreateTest() {
        System.out.println("执行构造方法");
    }

    {
        System.out.println("执行代码块1");
    }
    static{
        name = "静态代码块为静态变量赋值";
        System.out.println("执行静态代码块1");
    }
    public void println(){
        System.out.println(name);
    }


    public static void main(String[] args) {
        new ClassCreateTest().println();
        new ClassCreateTest().println();
    }

    {
        System.out.println("执行代码块2");
    }
    static{
        System.out.println("执行静态代码块2");
    }
}