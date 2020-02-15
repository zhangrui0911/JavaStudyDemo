package com.zenroten.javales.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author Zr
 * @create 2020-02-13 19:42
 */
public class Test2 {

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
        /**
         * 输入流将直接写入内存地址，返回读取到内容的长度
         * 当所有的数据读取完之后，会返回一个 -1 值
         * 不过此方法太粗暴，一次性把所有的数据都读取出来
         */

        int result = input.read(bs);
        System.out.println("result ===  " + result);

        //使用String进行构造
        String str = new String(bs);
        System.out.println(str);

        //关闭流
        input.close();
    }
}