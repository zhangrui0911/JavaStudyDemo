package com.zenroten.javales.class07.demo2;

/**
 * @author Zr
 * @create 2020-03-14 20:44
 */
public class Test {
    public static void main(String[] args) {
        StudentMath s = new StudentMath();
        double result = s.scoreAvg(99, 81.5, 101, 60);//不定长参数，个数不确定，传多少个都可以
        System.out.println(result);


        StudentMath smh1 = new StudentMath();
        smh1.id = 1;
        StudentMath smh2 = smh1;//堆内存的地址赋值
        System.out.println(smh2.id);
        StudentMath smh3 = new StudentMath();
        Student student = new Student();
        student.scores = new double[]{99, 81.5, 101, 60};
        double avg = smh3.scoreAvg(student);
        System.out.println(smh3.id);
        System.out.println(avg);

    }
}