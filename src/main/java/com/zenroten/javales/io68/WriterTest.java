package com.zenroten.javales.io68;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * @author Zr
 * @create 2020-02-18 13:27
 */
public class WriterTest {
    public static void main(String[] args) throws Exception{
        writeTest();
    }


    public static void writeTest() throws Exception{
        //Reader reader = new FileReader("d:\\fileTest\\test02\\test1.txt");
        Writer writer = new FileWriter("d:\\fileTest\\test02\\test3.txt");

        /*int temp = 0;
        while ((temp = reader.read()) != -1) {
            writer.write(temp);
        }*/

        writer.write(20320);
        writer.write(22909);

        char[] chars = {'你','好','J','A','V','A'};
        writer.write(chars);

        writer.write(chars, 2, 2);

        String str = "Hello World!";
        writer.write(str);
        writer.write(str, 6, 3);

        //reader.close();
        writer.flush();
        writer.close();

    }
}