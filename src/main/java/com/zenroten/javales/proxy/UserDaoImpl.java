package com.zenroten.javales.proxy;

import java.util.List;

/**
 * @author Zr
 * @create 2020-02-03 14:59
 *
 * 数据库读写操作，DAO层
 */
public class UserDaoImpl implements UserDao {

    @Override
    public boolean save(User user){
        System.out.println("保存用户：" + user.getName());
        return true;
    }

    @Override
    public List query() {
        System.out.println("查询操作");
        return null;
    }

    @Override
    public boolean delete() {
        System.out.println("删除操作");
        return false;
    }
}