package com.zenroten.javales.flow;

/**
 * @author Zr
 * @create 2020-01-15 12:52
 */
public class AgeCheck {

    public static String getAgeName(int age){
        if(age < 7){
            System.out.println(age + "岁，属于儿童");
            return "儿童";
        } else if(age < 18){
            System.out.println(age + "岁，属于少年");
            return "少年";
        } else if(age < 41){
            System.out.println(age + "岁，属于青年");
            return "青年";
        } else if(age < 60){
            System.out.println(age + "岁，属于中年");
            return "中年";
        } else {
            System.out.println(age + "岁，属于老年");
            return "老年";

        }

    }

}