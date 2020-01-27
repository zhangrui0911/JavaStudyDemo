package com.zeroten.classobject;

import org.testng.annotations.Test;

/**
 * @author Zr
 * @create 2020-01-22 23:58
 */
public class VarTest {
    //没有使用static 修饰的是实例变量，每个实例有单独的拷贝
    private int index;//用于存放当前是类的第一个实例

    //使用static修饰的是类变量，所有的实例共享
    private static int count = 0;//用于记录创建该类实例的个数

    public VarTest() {
    }


    public VarTest(int index, int count) {
        this.index = index;
        this.count = count;
    }


    public void println(){
        String logStr = String.format("当前创建第%d个实例，共%d个", index, count);
        System.out.println(logStr);
    }

    public static void main(String[] args) {
        VarTest v1 = new VarTest();
        v1.index = 1;
        VarTest.count++;
        //System.out.println("当前创建第" + v1.index + "个实例，共" + VarTest.count);
        v1.println();

        VarTest v2 = new VarTest();
        VarTest.count++;
        v2.index = 2;
        //System.out.println("当前创建第" + v2.index + "个实例，共" + VarTest.count);
        v2.println();

        System.out.println("v1看到的count:" + v1.count);
        System.out.println("v2看到的count:" + v2.count);
        System.out.println("v1看到的index:" + v1.index);
        System.out.println("v2看到的index:" + v2.index);


        VarTest v3 = new VarTest(3, 3);
//        System.out.println("v3看到的count:" + v3.count);
//        System.out.println("v3看到的index:" + v3.index);
        v3.println();
    }
}