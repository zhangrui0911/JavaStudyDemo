package com.zeroten.classobject;

/**
 * @author Zr
 * @create 2020-01-26 23:04
 */
import java.util.zip.*;
public class ClassStaticTest {
    private static final int MAX_COUNT;
    private static int count = 0;

    {
        //代码块，也可称为初始化代码块
        System.out.println("代码块1");

    }

    static{
        //静态代码块，也可称为静态初始化代码块
        MAX_COUNT = 6;
        System.out.println("静态代码块");
    }

    {
        //代码块，也可称为初始化代码块
        System.out.println("代码块2");

    }

    public ClassStaticTest() throws Exception {
        if(count > MAX_COUNT ){
            throw new Exception("只能创建" + MAX_COUNT + "个对象");
        }
        count++;
    }

    public static void printCount(){
        System.out.println("总共有 " + count + "个实例");
    }


    public static void main(String[] args) {
        try {
            new ClassStaticTest();
            new ClassStaticTest();
            new ClassStaticTest();
            new ClassStaticTest();
            new ClassStaticTest();
            new ClassStaticTest();
            new ClassStaticTest();
            new ClassStaticTest();

            ZipFile zipfile;
        }catch (Exception e){
            e.printStackTrace();
        }

        ClassStaticTest.printCount();
    }
}