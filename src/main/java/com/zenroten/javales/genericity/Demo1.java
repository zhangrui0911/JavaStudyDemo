package com.zenroten.javales.genericity;

import java.util.*;

/**
 * @author Zr
 * @create 2020-02-21 14:09
 */
public class Demo1 {
    public static void main(String[] args) {
        List<A> l1 = new ArrayList<A>();
        l1.add(new B());
        A a = l1.get(0);//多态，父类声明，指向子类对象
        if (a instanceof B) {
            B b = (B) l1.get(0);//向下转型
        }

        LinkedList<C> l2 = new LinkedList<C>();
        l2.add(new D());
        l2.add(new E());


        Set<String> s = new HashSet<String>();
        s.add("");
        for (String s1 : s) {
            
        }

        Map<String, Object> m = new HashMap<String, Object>();
        m.put("", 1);
        Object o = m.get("");
        System.out.println(o);

        Set<String> keySet = m.keySet();
        Collection<Object> values = m.values();
    }
}

//实际开发中，不要这么去做，你的项目经理会不高兴
abstract class A{}
class B extends A{}
class B1 extends A{}
interface C{}
class D implements C{}
class E implements C{}