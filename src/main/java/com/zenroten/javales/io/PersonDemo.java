package com.zenroten.javales.io;

import java.io.*;

/**
 * @author Zr
 * @create 2020-02-17 15:38
 */
public class PersonDemo {
    public static void main(String[] args) throws Exception {
        inputStream();
    }


    /**
     * 序列化：将对象序列化成二进制
     */
    public static void outputStream() throws Exception {
        Person person = new Person();
        person.setId(1).setName("张三").setAge(20);

        //直接把内存数据序列化到文件里
        File file = new File("d:\\person.o2");
        if(!file.exists()){
            file.createNewFile();
        }

        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(file)
        );

        out.writeObject(person);
        out.flush();
        out.close();
    }


    /**
     * 反序列化：将二进制，反序列化成对象
     */
    public static void inputStream() throws Exception{
        File file = new File("d:\\person.o2");
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(file)
        );

        Object o = in.readObject();
        if(o instanceof Person){
            Person person = (Person) o;
            System.out.println(person);
        }
        in.close();
    }
}