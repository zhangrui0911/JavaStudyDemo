package com.zenroten.javales.class06.demo1;

/**
 * @author Zr
 * @create 2020-03-13 20:08
 */
public class Test {
    public static void main(String[] args) {
        //对象：数据
        //对象的类型  对象名 = new 构造（对象的实体）
        /**
         * Dog dog：对象的名字
         * new Dog()：这个才是对象
         */
        //类名(对象的类型) 对象名(名字随便起，符合变量命名规则就可以) = 对象具体的值(new + 构造)
        Dog dog = new Dog();//也是一种变量（引用类型变量）

        //给对象的属性赋值
        dog.id = 1;
        dog.name = "ybb";
        dog.age = 18;

        //从对象中获取属性值
        System.out.println(dog.id);
        System.out.println(dog.name);
        System.out.println(dog.age);

        //操作对象前，一定要确保对象new过了
        //直接操作没有new的对象，会报NullPointerException 空指针异常
       /* Dog dog1 = null;
        System.out.println(dog1.id);*/

       //调用方法
        dog.eat();

    }
}