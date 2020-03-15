package com.zenroten.javales.class07.demo1;

/**
 * @author Zr
 * @create 2020-03-14 20:29
 */
public class Cat {

    //方法声明时，参数类型是形参
    public String eat(int time, String food){
        String str = "当前时间：" + time + "，吃：" + food;
        return str;
    }
}