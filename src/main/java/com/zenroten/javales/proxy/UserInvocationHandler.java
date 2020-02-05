package com.zenroten.javales.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Zr
 * @create 2020-02-03 20:10
 */
//JDK 动态代理，事件处理器，实现 InvocationHandler 接口
public class UserInvocationHandler implements InvocationHandler {

    //需要使用被代理类的对象进行赋值
    public Object object;

    //声明一个带参的构造方法，将要被代理的类对象传进来
    public UserInvocationHandler(Object object){
        this.object = object;
    }


    /**
     *
     * @param proxy 代理类的对象，其实也就是返回的对象
     * @param method 代理类所调用的方法，调用代理类的对象的方法，也就是调用被代理类的方法
     * @param args 包含传入代理实例上方法调用的参数值的对象数组，如果接口方法不使用参数，则为 null。
     *             基本类型的参数被包装在适当基本包装器类
     *             （如 java.lang.Integer 或 java.lang.Boolean）的实例中。
     * @return
     * @throws Throwable
     * 当我们通过代理类的对象，调用方法a时，就会自动的调用如下的方法：invoke
     * 将被代理类要执行的方法a的功能就声明在invoke方法中
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始执行！");
        if(args != null && args.length == 1){
            if(args[0] instanceof User){
                System.out.println("参数1是 User");
                User user = (User)args[0];
                if (user.getName() == null || user.getName().trim().length() == 0) {
                    System.out.println("姓名为空，不保存");
                }

                if(user.getAge() == null || user.getAge() < 0){
                    System.out.println("年龄小于0，不保存");
                }
            }
        }
        //method：即为代理类对象调用的方法，此方法也就作为了被代理类对象要调用的方法
        //object：被代理类的对象
        Object result = method.invoke(object, args);
        System.out.println("执行结束！");

        //上述方法的返回值就做为invoke()的返回值
        return result;
    }
}