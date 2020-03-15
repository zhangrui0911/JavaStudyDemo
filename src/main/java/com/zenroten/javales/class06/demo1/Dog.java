package com.zenroten.javales.class06.demo1;

/**
 * @author Zr
 * @create 2020-03-13 19:55
 */
public class Dog {
    //属性（成员变量）
    int id;
    String name;
    int age;


    //方法(成员方法)
    public void eat(){
        String food = "狗吃东西";//这里不是成员变量
        System.out.println(food);
    }
}