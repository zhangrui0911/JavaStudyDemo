package com.zeroten.classobject;

import org.testng.annotations.Test;

/**
 * @author Zr
 * @create 2020-01-26 22:38
 */
public class ClassAccess2 {

    @Test
    public void testPkgAccess() {
        ClassAccess ca = new ClassAccess();
        System.out.println(ca.pub);
        System.out.println(ca.getPub());

        System.out.println(ca.pro);
        System.out.println(ca.getPro());

        System.out.println(ca.def);
        System.out.println(ca.getDef());

//        System.out.println(ca.pri);
//        System.out.println(ca.getPri());


    }
}