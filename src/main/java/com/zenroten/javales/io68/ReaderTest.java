package com.zenroten.javales.io68;

import java.io.*;

/**
 * @author Zr
 * @create 2020-02-17 22:43
 */
public class ReaderTest {
    public static void main(String[] args) throws Exception {

        readCharTest();

    }


    public static void readTest() throws Exception {
        File file = new File("d://fileTest//test02//test1.txt");

        if(file.exists()){
            System.out.println("字符流读取");
            file.createNewFile();
            Reader reader = new FileReader(file);

            int temp = 0;
            OutputStream outputStream = new FileOutputStream("d://fileTest//test02//test2.txt");
            while ((temp = reader.read()) != -1) {
                System.out.println(temp);
                outputStream.write(temp);
            }

            reader.close();
            outputStream.close();
            System.out.println("字节流读取");
            InputStream inputStream = new FileInputStream(file);
            OutputStream outputStream2 = new FileOutputStream("d://fileTest//test02//test3.txt");

            int intemp = 0;
            while ((intemp = inputStream.read()) != -1) {
                System.out.println(intemp);
                outputStream2.write(intemp);
            }

            inputStream.close();
            outputStream2.close();
        }else{
            System.out.println("文件不存在！");
        }
    }


    public static void readCharTest() throws Exception {
        File file = new File("d://fileTest//test02//test1.txt");
        Reader reader = new FileReader(file);
        char[] chars = new char[10];
        //返回数据的长度
        //int length = reader.read(chars);
        int length = reader.read(chars, 2, 3);
        System.out.println(length);

        for (char c : chars) {
            System.out.println(c);
        }
        reader.close();
    }
}