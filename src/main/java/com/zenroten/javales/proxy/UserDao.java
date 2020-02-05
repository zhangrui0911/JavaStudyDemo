package com.zenroten.javales.proxy;

import java.util.List;

/**
 * @author Zr
 * @create 2020-02-03 15:26
 */
public interface UserDao {
    boolean save(User user);

    List query();

    boolean delete();
}
