package com.zeroten.jc;

/**
 * @author Zr
 * @create 2020-01-29 0:02
 */
public interface Interface {

    class InnerClass{

    }

    interface InnerInterface{

    }

    int MAX_COUNT = 100;

    void method();

    //在Java8中可以有方法体，但必须使用default进行修饰
    default void print() {
        System.out.println("我是一个默认方法");
    }

    static void print0(){
        System.out.println("我是接口中Java8才可以有的静态方法");
    }
}
