package com.zenroten.javales.genericity;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zr
 * @create 2020-02-21 21:36
 */
public class Demo2 {
    public static void main(String[] args) {
        MyMap<String,Object> m = new MyHashMap<String, Object>();
    }
}

//泛型接口
interface MyMap<P, E>{
    public void put(P p, E e);
    public E get(P p);
}

//泛型类
class MyHashMap<P, E> implements MyMap<P, E>{

    private Map m = new HashMap();

    @Override
    public void put(P p, E e) {//这个不是泛型方法，只是把泛型做为参数
        m.put(p, e);
    }

    @Override
    public E get(P p) {
        return (E) m.get(p);
    }
}