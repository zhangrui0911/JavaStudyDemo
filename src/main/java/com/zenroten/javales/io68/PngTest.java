package com.zenroten.javales.io68;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import java.io.*;

/**
 * @author Zr
 * @create 2020-02-18 12:26
 */
public class PngTest {
    public static void main(String[] args) throws Exception {
        readerWriterPng();
    }

    public static void inputStreamPng() throws Exception {
        File file = new File("d:\\fileTest\\1.png");
        if (file.exists()) {
            InputStream inputStream = new FileInputStream(file);
            OutputStream outputStream = new FileOutputStream("d:\\fileTest\\3.png");

            int temp = 0;
            while ((temp = inputStream.read()) != -1) {
                outputStream.write(temp);
            }

            inputStream.close();
            outputStream.close();
        }
    }

    public static void writerPng() throws Exception {
        InputStream inputStream = new FileInputStream("d:\\fileTest\\1.png");
        Writer writer = new FileWriter("d:\\fileTest\\2.png");

        int temp = 0;
        while ((temp = inputStream.read()) != -1){
            //输出的流格式不正确，所以生成的图片文件无法正常打开
            writer.write(temp);
        }
        inputStream.close();
        writer.close();
    }

    public static void readerWriterPng() throws Exception {
        Reader reader = new FileReader("d:\\fileTest\\1.png");
        Writer writer = new FileWriter("d:\\fileTest\\2.png");

        int temp = 0;
        while ((temp = reader.read()) != -1) {
            /**
             * 使用字符流读取、输出的图片也无法正常打开
             * 字符流是用来处理文字类型的数据
             * 除文字之外的数据，都要使用字节流进行处理
             */
            writer.write(temp);
        }
        reader.close();
        writer.close();
    }
}