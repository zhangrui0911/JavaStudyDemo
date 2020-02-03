package com.zenroten.javales.innerclass;

/**
 * @author Zr
 * @create 2020-01-30 20:20
 */
public class PrintClass {

    protected String name;

    public PrintClass(String name) {
        this.name = name;
        System.out.println("调用了父类构造器name= " + this.name);
    }

    public void print(){
        System.out.println("我是打印");
    }
}