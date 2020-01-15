package com.zeroten.flow;

import com.zenroten.javales.flow.AgeCheck;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Zr
 * @create 2020-01-15 12:42
 */
public class AgeCheckTest {

    @Test
    public void testAgetCheck() {
        //第一个参数是要调用的类的某个方法，第二个参数是预期返回的结果
        Assert.assertEquals(AgeCheck.getAgeName(6), "儿童");
        Assert.assertEquals(AgeCheck.getAgeName(17), "少年");
        Assert.assertEquals(AgeCheck.getAgeName(40), "青年");


    }
}