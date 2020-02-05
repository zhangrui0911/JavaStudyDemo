package com.zenroten.javales.proxy;

import java.util.List;

/**
 * @author Zr
 * @create 2020-02-03 15:20
 */
public class UserDaoProxy  implements UserDao {
    private UserDao target;

    public UserDaoProxy(UserDao userDao) {
        this.target = userDao;
    }

    @Override
    public boolean save(User user) {
        if(user.getName() == null || user.getName().trim().length() == 0){
            System.out.println("姓名为空，不保存");
            return false;
        }

        if(user.getAge() == null || user.getAge() < 0){
            System.out.println("年龄小于0，不保存");
            return false;
        }
        return target.save(user);
    }

    @Override
    public List query() {
        return null;
    }

    @Override
    public boolean delete() {
        return false;
    }
}