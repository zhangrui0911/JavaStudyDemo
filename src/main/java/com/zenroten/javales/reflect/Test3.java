package com.zenroten.javales.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Zr
 * @create 2020-02-28 14:15
 */
public class Test3 {
    public static void main(String[] args) throws Exception {
        //反射操作方法
        Class c = Person.class;
        //创建一个对象实例
        Object obj = c.newInstance();

        //假设循环到该属性，假设不知道属性名
        //返回属性的对象
        Field f = c.getDeclaredField("id");
        String fieldName = f.getName();
        System.out.println(fieldName);

        //setId
        String methodName = "set" + (fieldName.substring(0,1).toUpperCase()) + fieldName.substring(1);
        System.out.println(methodName);

        //获取属性类型
        System.out.println(f.getType());
        /**
         * 根据方法名获取该方法实例
         * 第一个参数是方法名称
         * 第二个参数是该方法的参数列表，这里传进去的就是该方法参数的参数类型
         */
        Method setMethod = c.getMethod(methodName, f.getType());

        /**
         * 执行获取到的方法，使用invoke方法。
         * 第一个参数是操作反射方法的对象
         * 第二个参数是调用方法时，需要传入的实参，可以是多个，使用逗号分隔开
         */
        setMethod.invoke(obj, 3);

        //获取getter方法
        methodName = "get" + (fieldName.substring(0,1).toUpperCase()) + fieldName.substring(1);
        Method getMethod = c.getMethod(methodName);
        //获取方法返回值
        Object r = getMethod.invoke(obj);
        System.out.println(r);
    }
}