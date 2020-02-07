package com.zenroten.javales.collection;

import java.util.*;

/**
 * @author Zr
 * @create 2020-02-06 19:38
 */
public class SetSimpleUser {

    public static void main(String[] args) {
        //Set，集，不能有重复元素，可以有null
        //可能无序或有序
        //HashSet、ThreeSet
        //LinkedHashSet, EnumSet...

        /**
         * 所有的集，都实现了 Set 接口，而 Set 接口继承自 Collection
         * 所以我们可以说，所有的集都实现了 Collection
         * Set 和 Collection 接口的方法是安全一样的，仅是用于语义上的区别
         *
         */
        //创建
        HashSet<String> set = new HashSet<String>();
        System.out.println(set instanceof Set);
        System.out.println(set instanceof Collection);
        System.out.println(set instanceof List);

        //添加
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("G");
        set.add("F");
        set.add("E");

        //遍历 - for循环，因为是无序的，同样的索引值取来的值可能不一样
/*        for (int i = 0; i < set.size(); i++) {
            String str = set.
        }*/

        //遍历 - 迭代器
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }

        //List 有序，指的是按插入顺序来保存元素
        //TreeSet 有序，指的是元素按照一定的规则来排序，实现了 Comparator 接口来比较进行排序的
        TreeSet set2 = new TreeSet();
        set2.add("1");
        set2.add("3");
        set2.add("2");
        set2.add("5");
        set2.add("4");
        set2.add("7");
        set2.add("6");

        int i1 = "4".compareTo("2");
        int i2 = "4".compareTo("4");
        int i3 = "4".compareTo("6");
        System.out.println("大于==" + i1);//结果：2 用前一个数去剪compareTo中的数
        System.out.println("等于==" + i2);//结果：0
        System.out.println("小于==" + i3);//结果：-2

        //遍历
        Iterator iterator1 = set2.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        /*
            如果需要使用 HashSet 的查找元素的高性能
            同时又需要按元素插入顺序来排序，可以使用LinkedHashSet
         */
        LinkedHashSet<String> set3 = new LinkedHashSet<String>();
        // add 添加成功返回 true，如果要添加的元素已经存在，则返回false
        set3.add("1");
        set3.add("3");
        set3.add("2");
        set3.add("5");
        set3.add("4");
        set3.add("7");
        set3.add("6");
        set3.add(null);

        System.out.println("============" + set3.add("6"));//false

        Iterator<String> iterator2 = set3.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

//        remove(元素索引);
//        remove(对象);
        //remove 方法如果成功删除，返回 true ,
        // 如果元素不存在或删除失败，返回 false
        Set<String> removeSet = new HashSet<>();
        removeSet.add("1");
        removeSet.add("2");

        set3.removeAll(removeSet);

        System.out.println(set3.remove("5"));//true
        System.out.println(set3.remove("89"));//false
        System.out.println("set3 === " + set3);


        List<String> list = new ArrayList<>();
        list.add(null);
        list.add("1");
        list.add("2");
        list.add("1");
        list.add(null);
        list.add(null);

        System.out.println("list === " + list);

        boolean remove = list.remove("3");
        System.out.println("remove === " + remove);

        /*
           索引值不在 [0 ~ size()) 区间 "["-包括 "()"-不包括
           抛 IndexOutOfBoundsException 异常
         */
        //list.remove(6);

        //使用元素删除，只删除第一个出现的元素值
        //list.remove("1");

        List<String> removeList = new ArrayList<>();
        removeList.add("1");
        removeList.add(null);
        removeList.add("5");
        /*
           removeAll传入的参数是一个非空的Collection的对象，
           RemoveAll方法会清空满足指定条件的元素，当将条件设置为恒成立时，也会删除所有元素。
          */
        list.removeAll(removeList);

        System.out.println("list === " + list);

    }

}