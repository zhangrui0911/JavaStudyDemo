package com.zenroten.javales.collection;

import java.util.*;

/**
 * @author Zr
 * @create 2020-02-06 13:21
 */
public class ListSimpleUser {
    private static void printAllElement(List<String> list){
        System.out.println("元素个数：" + list.size());

        //遍历 - for循环使用元素索引的方式
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);

            if(i > 0 ){
                System.out.print(", ");
            }
            System.out.print(str);
        }

        System.out.println();
        //List删除某个元素值，可以使用下标值，也可以使用具体元素值
//        list.remove(1);
//        list.remove("F");
//
//        System.out.println(list);

        //遍历 - 使用迭代器方式
        Iterator<String> iterator = list.iterator();
        //迭代器的位置是在元素之间，
        //存在 n 个元素的列表，迭代器的位置，可能存在n+1个
        //获取迭代器后，迭代器的位置在第一个元素之前
        //未调用next()方法时，调用remove()方法会抛 IllegalStateException 异常
        //因为remove()方法删除的是调用 next() 方法时返回的元素(越过的元素)
        //iterator.remove();
/*        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());*/

        /**
         * 当迭代器达到最后一个元素之后时，
         * 再调用next()方法，会抛 java.util.NoSuchElementException 异常
         */
        //System.out.println(iterator.next());

        while (iterator.hasNext()){
            //next 方法，两个作用
            //1.将迭代器的位置移动至下一个位置
            //2.同时返回越过的元素
            String str = iterator.next();
            System.out.println(str);

        }

    }


    public static <CustomClass> void main(String[] args){
        //集合分为两大类：
        // 1.单个元素的序列，全部都实现了Collection接口
        // 1.1 List：有序的，按照接入顺序排序，可以有重复的元素，可以包含null
        // 1.2 Set：集。不可以有重复元素，可以包含null
        // 1.3 Queue：队列，按一定规则进行添加/删除

        //可以通过<>括号来指定列表中要存放的元素类型
        //如果add 添加了不同的类型的元素，在编译阶段就会报错
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("C");
        list.add("B");
        list.add("F");

        printAllElement(list);


        List<String> list2 = new LinkedList<String>();
        list2.add("1");
        list2.add("3");
        list2.add("2");
        list2.add("4");
        list2.add("6");
        list2.add("7");
        list2.add("5");

        printAllElement(list2);

        List list3 = new ArrayList();
        list3.add(1);
        list3.add("字符串");
        list3.add((new ListSimpleUser()).new CustomClass());
        list3.add(new Date());

        //如果需要进行强制转换时，需要使用 instanceof 来判断该变量的实际类型
        for (int i = 0; i < list3.size(); i++) {
            Object obj = list3.get(i);
            if(obj instanceof String){
                String str = (String)list3.get(i);
                System.out.println("字符串类型："+str);
            } else if(obj instanceof Integer){
                Integer integer = (Integer)list3.get(i);
                System.out.println("数值类型："+integer);
            } else if(obj instanceof Date){
                Date date = (Date)list3.get(i);
                System.out.println("日期类型："+date);
            } else {
                System.out.println("不支持的类型：" + obj.getClass().getName());
            }
        }
    }

    class CustomClass{

    }

}

