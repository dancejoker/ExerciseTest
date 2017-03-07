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
     * @param proxy  ָ��������������Ǹ���ʵ����
     * @param method ָ������������Ҫ������ʵ�����ĳ��������Method����
     * @param args   ָ�����ǵ�����ʵ����ĳ������ʱ���ܵĲ���
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
