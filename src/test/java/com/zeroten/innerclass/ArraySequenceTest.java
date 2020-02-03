package com.zeroten.innerclass;

import com.zenroten.javales.innerclass.ArraySequence;
import com.zenroten.javales.innerclass.Selector;
import org.testng.annotations.Test;

import javax.annotation.Resource;

/**
 * @author Zr
 * @create 2020-01-31 11:54
 */
public class ArraySequenceTest {
    @Test
    public void testPrint() {
        ArraySequence arraySequence = new ArraySequence(5);
        arraySequence.add(1);
        arraySequence.add(2);
        arraySequence.add(3);
        arraySequence.print();

        arraySequence.add(4);
        arraySequence.add(5);
        arraySequence.add(6);
        arraySequence.print();

/*        Selector impl = arraySequence.selector();
        while (!impl.end()){
            System.out.println(">" + impl.current());
            impl.next();
        }

        System.out.println("倒序遍历");
        Selector impl2 = arraySequence.selectorReverse();
        while (!impl2.end()){
            System.out.println(">" + impl2.current());
            impl2.next();
        }*/

        boolean reverse = false;
        Selector selector;
        if(reverse){
            System.out.println("倒序");
            selector = arraySequence.selectorReverse();
        }else {
            System.out.println("正序");
            selector = arraySequence.selector();
        }

        while (!selector.end()){
            System.out.println(">" + selector.current());
            selector.next();
        }
    }
}