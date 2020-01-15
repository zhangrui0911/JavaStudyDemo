package com.zeroten.flow;

import org.testng.annotations.Test;

import java.util.Random;
import java.util.Scanner;

public class IfElseTest {

    @Test
    public void testIfElse() {

        int age = 6;
        if(age < 7){
            System.out.println(age + "岁，属于儿童");
        } else if(age < 18){
            System.out.println(age + "岁，属性少年");
        } else if(age < 41){
            System.out.println(age + "岁，属性青年");
        } else if(age < 60){
            System.out.println(age + "岁，属性中年");
        } else {
            System.out.println(age + "岁，属性老年");

        }
    }


    @Test
    public void testWhile(){
        //练习：随机生成一个0~1000范围内的整数，如果不能被30整除，则打印出数字，
        // 如果能被30整除则退出
        boolean notContinue = true;
        int times = 0;
        while(notContinue){
            int i = new Random().nextInt(3000);
            if((i % 30) == 0){
                notContinue = false;
                System.out.println("能被30整除的数：" + i);
            } else{
                System.out.println("不能被30整除的数：" + i + "继续");
                times++;
                //times += 1;
            }
        }
        System.out.println("随机产生了 " + times + "个不能被30整除的数");
    }


    @Test
    public void testDoWhile() {
        boolean notContinue = true;

        do {
            int i = new Random().nextInt(3000);
            if((i % 30) == 0){
                notContinue = false;
                System.out.println("能被30整除的数：" + i );
            }else {
                System.out.println("不能被30整除的数： " + i + "继续");
            }
        } while (notContinue);
    }

    @Test
    public void testFor() {

        //打印0~100范围内的奇数并计算范围内奇数的总个数
        int total = 0;
        for(int i = 0 ; i <= 100 ; i++){
            if(i % 2 != 0){
                total++;
            }
        }

        System.out.println("奇数总个数： "+ total);
    }

    @Test
    public void testSwitch() {
        //输入指令执行命令
        int i = 0;
        switch (i){
            case 1:
                System.out.println("扫地");
                break;

            case 2:
                System.out.println("开灯");
                break;

            case 3:
                System.out.println("关灯");
                break;

            case 4:
                System.out.println("播放音乐");
                break;

            case 5:
                System.out.println("关闭音乐");
                break;

            default:
                System.out.println("不能识别的指令");
        }
    }

    @Test
    public void testBreak() {

        while(true){

            int i = new Random().nextInt(3000);
            if(i % 30 == 0){
                System.out.println("被30整除：" + i);
                break;
            } else {
                System.out.println("不能被30整除： " + i + "继续");
            }
        }
    }


    //找出0~n2范围内除以 n1 余 7 的最大的数，找到则返回该数，如果找不到返回-1

    @Test
    public void testReturn() {
        int maxNumRem7 = this.getMaxNumRem7(17, 1000);
        System.out.println(maxNumRem7);

    }


    public int getMaxNumRem7(int n1, int n2){

        for(int n = n2; n >=0; n--){
            if(n % n1 == 7){
                return n;
            }
        }
        return -1;
    }

    //找出0~100范围内能被7整除的数，并计算它们累计相加的结果。

    @Test
    public void testContinue() {
        int total = 0;
        for (int i = 1 ; i < 100; i++) {
            if (i % 7 != 0) {
                continue;
            }
            total++;
            System.out.println(i + "能被7整除");
        }

        System.out.println("能被7整除，累计结果：" + total);
    }
}
