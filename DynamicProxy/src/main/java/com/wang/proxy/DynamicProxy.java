package com.wang.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/3/7 0007.
 */
public class DynamicProxy implements InvocationHandler {
    private Object subject;

    public DynamicProxy(Object subject) {
        this.subject = subject;
    }

    /**
     *
     * @param proxy  指代我们所代理的那个真实对象
     * @param method 指代的是我们所要调用真实对象的某个方法的Method对象
     * @param args   指代的是调用真实对象某个方法时接受的参数
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before rent money");
        System.out.println("Method is : " + method);
        method.invoke(subject, args);
        System.out.println("after rent money");
        return null;
    }
}
