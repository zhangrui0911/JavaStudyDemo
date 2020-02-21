package com.zenroten.javales.io;

import java.io.*;
import java.util.LinkedList;

/**
 * @author Zr
 * @create 2020-02-15 22:04
 */
public class ReaderDemo2 {
    public static void main(String[] args) throws Exception {
        //缓冲：默认8192/8K
        BufferedReader r = new BufferedReader(
                new InputStreamReader(//可以设置字符集
                        new FileInputStream(
                                new File("d://fileTest//test02//test1.txt"))));

        //字符流开始，缓冲才有意义
        /**
         * readLine() 方法以 \n 或 \r 做为读取一行的标准
         * 直到返回值为 null 表示所有的字节读取完
         *
         */
        StringBuffer str = new StringBuffer();
        String s = "";
        while ((s = r.readLine()) != null) {
            str.append(s);
            str.append("\r\n");
        }
        System.out.println(str.toString());
        r.close();
    }
}