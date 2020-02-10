package com.zenroten.javales.list;

import com.sun.deploy.panel.ITreeNode;

import java.util.*;

/**
 * @author Zr
 * @create 2020-02-07 17:15
 */
public class ListStudy {

    /**
     * List 主要有两种：ArrayList 和 LinkedList
     *  ArrayList：内部是使用数组来实现的
     *  LinkedList：内部使用的是一个双向链表来实现
     *
     *  创建：无参数构建； 有参数构建：1.指定容量大小；2.复制存在的List来创建
     *  添加：1.头插；2.尾插； 3.中间插入
     *  删除：1.头删；2.尾删； 3.中间删除
     *  遍历：
     *      1.使用for循环
     *      2.使用迭代器 Iterator，ListIterator是Iterator的子类
     *        Iterator只能向前移动，ListIterator只适用于List，可以双向移动
     *      3.使用迭代器对 List 进行添加、删除操作
     *      4.迭代器使用的注意事项：在使用迭代器列表进行操作时，
     *          原对象不能发生结构性变化(add/remove等)，否则迭代器会抛异常。通过modCount计数来实现的
     *          如果原对象发生结构性变化，需要重新获取迭代器
     *
     *  底层实现原理及主要JDK源码：内部存储结构、添加/删除/遍历操作的流程
     *
     *  对 List 进行排序 ：冒泡、插入、选择
     *
     */

    //验证ArrayList扩容

    /**
     *
     * @param list   要添加的list
     * @param count  要添加的次数
     * @param number 每次添加的数值
     */
    public static void addNumberToList(List<Integer> list, int count, int number){
        //启始时间
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            list.add(number);
            number++;
        }

        //结束时间
        long end = System.currentTimeMillis();
        System.out.println("消耗时间：" + (end - start) + "ms");
    }


    private static void studyArrayListOp(){
        int count = 1000000;
        //创建ArrayList时，如果未指定窗口大小，则会创建一个空的数组。
        //只有当第一次调用 add 方法时，才会将数组容量设置为默认的大小DEFAULT_CAPACITY=10.
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(2);

        //list1.add(2,100);
        //list1.remove(0);

        System.out.println("list1 == " + list1);

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        System.out.println("forEach");
        for (Integer integer : list1) {
            System.out.println(integer);
        }

        System.out.println("Iterator");
        Iterator<Integer> iterator = list1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }

        //addNumberToList(list1, count, 1);

        /**
         * 如果在创建 ArrayList 时，能预估数据规模
         * 我们就可以指定一个初始容量大小，以减少扩容操作
         */
/*        List<Integer> list2 = new ArrayList<>(100);

        for (Integer integer : list1) {
            list2.add(integer);
        }

        System.out.println("list2 == " + list2);*/

        List<Integer> list2 = new ArrayList<>(count);
        //addNumberToList(list2, count, 1);

        /**
         * 可以使用另外一个list集合为基础，创建一个新的集合
         */
        List<Integer> list3 = new ArrayList<>(list1);

        //System.out.println("list3 == " + list3);

        /**
         * 数组是有容量大小限制，当 add 操作时，如果数组已满，就会引发扩容
         *  1.计算新的容量大小：容量原来的 1.5 倍
         *  2.按新的容量大小创建一个新的数组
         *  3.将旧的数组里的元素全部复制到新创建的数组中
         *  4.丢弃旧的数组
         *
         */
    }

    private static void listIterator(){

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        ListIterator<String> listIterator = list.listIterator();
        //向前是否有元素
        System.out.println("hasPrevious == " + listIterator.hasPrevious());
        //身后是否有元素
        System.out.println("hasNext == " + listIterator.hasNext());
        //向前一位元素的索引值
        System.out.println("previousIndex == " + listIterator.previousIndex());
        //向后一位元素的索引值
        System.out.println("nextIndex == " + listIterator.nextIndex());

        System.out.println("next == " + listIterator.next());

        //向前是否有元素
        System.out.println("hasPrevious == " + listIterator.hasPrevious());
        //身后是否有元素
        System.out.println("hasNext == " + listIterator.hasNext());
        //向前一位元素的索引值
        System.out.println("previousIndex == " + listIterator.previousIndex());
        //向后一位元素的索引值
        System.out.println("nextIndex == " + listIterator.nextIndex());

        //set方法：改变上一次调用next()方法返回的值
        listIterator.set("A-Update");
        System.out.println(list);//[A-Update, B, C]

        //add方法：在当前迭代器所在位置的前面添加一个元素
        listIterator.add("A-New");
        System.out.println(list);//[A-Update, A-New, B, C]

        //再次查看当前迭代器所在位置前面的元素值，此操作是向前跳一位，同时返回跳过元素的值
        System.out.println("previous == " + listIterator.previous());//A-New

        listIterator.set("A-Update2");
        System.out.println(list);//[A-Update, A-Update2, B, C]

        //remove：删除迭代器上一次跳跃的元素值,上面的操作向前跳一位，返回A-Update2元素值
        listIterator.remove();
        System.out.println(list);//[A-Update, B, C]


        System.out.println("next == " + listIterator.next());//B
        listIterator.remove();
        //向后跳一位，返回元素值为B，所以在调用remove()方法时，将B元素删除
        System.out.println(list);//[A-Update, C]

        /**
         * 迭代器操作元素的时候：
         * set 和 remove 方法和迭代器的状态有关，更新或删除的是上一次调用 next 或者 previous 方法返回的元素
         * add 只和迭代器的位置有关，在当前迭代器位置之前添加元素
         */
    }


    public static void studyLinkedList(){
        //链表，创建时不需要指定容量大小，因为它没有大小限制
        List list1 = new LinkedList();
        list1.add("A");
        list1.add("B");

        System.out.println(list1);

        List list2 = new LinkedList(list1);
        System.out.println(list2);

        //其余操作与ArrayList都是一样的
    }





    public static void main(String[] args) {
        //studyArrayListOp();

        //listIterator();

        //studyLinkedList();

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);

        listOpTime(arrayList);

        System.out.println(" ==================== ");
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);

        listOpTime(linkedList);
    }

}