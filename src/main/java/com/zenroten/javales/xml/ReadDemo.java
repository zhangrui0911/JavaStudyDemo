package com.zenroten.javales.xml;

import com.sun.org.apache.xml.internal.resolver.readers.SAXCatalogReader;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.FileInputStream;
import java.sql.SQLOutput;
import java.util.List;

/**
 * @author Zr
 * @create 2020-02-24 21:46
 */
public class ReadDemo {

    public static void main(String[] args) throws Exception {
        //用相对路径获取地址，不建议使用
        //System.out.println(new File("books.xml").getCanonicalPath());

        //获取当前用户的根路径
        ///System.out.println(System.getProperty("user.dir"));
        //获取classPath的路径
        //System.out.println(System.getProperty("java.class.path"));

        //1.从src往后找，如果找不到返回null
        /*String path = ReadDemo.class.getResource("/books.xml").getPath();
        System.out.println(path);*/
        //2.从src往后找，如果找不到返回null
        /*String path1 = ReadDemo.class.getClassLoader().getResource("books.xml").getPath();
        System.out.println(path1);*/

        //3.如何处理路径中的空格
        /*String demoPath = "D:\\Program%20Files";
        System.out.println(demoPath);

        demoPath = demoPath.replaceAll("%20", " ");
        System.out.println(demoPath);*/

        //开始解析
        //1.获取解析器
        SAXReader reader = new SAXReader();
        String path = ReadDemo.class.getResource("/books.xml").getPath();

        //2.获取文档
        Document document = reader.read(new FileInputStream(new File(path)));
        //获取节点类型
        //System.out.println(document.getNodeType());
        //获取节点名称
        //System.out.println(document.getNodeTypeName());

        //3.获取根目录
        Element rootElement = document.getRootElement();
        //System.out.println(rootElement.getNodeType());
        //System.out.println(rootElement.getNodeTypeName());

        //4.获取子元素
        Element element = rootElement.element("book");//根据节点名获取第一个该名称的节点
        //List<Element> elements = rootElement.elements();//获取所有子标签节点
        List<Element> elementList = rootElement.elements("book");//获取所有该名称的子标签

        for (Element book : elementList) {
            //book.attribute();//根据属性名获取属性
            //book.attributes();//获取所有的属性

            Attribute attribute = book.attribute("id");
//            System.out.println(attribute.getName());
//            System.out.println(attribute.getNodeType());
//            System.out.println(attribute.getNodeTypeName());
//            System.out.println(attribute.getValue());

//            String id = book.attributeValue("id");//获取指定名的属性值
//            System.out.println(id);

            //解析子元素
            List<Element> bookChildEle = book.elements();
            for (Element bc : bookChildEle) {
                System.out.println(bc.getName());
                System.out.println(bc.getText());//获取不去空格的文本
                //System.out.println(bc.getTextTrim());//获取去掉空格的文本

            }
        }

    }

}






