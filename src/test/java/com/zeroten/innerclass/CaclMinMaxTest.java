package com.zeroten.innerclass;

import com.zenroten.javales.innerclass.CaclMinMax;
import com.zenroten.javales.innerclass.Pair;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * @author Zr
 * @create 2020-01-30 21:24
 */
public class CaclMinMaxTest {
    @Test
    public void testCalc() {
        Integer[] calc = CaclMinMax.calc(new int[]{2, 3, 4, 5, 7, 8, 9, 0, 20, 39, 1, -2});
        System.out.println(Arrays.toString(calc));
    }

    /**
     * 调用静态内部类
     *
     */
    @Test
    public void testCalc2() {
        int[] params = {2, 3, 4, 5, 7, 8, 9, 0, 20, 39, 1, -2};
        CaclMinMax.Pair pair = CaclMinMax.calc2(params);
        System.out.println("最大值：" + pair.getMaxValue());
        System.out.println("最小值：" + pair.getMinValue());

    }
}