package com.zenroten.javales.io;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Zr
 * @create 2020-02-17 11:56
 */
public class DataStreamDemo {
    public static void main(String[] args) throws Exception {
        /**
         * 这是个文件，用于保存"内存数据"
         * 把这个文件当成一个持久化的对象
         */
        File f = new File("d:\\person.o");

        if(!f.exists()){
            f.createNewFile();
        }

        DataOutputStream out = new DataOutputStream(
                new FileOutputStream(f));
        out.writeInt(1);
        out.writeUTF("zr");
        out.writeInt(8);
        out.writeDouble(50000.61);
        out.flush();
        out.close();
    }
}