package com.zenroten.javales.io;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Zr
 * @create 2020-02-13 19:42
 */
public class OutputDemo {


    public static void main(String[] args) throws Exception {
        demo3();
    }

    //程序：以程序作为参照物
    public static void demo1()throws Exception {
        //使用流操作文件
        File f = new File("D://fileTest//test01", "test.txt");//文件

        //输出流，是覆盖原文件里的内容，不是追加
        String str = "中华人民共和国\r\n加油！";

        OutputStream out = new FileOutputStream(f);
        //第一步：获取字节
        byte[] bytes = str.getBytes();

        out.write(bytes);//很粗暴
        /**
         * 将缓冲器的数据推送到输出流里(看数据量，如果数量大，需要调用flush()方法)
         * 缓冲区可以减轻流的压力，也可以保证数据的安全，
         * 所以建议在调用close()方法之前，调用flush()方法
         */

        out.flush();
        out.close();
    }


    //程序：以程序作为参照物
    public static void demo2()throws Exception {
        //使用流操作文件
        File f = new File("D://fileTest//test01", "test.txt");//文件

        //输出流，是覆盖原文件里的内容，不是追加
        String str = "中华人民共和国\r\n加油！";

        OutputStream out = new FileOutputStream(f);
        //第一步：获取字节
        byte[] bytes = str.getBytes();
        //使用for循环，每次只写一个字节
        for (byte aByte : bytes) {
            out.write(aByte);
        }

        /**
         * 将缓冲器的数据推送到输出流里(看数据量，如果数量大，需要调用flush()方法)
         * 缓冲区可以减轻流的压力，也可以保证数据的安全，
         * 所以建议在调用close()方法之前，调用flush()方法
         */

        out.flush();
        out.close();
    }


    public static void demo3() throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        System.out.println("1.查看文件内容。 2.查看目录。 3.写入内容。 4.删除文件。 5.退出");

        File file = new File("D://fileTest//test01", "test1.txt");
        if(!file.exists()){
            file.createNewFile();
        }

        boolean flag = true;
        while (flag) {
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    //获取输入流
                    InputStream inputStream = new FileInputStream(file);
                    //获取可读数据的大小(单位字节)
                    int available = inputStream.available();

                    byte[] bytes = new byte[available];

                    int temp = -1;

                    int index = 0;
                    while ((temp = inputStream.read()) != -1) {
                        bytes[index] = (byte)temp;
                        index ++;
                    }

                    String str = new String(bytes);
                    System.out.println(str);
                    inputStream.close();
                    System.out.println("1.查看文件内容。 2.查看目录。 3.写入内容。 4.删除文件。 5.退出");
                    break;

                case 2:
                    System.out.println(file.getAbsolutePath());

                    System.out.println("1.查看文件内容。 2.查看目录。 3.写入内容。 4.删除文件。 5.退出");
                    break;

                case 3:
                    OutputStream outputStream = new FileOutputStream(file);
                    System.out.println("请输入要输入要追加的内容");

                    Scanner scanner1 = new Scanner(System.in);
                    String next = scanner1.next();
                    byte[] bytes1 = next.getBytes();
                    for (byte b : bytes1) {
                        outputStream.write(b);
                    }

                    outputStream.flush();
                    outputStream.close();
                    System.out.println("1.查看文件内容。 2.查看目录。 3.写入内容。 4.删除文件。 5.退出");
                    break;

                case 4:
                    boolean delete = file.delete();
                    if(delete){
                        System.out.println("删除成功");
                    } else {
                        System.out.println("删除失败");
                    }
                    System.out.println("1.查看文件内容。 2.查看目录。 3.写入内容。 4.删除文件。 5.退出");
                    break;

                case 5:
                    flag = false;
                    break;
            }
        }
    }
}