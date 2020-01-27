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

        yg1 = jl1;
        yg1.printInfo();

        yg1 = zjl1;
        yg1.printInfo();
    }
}