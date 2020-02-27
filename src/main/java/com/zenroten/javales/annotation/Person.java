package com.zenroten.javales.annotation;

import javafx.beans.DefaultProperty;

import javax.xml.bind.Element;
import java.lang.annotation.*;
import java.util.Date;

/**
 * @author Zr
 * @create 2020-02-26 19:58
 */


public class Person {

    private int id;

    @TestAnn()
    public Person() {
    }

    @TestAnn(value1 = "", value2 = "")
    public Person(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Deprecated//当前方法已过时
    public String myToString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}

@Documented
@Target(ElementType.CONSTRUCTOR)//可以没有
@interface TestAnn{
    //应该写一个类似于抽象方法
    String value1() default "";
    String value2() default "";

}


class Test{
    public static void main(String[] args) {
        C c = new C() {
            @Override
            public void test1() {

            }
        };

        C.test2();

    }
}

class A {
    @SuppressWarnings("unused")
    void test1(){
        int i;
    }
}

class B extends A {

    @Override
    void test1() {
        super.test1();
    }
}

@FunctionalInterface
interface C{
    public void test1();
    static void test2(){//匿名函数
        System.out.println("test2");
    }

    default void test3(){//默认函数可以不用实现
        System.out.println("test3");
    }
}