package com.zeroten.jc;

import org.testng.annotations.Test;

import java.util.Date;

/**
 * @author Zr
 * @create 2020-01-27 23:12
 */
public class EmployeeTest {

    @Test
    public void testPrint() {
        Employee yg1 = new Employee();
        yg1.setName("员工1");
        yg1.setHireDay(new Date());
        yg1.setSalary(100);
        yg1.printInfo();

        Manager jl1 = new Manager();
        jl1.setName("经理1");
        jl1.setHireDay(new Date());
        jl1.setSalary(120);
        jl1.setBonus(30);
        jl1.printInfo();
    }


    @Test
    public void testPrint2() {
        Employee yg1 = new Employee("员工1", new Date(), 200);
        yg1.printInfo();

        System.out.println("=========================");

        Manager jl1 = new Manager("经理1", new Date(), 120, 30);
        jl1.printInfo();

    }

    @Test
    public void testDuoTai() {
        Employee yg1 = new Employee("员工1", new Date(), 200);

        Manager jl1 = new Manager("经理1", new Date(), 120, 30);
        MasterManager zjl1 = new MasterManager("总经理1", new Date(), 120, 30);

        if(jl1 instanceof Employee){
            yg1 = jl1;
            yg1.printInfo();
        } else {
            System.out.println("jl1 不是一个Employee");
        }


        yg1 = zjl1;
        yg1.printInfo();
    }

    @Test
    public void testObjectMethod() {
        Employee employee = new Employee();
        //获取当前类名,getClass()返回的是对象指向的实际类型
        System.out.println(employee.getClass().getName());
        //只获取类名，不要前面的包名
        System.out.println(employee.getClass().getSimpleName());
        //获取hashcode
        System.out.println(employee.hashCode());
        //转成字符串，默认转换其hashcode值
        System.out.println(employee.toString());

        System.out.println("===============================");
        int[] arr = new int[0];
        //获取当前类名
        System.out.println(arr.getClass().getName());
        //只获取类名，不要前面的包名
        System.out.println(arr.getClass().getSimpleName());
        //获取hashcode
        System.out.println(arr.hashCode());
        //转成字符串，默认转换其hashcode值
        System.out.println(arr.toString());
        System.out.println("===================================");


        //动态绑定
        Employee employee2 = new Manager();
        //获取当前类名,getClass()返回的是对象指向的实际类型
        System.out.println(employee2.getClass().getName());
        //只获取类名，不要前面的包名
        System.out.println(employee2.getClass().getSimpleName());
        //获取hashcode
        System.out.println(employee2.hashCode());
        //转成字符串，默认转换其hashcode值
        System.out.println(employee2.toString());

        System.out.println("===============================");

    }
}