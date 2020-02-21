package com.zenroten.javales.io68;

import java.io.*;

/**
 * @author Zr
 * @create 2020-02-18 19:35
 */
public class FileReaderTest {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = new FileInputStream("d://fileTest//test02//test1.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

        Reader reader = inputStreamReader;
        int temp = 0;
        while ((temp = reader.read()) != -1) {
            System.out.println(temp);
        }
        reader.close();
        inputStreamReader.close();
        inputStream.close();

    }
}