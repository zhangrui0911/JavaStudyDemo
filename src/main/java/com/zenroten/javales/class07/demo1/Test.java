package com.zenroten.javales.class07.demo1;

/**
 * @author Zr
 * @create 2020-03-14 20:33
 */
public class Test {
    public static void main(String[] args) {
        Cat c = new Cat();
        //在方法调用时，传递的参数是实参
        String result = c.eat(11, "小鱼干");
        System.out.println(result);
    }
}