package com.zenroten.javales.exception;

/**
 * @author Zr
 * @create 2020-02-29 12:18
 */
public class Demo1 {
    public static void main(String[] args) {
        System.out.println("异常发生前");

        int i = 2;
        int j = 0;
        try {
           // new int[]{1}[10] = 11;//游标越界异常
            System.out.println(i / j);
            return;
        } catch (ArithmeticException a) {//捕获ArithmeticException异常
            a.printStackTrace();//打印堆栈信息
            System.out.println("有异常了~~~");
            System.exit(1);//退出虚拟机
        } /*catch (ArrayIndexOutOfBoundsException b) {
            b.printStackTrace();
        }*/ finally{
            System.out.println("无论是否发生异常，都一定会执行");
        }



        System.out.println("异常发生后");
    }
}