package com.zenroten.javales.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Zr
 * @create 2020-02-10 15:27
 */
public class MapTest {

    /**
     * 内容：Map
     *
     * 散列表相关
     *
     * HashMap
     *  内部实现
     *  常用方法
     *
     * ThreeMap
     *
     */

    /**
     * 散列表 HashTable：也是哈希表
     * 根据数组，可以使用下标的方式来快速随机访问。
     * 数组是散列表的基础
     * 比如：存储一组数据：aaa,cde,bfk,...
     * 如何快速的定位和查找？
     * <p>
     * String[] str;
     * 哈希函数：将关键字转化成一个正整数,
     * int hashFn(Object object);
     * aaa -> 255
     * cde -> 256
     * bfk -> 259
     * <p>
     * str[255] = "aaa";
     * str[256] = "256";
     * str[259] = "259";
     * <p>
     * 哈希函数最理想的状态：
     * 1.哈希结果应该是一个正整数
     * 2.str1 == str2 , hash(str1) == hash(str2)
     * 3.str1 != str2, hash(str2) != hash(str2)
     * <p>
     * 第3种情况基本不可能，不会存在这么一个函数
     * MD5，SHA，CRC这些算法都可能会产生重复的值
     * <p>
     * 哈希冲突：不同的键值，通过哈希函数返回了相同的结果
     * 如何解决哈希冲突：使用链表方式
     * <p>
     * 数组中不直接存储值：存一个自定义对象。
     * Node{
     * Node next;//下一个结点
     * Node prev;//前一个结点
     * Object item;//值
     * }
     * <p>
     * aaa -> "256"
     * aak -> "256"
     * str[256] = {prev:ull, item:aaa, next:null};
     * {prev:ull, item:aak, next:指向 aaa}
     */



    public static void main(String[] args) {
        //HashMap
        //1.构建
        Map<String, Student> map = new HashMap<String, Student>();

        //2.添加
        map.put("001", new Student("张三", 20));
        map.put("002", new Student("李四", 25));

        //3.遍历
        //键值 - 值
        //Map严格上来讲，不是一个集合，但是它可以返回3个视图
        //可以把这三个视图当成集合类来操作
        //3.1 键值视图， set
        //3.2 值视图，Collection
        //3.3 键值对视图，Entry
        Set<String> keys = map.keySet();
        System.out.println(keys);//[001, 002]

        Collection<Student> values = map.values();
        //[Student{name:张三age:20}, Student{name:李四age:25}]
        System.out.println(values);

        Set<Map.Entry<String, Student>> kv = map.entrySet();
        //[001=Student{name:张三age:20}, 002=Student{name:李四age:25}]
        System.out.println(kv);


        /**
         * 001=Student{name:张三age:20}
         * 002=Student{name:李四age:25}
         */
        for(Map.Entry<String, Student> entry : kv){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        /**
         * 001
         * get value:Student{name:张三age:20}
         * 002
         * get value:Student{name:李四age:25}
         */
        for (String key : keys) {
            System.out.println(key);
            Student student = map.get(key);
            System.out.println("get value:"+student);
        }

        //4.删除
        //map.remove("001");
        //System.out.println(map);

        /**
         * list是有序的，删除可以使用下标进行删除
         * set,map 是无序的，不能使用下标的方式删除
         *
         */

        //特殊元素 null
        map.put(null, null);
        System.out.println(map);

        //调用 put方法，会将放进的值返回值的类型
        Student student = map.put("003", new Student("王五", 30));

        /**
         * 判断是否存在
         *  1.key 是否存在 - containsKey
         *  2.value 是否存在 - containsValue,如果值为自定义对象，进行比较需要重写对象的equals方法，才能比较两个对象的值是否相等
         */
        System.out.println(map.containsKey("007"));
        System.out.println(map.containsValue(new Student("张三", 20)));
        if(map.containsKey("007")){

        }

        /**
         * 遍历：可以获取三种视图
         *  1.键值集    keySet()
         *  2.值集合    values()
         *  3.键值对集  entrySet() 如果没有仅使用key或value时，使用此遍历方式
         */
    }

    static class Student{
        String name;
        Integer age;

        public Student(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object object){
            if(object instanceof Student){
                Student stu = (Student) object;
                if(name != null && name.equals(stu.name) &&
                    age != null && age.equals(stu.age)){
                    return true;
                }
            }

            return false;
        }

        @Override
        public String toString(){
            StringBuilder str = new StringBuilder();
            str.append(getClass().getSimpleName());
            str.append('{');
            str.append("name:");
            str.append(name);
            str.append("age:");
            str.append(age);
            str.append('}');

            return str.toString();
        }
    }
}