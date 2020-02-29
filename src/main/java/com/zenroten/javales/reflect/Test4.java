package com.zenroten.javales.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Zr
 * @create 2020-02-28 15:54
 */
public class Test4 {
    public static void main(String[] args) throws Exception {
        //使用反射，获取构造，并创建对象
        Class<?> c = Person.class;

        //通过参数列表来区分构造
        Constructor c1 = c.getConstructor();
        Constructor c2 = c.getConstructor(Integer.class);
        Constructor c3 = c.getConstructor(Integer.class, String.class, int.class);

        //获取所有的构造
        Constructor<?>[] cs = c.getConstructors();
        for (Constructor<?> constructor : cs) {
            System.out.println(constructor);
        }

        //
        Annotation[][] pas = c3.getParameterAnnotations();
        System.out.println(pas.length);
        for (int i = 0; i < pas.length; i++) {
            System.out.println(pas[i].toString());
            for (int j = 0; j < pas[i].length; j++) {
                System.out.println(pas[i][j]);
            }
        }

        //构造创建对象
        Object obj1 = c1.newInstance();
        Object obj2 = c2.newInstance(3);
        Object obj3 = c3.newInstance(2, "Zr", 5);


        /**
         * 1.假设不知道对应属性的数据类型
         * 2.假设不知道对应属性叫什么
         * 3.赋值
         * 4.在不确定数据类型的情况下，字符串如何赋值到具体的数值类型
         *
         */
        String id = "1";
        String name = "ZR";
        String age = "18";
        String clazz = "com.zenroten.javales.reflect.Person";

        /**
         * 思路：
         * 1.通过名字获取同名属性
         * 2.获取了同名属性，即获取了该属性类型
         * 3.判断数值类型是否是数值类型
         *
         */
        Class<?> pc = Class.forName(clazz);//获取Class
        Object obj = pc.newInstance();//创建对象
        Field f = pc.getDeclaredField("age");//通过遍历获取到的参数名，可以得到属性对象
        System.out.println(f.getType());
        /**
         * 判断是否属于Number类型
         * asSubclass() 方法将一个类转换成另一个类的实例，
         * 如果转换异常会抛ClassCastException异常。
         * 经常使用该方法来判断一个类是否是另外一个类的实例。
         * 问题：如何判断是否为基本数据类型
         */
        //Class<? extends Number> number = f.getType().asSubclass(Number.class);
        Class<? extends Number> number = null;
        if(number != null) {
            //获取到该类的type ----> java.lang.Integer
            System.out.println(number);

            String methodName = "set" + (f.getName().substring(0, 1).toUpperCase())
                    + (f.getName().substring(1));//获取set方法的名称

            Method m = pc.getMethod(methodName, f.getType());//获取该方法

            //痛点：如何把String类型转换成Integer类型
            m.invoke(obj, number.getConstructor(String.class).newInstance(id));

            System.out.println(obj);
        } else {
            Field age1 = pc.getDeclaredField("age");
            if(age1.getType() == int.class){
                System.out.println("获取的类型：" + age1.getType());
            }
        }
    }
}