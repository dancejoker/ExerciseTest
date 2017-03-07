package com.wang.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/3/7 0007.
 */
public class Client {
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        InvocationHandler handler = new DynamicProxy(realSubject);
        /**
         * public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
         * loader:һ��ClassLoader���󣬶��������ĸ�ClassLoader�����������ɵĴ��������м���
         * interfaces:һ��Interface��������飬��ʾ�����ҽ�Ҫ������Ҫ����Ķ����ṩһ��ʲô�ӿڣ�
         *       ������ṩ��һ��ӿڸ�������ô���������������ʵ���˸ýӿ�(��̬)��������
         *       ���ܵ�������ӿ��еķ�����
         * h:һ��InvocationHandler���󣬱�ʾ���ǵ��������̬��������ڵ��÷�����ʱ�򣬻��������
         *   һ��InvocationHandler������
         **/
        Subject subject = (Subject)Proxy.newProxyInstance(handler.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), handler);
        System.out.println(subject.getClass().getName());
        subject.rent();
        subject.helloworld();
    }
}
