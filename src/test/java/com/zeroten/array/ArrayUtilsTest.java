package com.zeroten.array;

import com.zenroten.javales.util.ArrayUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Zr
 * @create 2020-01-21 22:57
 */
public class ArrayUtilsTest {

    @Test
    public void testSort() {
        int[] arr = {33,2,35,78,9,1,7,44,39};
        Assert.assertEquals(ArrayUtils.sort(arr), new int[]{1,2,7,9,33,35,39,44,78});
    }
}