package com.zenroten.javales.genericity;

/**
 * @author Zr
 * @create 2020-02-21 22:50
 */
public class Demo4<T> {
    public static void main(String[] args) {
        Demo4<String> demo4 = new Demo4<>();
        demo4.test2("",2);
    }


    public <A,B,C> void test1(T t){

    }

    public <A> A test2(T t, A a){
        return a;
    }
}