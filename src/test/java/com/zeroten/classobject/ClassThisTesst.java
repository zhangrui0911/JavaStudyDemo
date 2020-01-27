package com.zeroten.classobject;

import org.testng.annotations.Test;

/**
 * @author Zr
 * @create 2020-01-26 20:26
 */
public class ClassThisTesst {
    private int index;


    public ClassThisTesst() {
    }

    public void println(String name){
        System.out.println(this.index + ". hello, " + name);
    }

    public void println(int... numbs){
        if (numbs == null) {
            System.out.println("is null");
            return;
        }

        if(numbs.length == 0){
            System.out.println("param length is zero");
            return;
        }

        for (int numb : numbs) {
            System.out.println(numb);
        }


    }

    @Test
    public void test1() {
        ClassThisTesst obj = new ClassThisTesst();
        obj.println("wendy");
    }

    @Test
    public void testPrintParam() {
        println();
        println(1);
        println(1,3,5,6,7,9);

    }
}