package com.zeroten.array;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * @author Zr
 * @create 2020-01-17 13:43
 */
public class ArrayTest {
    @Test
    public void testArrayDeclare() {
        int[] arr1;
        String[] arr2;
        int arr3[];
        String arr4[];

    }

    @Test
    public void testFuZhi() {
        int[] arr1 = new int[5];
        //[0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(arr1));

        boolean[] arr2 = new boolean[3];
        //[false, false, false]
        System.out.println(Arrays.toString(arr2));

        String[] arr3 = new String[3];
        //[null, null, null]
        System.out.println(Arrays.toString(arr3));

        Object[] arr4 = new Object[5];
        //[null, null, null, null, null]
        System.out.println(Arrays.toString(arr4));

        int[] arr5;
        System.out.println();
        arr5 = new int[5];
        System.out.println(Arrays.toString(arr5));

        int[] arr6 = new int[]{1,2,3};
        //arr6 === [1, 2, 3]
        System.out.println("arr6 === " + Arrays.toString(arr6));

        int[] arr7 = {1,2,3};
        //arr7 === [1, 2, 3]
        System.out.println("arr7 === " + Arrays.toString(arr7));

        String[] arr8 = {"字符串1", null, "", "字符串2"};
        //arr8 === [字符串1, null, , 字符串2]
        System.out.println("arr8 === " + Arrays.toString(arr8));

        Integer[] arr9 = {2,9,7,null,0,1};
        //arr9 === [2, 9, 7, null, 0, 1]
        System.out.println("arr9 === " + Arrays.toString(arr9));
    }
}