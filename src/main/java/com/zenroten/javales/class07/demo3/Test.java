package com.zenroten.javales.class07.demo3;

/**
 * @author Zr
 * @create 2020-03-15 9:04
 */
public class Test {
    public static void main(String[] args) {
        A a = new A();
        /*B b = new B();
        System.out.println(b.i);//10
        System.out.println(b.hashCode());//hashCode内存地址
        b.i = 15;
        a.test(b);
        System.out.println(b.i);//20
        // 在A.test()方法中对引用类型的对象内的值进行了修改，
        // 所以在调用该内存对象中的值就是修改后的数值
        System.out.println(b.hashCode());//hashCode内存地址*/
        int i1 = 1;
        System.out.println(i1);//1
        a.test1(i1);
        System.out.println(i1);//1
    }
}