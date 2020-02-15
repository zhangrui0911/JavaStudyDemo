package com.zenroten.javales.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author Zr
 * @create 2020-02-13 19:42
 */
public class InputDemo02 {

    //程序：以程序作为参照物
    public static void main(String[] args) throws Exception {
        //使用流操作文件
        File f = new File("D://fileTest//test01", "test.txt");//文件
        //读取文件大小(单位字节)
        long len1 = f.length();

        //输入流：
        /**
         * 注意：这只是个demo，在实际开发中FileInputStream实现类用的很少
         * 目的：明白字节流的使用方法
         *      之后的项目都是使用字节流进行传递，没有中间文件的存在
         */
        InputStream input = new FileInputStream(f);
        //获取可读数据的大小(单位字节)
        int len2 = input.available();
        //数组的创建，必然要指定长度，java中默认int
        byte[] bs = new byte[len2];//用于保存，读取的文件数据

        //input.read();//一次读一个字节

        //1.如何暂时保存读到的数据
        byte temp = -1;//用于临时保存读到的数据

        //2.如何把数据写入数组
        int index = 0;
        //使用循环，依次读
        while ((temp = (byte)input.read()) != -1) {
            bs[index] = temp;
            index++;
        }

        //使用String进行构造
        String str = new String(bs);
        System.out.println(str);

        //关闭流
        input.close();
    }
}