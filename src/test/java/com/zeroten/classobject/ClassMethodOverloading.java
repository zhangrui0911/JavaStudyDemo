package com.zeroten.classobject;

import org.testng.annotations.Test;

/**
 * @author Zr
 * @create 2020-01-26 21:56
 */
public class ClassMethodOverloading {

    public void println(){
        System.out.println("无参方法");
    }


    public void println(int numb){
        System.out.println("一个整数：" + numb);
    }

    public void println(String str){
        System.out.println("一个字符串：" + str);
    }

    public void println(int numb1, int numb2){
        System.out.println("两个整数：numb1 = " + numb1 + ", numb2 = " + numb2);
    }


    @Test
    public void testOverloading() {
        println();
        println(1);
        println("hello world");
        println(2, 3);
    }
}