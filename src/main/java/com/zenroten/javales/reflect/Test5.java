package com.zenroten.javales.reflect;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Zr
 * @create 2020-02-29 11:37
 */
public class Test5 {
    public static void main(String[] args) {
        //通过反射获取注解
        //注解可以获取你在注解中填写的值
        //判断是否有这个注解，以此为依据，把注解作为一个标识
        Class c = MyClass.class;
        MyAnn ann = (MyAnn)c.getAnnotation(MyAnn.class);//获取注解
        System.out.println(ann.f1());
        System.out.println(ann.f2());
    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnn{
    String f1() default "";

    String f2() default "";
}

@MyAnn(f1 = "testf1", f2 = "testf2")
class MyClass{

}