package com.zenroten.javales.io68;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author Zr
 * @create 2020-02-15 15:05
 */
public class IOTest {
    public static void main(String[] args) throws Exception {
        File file = new File("d://fileTest//test02//test1.txt");

        if (file.isFile()) {
            /**
             * 当前文件中的内容为 "ABC"
             * 每一次取出的结果为65，66，67和-1
             * 调用read()方法读取一个字节，将该字节转换成int数据并返回
             * 当文件字节读取完成后，返回-1
             */
            InputStream inputStream = new FileInputStream(file);
            /*int temp = inputStream.read();
            System.out.println(temp);
            temp = inputStream.read();
            System.out.println(temp);
            temp = inputStream.read();
            System.out.println(temp);
            temp = inputStream.read();
            System.out.println(temp);*/

            /**
             *  注意：此处做循环操作，长度要取的是文件的长度，也就是可以从流中读取到的字节数目
             *  所以要使用流的available();方法
             */

            long length = file.length();
            /*for (long i = 0; i < length; i++) {
                int temp = inputStream.read();
            }*/

            int temp = 0;
            System.out.println("当前还有 " + inputStream.available() + "byte数据未读");
            while ((temp = inputStream.read()) != -1) {
                System.out.println(temp);
                System.out.println("当前还有 " + inputStream.available() + "byte数据未读");
            }

            inputStream.close();
        }


    }
}