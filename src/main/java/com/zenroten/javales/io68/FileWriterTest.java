package com.zenroten.javales.io68;

import java.io.*;

/**
 * @author Zr
 * @create 2020-02-18 22:04
 */
public class FileWriterTest {
    public static void main(String[] args) {
        OutputStream outputStream = null;
        OutputStreamWriter outputStreamWriter = null;
        Writer writer = null;

        try {
            outputStream = new FileOutputStream("d://fileTest//test02//test6.txt");
            outputStreamWriter = new OutputStreamWriter(outputStream);
            writer = outputStreamWriter;

            String str = "111";
            char[] chars = str.toCharArray();
            writer.write(chars);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                writer.close();
                outputStreamWriter.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}