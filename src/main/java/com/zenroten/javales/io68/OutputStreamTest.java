package com.zenroten.javales.io68;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.OutputUtil;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author Zr
 * @create 2020-02-17 18:02
 */
public class OutputStreamTest {


    public static void main(String[] args) throws Exception {
        OutputStream outputStream =
                new FileOutputStream("d://fileTest//test02//test1.txt");
        System.out.println(outputStream);
        //如果传参是一个数字，则会将该数字所对应的ASCII码值写到文件中
        outputStream.write(99);

        byte[] bytes = {97,98,99};
        outputStream.write(bytes);

        outputStream.write(bytes, 0, 1);

        //如果需要写入中文,需要知道中文所对应的ASCII码值
        byte[] b = {(byte)228,(byte)189,(byte)160,(byte)229,(byte)165,(byte)189};
        outputStream.write(b);

        outputStream.flush();
        outputStream.close();

    }
}