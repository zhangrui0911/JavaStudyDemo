package com.zenroten.javales.reflect;

/**
 * @author Zr
 * @create 2020-02-27 17:29
 */
public class Test {
    public static void main(String[] args) {
        //com.zenroten.javales.reflect.A 完全类名

        //1.通过对象来获取，当可以获取对象时，一定要使用此方式
        A a = new A();
        Class c1 = a.getClass();
        //2.通过类来获取
        Class<A> c2 = A.class;
        //3.通过局部变量来获取
        try {
            Class c3 = Class.forName("com.zenroten.javales.reflect.A");
            //创建对象
            //在java中由类创建对象，一定要调用构造方法
            //1.通过类来创建
            /**
             * 注意：这个相当于new了一个对象
             * 实际上是调用空参构造来创建对象
             *
             */
            Object obj = c3.newInstance();
            //将一个类转换成另外一个类的实例，如果转换异常会抛出ClassCastException异常
            Class<? extends A> b = B.class.asSubclass(A.class);
            System.out.println(b.getTypeName());
            //效果等同于
            System.out.println(b.newInstance() instanceof A);

            /**
             * 相当于多态，实现某个类，
             * 来获取这个类所实现的接口的对象
             */
            I i = I.class.cast(new A());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }


    }
}

class A implements I{
    public A() {
        System.out.println("调用无参构造器");
    }
}


class B extends A{

}

interface I{

}