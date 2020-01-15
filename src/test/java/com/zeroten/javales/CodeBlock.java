package com.zeroten.javales;

import org.testng.annotations.Test;

/**
 * @author Zr
 * @create 2020-01-10 23:49
 */
public class CodeBlock {

    @Test
    public void testBlockScope() {
        int n1 = 100;
        System.out.println(n1);
        //无法访问下面的代码块中的变量
       // System.out.println(n2);

        {
            int n2 = 200;
            //代码块中可以访问上级代码块中的变量
            System.out.println(n1);
            {
                System.out.println(n2);
            }

        }

        int n2 = 201;
        //打印的不是代码块中的n2，而是紧邻的n2
        System.out.println(n2);

    }
}