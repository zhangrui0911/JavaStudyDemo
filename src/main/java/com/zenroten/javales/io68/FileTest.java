package com.zenroten.javales.io68;

import java.io.File;
import java.io.IOException;

/**
 * @author Zr
 * @create 2020-02-15 12:39
 */
public class FileTest {

    public static void main(String[] args) throws IOException {
/*

        String pathName = "d://fileTest//test01//test.txt";
        File file = new File(pathName);
        //判断文件是否存在
        System.out.println(file.exists());
        //做非空验证，在以后的开发中，也要注意，避免因空值而抛异常
        if (file.exists()) {
            //获取文件名
            String name = file.getName();
            System.out.println("文件名是：" + name);

            //获取绝对路径
            String parentPath = file.getParent();
            System.out.println("文件所在的目录 ：" + parentPath);

            //获取文件所在目录对应的File对象
            File parentFile = file.getParentFile();
            System.out.println(parentFile);

            isFile(parentFile);
            isFile(file);

            System.out.println("文件长度：" + file.length());
        }
*/

        /*String dirPath = "d://fileTest//test02//test1.txt";
        File dirFile = new File(dirPath);
        System.out.println(dirFile.mkdirs());*/

        String filePath = "d://fileTest//test02//test2.txt";
        File fileFile = new File(filePath);

        //System.out.println(fileFile.createNewFile());

        //System.out.println(dirFile.delete());
        //System.out.println(fileFile.delete());
        File file2 = new File("d://fileTest//test01//testRename.txt");
        System.out.println(fileFile.renameTo(file2));
    }


    public static void isFile(File file){
        boolean flag = file.isDirectory();
        if (flag) {
            System.out.println(file + "是一个目录");
        }else {
            System.out.println(file + "不是一个目录");
        }

        boolean flag2 = file.isFile();
        if (flag2) {
            System.out.println(file + "是一个文件");
        }else {
            System.out.println(file + "不是一个文件");
        }
    }
}