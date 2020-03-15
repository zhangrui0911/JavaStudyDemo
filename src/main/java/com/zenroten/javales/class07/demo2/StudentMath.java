package com.zenroten.javales.class07.demo2;

/**
 * @author Zr
 * @create 2020-03-14 20:41
 */
public class StudentMath {
    int id;

    public double scoreAvg(double ... ds){
        //System.out.println(ds);//直接打印，打印出来的是地址
        double avg = 0;
        for (double d : ds) {
            avg += d;
        }

        avg = avg/ds.length;

        return avg;
    }

    //该方法传递的参数是引用数据类型
    public double scoreAvg(Student student){
        //两个判断null值，顺序不可以颠倒
        if (student != null && student.scores != null) {
            double avg = 0;
            for (double score : student.scores) {
                avg += score;
            }
            return avg / student.scores.length;
        }
        return -1;//该方法参数有问题
    }

}

