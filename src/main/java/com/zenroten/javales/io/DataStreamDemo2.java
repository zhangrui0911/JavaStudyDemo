package com.zenroten.javales.io;

import java.io.*;

/**
 * @author Zr
 * @create 2020-02-17 11:56
 */
public class DataStreamDemo2 {
    public static void main(String[] args) throws Exception {
        File f = new File("d:\\person.o");
        DataInputStream input = new DataInputStream(
                new FileInputStream(f)
        );

        System.out.println(input.readInt());
        System.out.println(input.readUTF());
        System.out.println(input.readInt());
        System.out.println(input.readDouble());

        input.close();
    }
}