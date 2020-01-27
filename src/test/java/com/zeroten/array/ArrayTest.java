package com.zeroten.array;

import org.testng.annotations.Test;
import sun.security.util.Length;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

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


    @Test
    public void testCopy() {
        Integer[] arr1 = {1,2,3,4,5};
        Integer[] arr2 = {6,7,8,9,10};

        //拷贝数组arr1的前3个元素
        Integer[] arr3 = Arrays.copyOf(arr1, 3);
        System.out.println(Arrays.toString(arr3));

        //拷贝数组 arr1 的后 3 位的元素以一个新的数组
        //第一个参数要拷贝的原数组，第二个参数是开始拷贝的下标，第三个参数是拷贝到第几个元素，但不包括截止那个元素
        //因为源码中是用第三个参数减第二个参数，做为新数组的长度
        Integer[] arr11 = Arrays.copyOfRange(arr1, arr1.length - 3, arr1.length);
        System.out.println(Arrays.toString(arr11));

        //拷贝数组 arr1 的第 1 位到第 3 位的元素(不包括第3个)
        Integer[] arr12 = Arrays.copyOfRange(arr1, 0, 2);
        System.out.println(Arrays.toString(arr12));
        //拷贝数组 arr2 的后 3 位到 arr1 到后 3 位
        //参数一：要拷贝的源数组1
        //参数二：要拷贝的开始位置坐标
        //参数三：目标数组
        //参数四：将拷贝的元素存放到目标数组的第几位开始
        //参数五：拷贝的长度
        System.arraycopy(arr2, arr2.length - 3, arr1, arr1.length - 3, 3);
        System.out.println(Arrays.toString(arr1));

    }

    /**
     * 定义一个大小为 10 的 int 数组， 并将数组全部初始化为指定的值 5，打印数组；
     * 然后再将数组后 3 位赋值为 3，再次打印
     */
    @Test
    public void testFill() {
        int[] arr = new int[10];
        /*for (int i = 0; i < arr.length; i++) {
            arr[i] = 5;
        }*/
        //对数组的所有值进行赋值
        Arrays.fill(arr, 5);

        System.out.println(Arrays.toString(arr));

/*        for (int i = arr.length - 3; i < arr.length; i++) {
            arr[i] = 3;
        }*/
        //将数组中指定的位置替换成指定的值
        Arrays.fill(arr, arr.length - 3, arr.length, 3);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 定义一个大小为100的int数组，
     * 随机给每一位赋值一个0~100之间的数值，
     * 然后对该数组进行排序
     * 并打印结果
     */
    @Test
    public void testSort() {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    /**
     * 定义一个二维数组
     * 第一维表示用户
     * 第二维表示用户的具体信息（1.编码，2.姓名，3.性别，4.年龄）
     * 定义赋值并打印
     */
    @Test
    public void testDuoWeiShuZhu() {
        String[][] users = new String[5][];
        users[0] = new String[4];

        users[0][0] = "001";
        users[0][1] = "张三";
        users[0][2] = "男";
        users[0][3] = "23";

        users[1] = new String[4];
        users[1][0] = "002";
        users[1][1] = "李四";
        users[1][2] = "女";
        users[1][3] = "30";

        //使用for循环
        /*for (int i = 0; i < users.length; i++) {
            System.out.println(Arrays.toString(users[i]));
        }*/

        //使用for each
        /*for (String[] user : users) {
            System.out.println(Arrays.toString(user));
        }*/

        //使用Leambda表达式打印
        Arrays.asList(users).forEach(user -> System.out.println(Arrays.toString(user)));

    }

    /**
     * 给定一个整数数组nums和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
     * 你可以假设每种输入只会对一个答案。但是，你不能重复利用这个数组中同样的元素。
     * 给定： nums = [2,7,11,15]，target = 9
     *
     */
    @Test
    public void testTwoSum() {
        int[] nums = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum2(nums, target)));
    }

    public int[] twoSum(int[] nums, int target){
        int[] result;
        for(int index = 0; index < nums.length -1; index++){
            for(int secondIndex = index + 1; secondIndex < nums.length; secondIndex++){
                if(nums[index] + nums[secondIndex] == target){
                    return new int[]{index, secondIndex};
                }
            }
        }
        return null;
    }


    public int[] twoSum2(int[] nums, int target){
        System.out.println("传入数组：" + Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("排序数组：" + Arrays.toString(nums));

        for(int index = 0; index < nums.length - 1; index++){
            for(int secondIndex = index + 1; secondIndex < nums.length; secondIndex++){
                if(nums[index] < target){
                    if(nums[index] + nums[secondIndex] == target){
                        return new int[]{index, secondIndex};
                    }
                }
            }
        }

        return null;
    }

}