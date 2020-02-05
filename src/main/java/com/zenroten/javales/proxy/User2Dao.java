package com.zenroten.javales.proxy;

import java.util.List;

/**
 * @author Zr
 * @create 2020-02-03 15:26
 */
public class User2Dao {
    public boolean save(User user){
        System.out.println("保存用户2：" + user.getName() + ", " + user.getAge());
        return true;
    }
}
