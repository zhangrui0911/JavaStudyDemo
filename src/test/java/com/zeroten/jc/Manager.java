package com.zeroten.jc;

import java.util.Date;

/**
 * @author Zr
 * @create 2020-01-27 22:58
 */
public class Manager extends Employee {
    private Integer bonus;

    public Manager() {
        System.out.println("执行 Manager 的无参数构造方法");
    }

    public Manager(String name, Date hireDay, Integer salary, Integer bonus) {
        /*setName(name);
        setHireDay(hireDay);
        setSalary(salary);*/
        super(name, hireDay, salary);
        this.bonus = bonus;

        System.out.println("执行 Manager 的有参数构造方法");
    }



    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    /**
     * 子类可以覆盖父类的方法，我们称之为复写或覆盖，
     * 可以使用 @Override 注解
     * @return
     */
    @Override
    public Integer getSalary(){
        if(bonus == null){
            return super.getSalary();
        }
        return super.getSalary() + bonus;
    }

}