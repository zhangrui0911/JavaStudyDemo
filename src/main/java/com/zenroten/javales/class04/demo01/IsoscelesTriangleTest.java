package com.zenroten.javales.class04.demo01;

/**
 * @author Zr
 * @create 2020-03-11 19:10
 */
public class IsoscelesTriangleTest {
    /**
     * 一：设计思路：
     * 1、空心的等腰三角形，用*作为三角形的边，用空格做格式控制。
     * 2、第一行输出一个*号，且要放在正中央，具体位置需要根据三角形的高度来确定。
     * 3、因为是等腰三角形，所以每一行由*号组成的有效字符串长度比上一行多2个。
     * 4、综合2、3，该三角形的*号间的有效字符串长度，按1、3、5、7...规律变化
     * 5、所以，第一行输出的*号位置由三角形的高决定，设高度为h，则第一行*号位置为第（2*h-1）/2+1，
     * 简化后为h（因为单数/2后的0.5在int型变量计算中被忽略）。
     * 6、空心的实现中，从第二行输出*号后开始插入空格，个数每行加2，直到最后一行，不包含最后一行。
     * 二：实现方法
     * 1、定义三角形的高，改变该值，可以改变三角形的大小。
     * 2、根据高度，将*号放在对应h位置，用空格做格式控制，空格个数每行-1。
     * 3、如果是第二行且不是最后一行（大于1且小于h），在输出*号后，输出空格，以后每行多输出两个空格
     * 4、最后一行全部输出*号
     * 三：图示，5层空心等腰三角形
     *        *
     *       * *
     *      *   *
     *     *     *
     *    *********
     *
     * */

    //定义三角形的高度，改变此值，可改变三角形的大小，必须大于等于2
    public static final int HEIGHT = 9;

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int count = HEIGHT - 1;    //定义输出空格个数，初值为第一行要输出的空格个数

        System.out.println("空心等腰三角形，高度："+HEIGHT);

        for(int row = 1;row <= HEIGHT;row++,count--){

            //输出空格
            for(int i = 0;i < count;i++){
                System.out.print(" ");
            }
            System.out.print("*");

            //是第一行，则直接换行,最后一行输出全部*号，否则从第二行开始输出空格，每行+2
            if(row == 1){
                System.out.println();
            }else if(row == HEIGHT){
                for(int i = 0;i < row*2-2;i++){
                    System.out.print("*");
                }
                System.out.println();
            }else if(row > 1 && row < HEIGHT){
                for(int i = 0;i < row*2-3;i++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }


}