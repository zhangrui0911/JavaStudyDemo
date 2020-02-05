package com.zenroten.javales.proxy;

/*import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;*/

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Zr
 * @create 2020-02-05 16:00
 */
public class User2DaoCglibProxy implements MethodInterceptor {

    //被代理对象的实例
    Object object;

    //
    public User2DaoCglibProxy(Object object){
        this.object = object;
    }


    public Object getProxyInstance(){
        //创建Enhancer 对象
        Enhancer en = new Enhancer();
        //设置其父类，通过子类继承的方式，新创建的代理类要继承自被代理类，也就是被代理对象
        en.setSuperclass(object.getClass());
        //设置回调，设置当前类为代理对象
        en.setCallback(this);
        //最终将
        return en.create();
    }

    /**
     * 当调用该代理方法时，会自动调用 intercept()方法
     * 在intercept()方法做一些逻辑处理
     *
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始执行");
        Object result = method.invoke(object, objects);
        System.out.println("执行结束");
        return result;
    }

}