package com.zeroten.jc;

import java.util.Date;

/**
 * @author Zr
 * @create 2020-01-27 22:54
 */
public class Employee {

    private String name;
    private Date hireDay;
    private Integer salary;

    public Employee() {
        System.out.println("执行 Employee 无参的构造器");
    }
    public Employee(String name, Date hireDay, Integer salary) {
        System.out.println("执行 Employee 有参的构造器");
        this.name = name;
        this.hireDay = hireDay;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void printInfo(){

        StringBuilder temp = new StringBuilder();
        temp.append("姓名：");
        temp.append(getName());

        temp.append("入职时间：");
        temp.append(getHireDay());

        temp.append("薪水：");
        temp.append(getSalary());

        System.out.println(temp.toString());
    }
}