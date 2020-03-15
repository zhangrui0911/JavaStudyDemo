package com.zenroten.javales.class04.demo02;

import java.util.Scanner;

/**
 * @author Zr
 * @create 2020-03-11 23:09
 */
public class Test4 {
    public static void main(String[] args) {
        //算一个学生的平均分
        Scanner s = new Scanner(System.in);
        System.out.println("请输入科目数：");

        double[] scores = new double[s.nextInt()];//指定科目数

        for (int i = 0; i < scores.length; i++) {
            System.out.print("请输入第"+ (i + 1) +"门成绩：");
            scores[i] = s.nextDouble();

        }

        System.out.println("请选择操作：1.最高分，2.最低分，3.平均分：");
        switch (s.nextInt()) {
            case 1:
                double temp = scores[0];
                for (int i = 1; i < scores.length; i++) {
                    if(temp < scores[i]){
                        temp = scores[i];
                    }
                }
                System.out.println("最大成绩："+temp);
                break;

            case 2:
                double min = scores[0];
                for (int i = 1; i < scores.length; i++) {
                    if(min > scores[i]){
                        min = scores[i];
                    }
                }
                System.out.println("最低成绩："+min);
                break;

            case 3:
                double sum = 0.0;
                for (int i = 0; i < scores.length; i++) {
                    sum += scores[i];
                }

                double dev = sum/scores.length;
                System.out.println(dev);
                break;
            default:
                System.out.println("输入错误！");
        }
    }
}