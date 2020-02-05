package com.zenroten.javales.proxy;

import java.lang.reflect.Proxy;

/**
 * @author Zr
 * @create 2020-02-03 15:00
 *
 * 业务服务层
 * 基于接口来做时：接口命名以Service为后缀
 * 接口以实现命名以 ServiceImpl 为后缀
 */
public class UserService {
    public static void directCall(){
        User user1 = new User("张三", 20);
        new UserDaoImpl().save(user1);

        User user2 = new User("", 26);
        new UserDaoImpl().save(user2);

        User user3 = new User("张三", -1);
        new UserDaoImpl().save(user3);
    }

    public static void main(String[] args) {
        //直接调用
        //directCall();

        //1.静态代理
        //staticProxyCall();

        //2.动态代理
        //jdkProxyCall();

        //2.动态代理 - 被代理对象不是基于接口来实现的
        //jdkProxyCall2();

        //3. Cglib代理，因为它是通过子类的方式（创建被代理类的子类的方式）来实现的，因此也可以称为子类代理
        cglibProxyCall();

    }

    private static void cglibProxyCall() {
        //代理未实现接口的
        User user = new User("张三", -1);
        User2Dao user2Dao = new User2Dao();
        User2DaoCglibProxy cglibProxy = new User2DaoCglibProxy(user2Dao);
        User2Dao user2DaoProxy = (User2Dao)cglibProxy.getProxyInstance();
        user2DaoProxy.save(user);

        //代理实现接口的
        UserDao userDao = new UserDaoImpl();
        User2DaoCglibProxy cglib2 = new User2DaoCglibProxy(userDao);
        UserDao userDaoProxy = (UserDao)cglib2.getProxyInstance();
        userDaoProxy.save(user);
    }

    private static void jdkProxyCall2() {
        User user = new User("张三", -1);
        User2Dao user2Dao = new User2Dao();

        UserInvocationHandler handler = new UserInvocationHandler(user2Dao);

        User2Dao user2DaoHandler = (User2Dao)Proxy.newProxyInstance(
                user2Dao.getClass().getClassLoader(),
                user2Dao.getClass().getInterfaces(),
                handler
        );

        user2DaoHandler.save(user);

    }

    private static void jdkProxyCall() {
        User user1 = new User("张三", -1);
        UserDao userDao = new UserDaoImpl();

        //定义一个事件处理器，将被代理对象传到事件处理器中
        UserInvocationHandler handler = new UserInvocationHandler(userDao);

        //通过静态方法创建一个动态代理的实例
        UserDao userdaoProxy = (UserDao)Proxy.newProxyInstance(
            //代理类的类加载器
            userDao.getClass().getClassLoader(),
            //代理类实现了哪些接口
            userDao.getClass().getInterfaces(),
            //事件处理器
            handler
        );

        //此时代理类对象调用的save方法就是通过invoke方法调用的被代理类的save方法
        //当通过代理类对象调用方法时，会自动调用被代理类中同名的方法
        userdaoProxy.save(user1);

        userdaoProxy.delete();

        userdaoProxy.query();
    }

    private static void staticProxyCall() {
        User user1 = new User("张三", -20);
        UserDao userDao = new UserDaoImpl();
        UserDaoProxy proxy = new UserDaoProxy(userDao);
        proxy.save(user1);

    }
}