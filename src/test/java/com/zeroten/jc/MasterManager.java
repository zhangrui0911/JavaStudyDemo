package com.zeroten.jc;

import java.util.Date;

/**
 * @author Zr
 * @create 2020-01-28 0:47
 */
public class MasterManager extends Manager {

    public MasterManager(String name, Date hireDay, Integer salary, Integer bonus) {
        super(name, hireDay, salary, bonus);
        System.out.println("MasterManager构造器");
    }

    @Override
    public String getName(){
        return "[" + super.getName() + "]";
    }
}