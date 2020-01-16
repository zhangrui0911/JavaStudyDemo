package com.zeroten.string;

import com.zenroten.javales.util.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Zr
 * @create 2020-01-16 23:42
 */
public class StringUtilsTest {

    //去掉字符串 开头/结尾/中间的空格(不使用trim方法)


    @Test
    public void testTrimAll() {

        String hello = "hello";
        Assert.assertEquals(StringUtils.trimAll(" hello"), hello);
        Assert.assertEquals(StringUtils.trimAll("    hello   "), hello);
        Assert.assertEquals(StringUtils.trimAll("hello   "), hello);
        Assert.assertEquals(StringUtils.trimAll("hel  lo"), hello);
        Assert.assertEquals(StringUtils.trimAll(" hel    lo"), hello);
        Assert.assertEquals(StringUtils.trimAll(" he  ll  o  "), hello);

    }

    @Test
    public void testReverse() {
        Assert.assertEquals(StringUtils.reverseAll("123"), "321");
        Assert.assertEquals(StringUtils.reverseAll("abc"), "cba");
    }
}