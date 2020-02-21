package com.zenroten.javales.io;

import java.io.*;

/**
 * @author Zr
 * @create 2020-02-16 15:18
 */
public class WriterDemo2 {

    public static void main(String[] args) throws Exception {
        BufferedWriter w = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(
                        new File("d://fileTest//test02//test1.txt"))));

        w.write("中华人民共和国\r\n 中国共产党！！1111");
        w.flush();//清空缓冲区
        w.close();
    }
}