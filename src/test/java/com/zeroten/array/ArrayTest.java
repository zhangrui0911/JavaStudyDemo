package com.zeroten.array;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

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

    @Test
    public void testBianLi() {

        //使用三种方式遍历数组 Integer[] arr = {1,2,3,4,5};
        Integer[] arr = {1,2,3,4,5};

        //for循环
        for (int i = 0; i < arr.length; i++) {
//            System.out.println("下标：" + i + ", 存放的值是" + arr[i]);
            System.out.println(String.format("下标： %d , 存放的值是 %d", i,arr[i]));
        }

        //for each
        int index = 0;
        for (Integer integer : arr) {
            System.out.println("第 " + index + "次取到 " + integer);
            index++;
        }

        //将数组转换为一个List集合
        List<Integer> integerList = Arrays.asList(arr);
        //调用List集合的forEach方法，参数前面的是获取的值，-> 后面的是要执行的操作语句，
        // 如果 -> 后面只有一条语句，不用写{}
        //integerList.forEach(val -> System.out.println("值是" + val));
        //如果是多条语句，则需要使用{ }将要执行的语句括起来
        integerList.forEach(val -> {
            System.out.println("值是" + val);
            if(val % 2 == 0){
                System.out.println("  它是一个偶数");
            } else {
                System.out.println("  它是一个奇数");
            }
        });
    }
}