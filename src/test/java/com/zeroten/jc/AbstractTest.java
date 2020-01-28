package com.zeroten.jc;

import org.testng.annotations.Test;

/**
 * @author Zr
 * @create 2020-01-28 23:12
 */
public class AbstractTest {

    @Test
    public void testPrint() {
        Person p1 = new Teacher();
        System.out.println(p1.getDescrition());

        Person p2 = new Student();
        System.out.println(p2.getDescrition());
    }
}