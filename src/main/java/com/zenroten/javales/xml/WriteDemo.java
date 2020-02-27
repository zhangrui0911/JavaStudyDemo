package com.zenroten.javales.xml;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author Zr
 * @create 2020-02-24 21:47
 */
public class WriteDemo {
    public static void main(String[] args) throws Exception {
        //只管写
        //1.创建文档
        Document document = DocumentHelper.createDocument();//创建一个虚拟的空文档
        //添加一个根节点元素，会返回一个已创建的节点，下面要添加的节点内容都是在根节点下
        Element books = document.addElement("books");//root

        Element book1 = books.addElement("book");
        book1.addAttribute("id", "bk001");
        book1.addCDATA("test word1");
        Element book2 = books.addElement("book");
        book2.addAttribute("id", "bk002");
        book2.addCDATA("test word2");

        //2.创建格式化
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding("UTF-8");

        //3.往外写，创建一个输出流
        String path = ReadDemo.class.getResource("/").getPath();
        FileOutputStream outputStream = new FileOutputStream(new File(path,"books1.xml"));
        XMLWriter writer = new XMLWriter(outputStream, format);

        //将document的值写入到文件中
        writer.write(document);
        writer.close();

    }
}