package com.zenroten.javales.util;

import java.util.Arrays;

/**
 * @author Zr
 * @create 2020-01-21 22:55
 */
public class ArrayUtils {

    public static int[] sort(int[] arr){
        for(int one = 0; one < arr.length - 1; one++){
            for(int two = one + 1; two < arr.length; two++){
                if(arr[one] > arr[two]){
                    int temp = arr[one];
                    arr[one] = arr[two];
                    arr[two] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}