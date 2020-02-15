package com.zenroten.javales.io;

import java.io.File;//使用的是io包下的File
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Zr
 * @create 2020-02-13 14:17
 */
public class Test {

    public static void main(String[] args) throws Exception {
        //文件在代码中的表现形式
        //在创建File对象时，这个只是一个对象，没有读取文件，也不会去验证
        File f1 = new File("文件的全路径（全路径）");

        File f2 = new File("文件的路径", "文件名");

        //路径：
        //在windows中：\\
        //在Linux中：/

        //dir1();
        //dir2();
        dir6();
    }


    /**
     *
     * 目录的创建
     */
    public static void dir1(){
        File file = new File("D://fileTest//test01");//目录
        //没有哪个规定，文件一定要有后缀

        //判断文件或目录是否存在
        System.out.println(file.exists());
        if(!file.exists()){
            //创建目录，但不会创建不存在的父目录
            //boolean b = file.mkdir();
            //System.out.println(b);

            //创建目录，如果父目录不存在，则自动创建父目录
            boolean b = file.mkdirs();
            System.out.println(b);
        }
    }


    /**
     * 创建文件
     */
    public static void dir2() throws IOException {
        File file = new File("D://fileTest//test01", "test.txt");//文件
        if(!file.exists()){
            boolean newFile = file.createNewFile();
            System.out.println(newFile);

        }
    }

    /**
     *  判断是否是文件/目录
     */
    public static void dir3() throws Exception {
        File file1 = new File("D://fileTest//test01");//目录
        File file2 = new File("D://fileTest//test01", "test.txt");//文件

        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.isDirectory());
        System.out.println(file2.isFile());
    }

    /**
     * 获取绝对路径/相对路径
     */
    public static void dir4() throws Exception {
        File file1 = new File("D://fileTest//test01");//目录
        //通常是需要使用在容器中的位置，在Web中有专门的方法

        System.out.println(file1.getPath());
        System.out.println(file1.getAbsolutePath());
    }

    /**
     * 获取文件长度
     */
    public static void dir5() throws Exception {
        File file = new File("D://fileTest//test01", "test.txt");//文件

        //获取文件长度
        System.out.println(file.length());//11
    }

    /**
     * 获取文件目录
     */
    public static void dir6() throws Exception {
        File file = new File("D://fileTest//test01");

        String[] list = file.list();
        System.out.println(Arrays.toString(list));
    }
}