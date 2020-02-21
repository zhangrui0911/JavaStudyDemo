package com.zenroten.javales.io;

import java.io.*;
import java.nio.charset.Charset;
import java.util.LinkedList;

/**
 * @author Zr
 * @create 2020-02-15 22:04
 */
public class ReaderDemo {
    public static void main(String[] args) throws Exception {
        //字符流
        /**
         * ** public InputStreamReader(InputStream in) //关注参数，只要传入一个InputStream的子类实现就可以
         * ** public InputStreamReader(InputStream in, String charsetName)//可以设置字符集
         *    常用字符集：
         *    UTF-8/GBK/GB2312/ISO-8859-1  ---> 保证统一
         *    字符串可以指定编码集的编码和解码
         *
         * public InputStreamReader(InputStream in, Charset cs)
         * public InputStreamReader(InputStream in, CharsetDecoder dec)
         *
         */
        //字符串可以指定编码集的编码和解码
//        String str1 = new String(bytes, "newcharset");
//        String str2 = "".getBytes("charset");
        Reader r = new InputStreamReader(
                new FileInputStream(
                        new File("d://fileTest//test02//test1.txt")));
        //在泛型当中，基本数据类型的泛型，只能使用包装类
        LinkedList<Character> cs = new LinkedList<Character>();//使用泛型，强制统一数据类型

        /**
         * ArrayList频繁的增减元素，是非常消耗内存的，但取值很方便
         * 当我们要不断向集合中插入元素，效率最高的，使用LinkedList
         * LinkedList地址的指向非常快，适用于频繁的跟换集合元素
         */

        StringBuffer stringBuffer = new StringBuffer();
        int c = -1;
        while ((c = r.read()) != -1){
            stringBuffer.append((char)c);
        }

        System.out.println(stringBuffer.toString());
        r.close();

    }
}