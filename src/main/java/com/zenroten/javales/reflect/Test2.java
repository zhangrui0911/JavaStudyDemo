package com.zenroten.javales.reflect;

import java.lang.reflect.Field;

/**
 * @author Zr
 * @create 2020-02-28 12:39
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        //1.获取属性（正常情况下属性都是私有的）
        //2.从类当中获取属性
        Class c = Person.class;
        Object obj = c.newInstance();

        //获取所有公有属性值 public
        Field hight = c.getField("hight");
        System.out.println(hight);

        //获取所有属性对象
        Field file1 = c.getDeclaredField("id");
        System.out.println(file1);
        //先要设置是否允许通过反射访问私有目标
        file1.setAccessible(true);
        //要给哪个对象的某个属性赋值，就必须先提供该对象
        file1.set(obj, 1);
        //取值
        Object o = file1.get(obj);
        System.out.println(o);

        Field[] fields1 = c.getFields();//获取所有公有属性
        for (Field field : fields1) {
            System.out.println(field);
        }


        Field[] fields2 = c.getDeclaredFields();//获取所有属性对象

        for (Field field : fields2) {
            System.out.println(field);

        }
    }
}