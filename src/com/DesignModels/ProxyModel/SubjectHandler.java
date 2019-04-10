package com.DesignModels.ProxyModel;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理，自己的调用处理器
 */
public class SubjectHandler implements InvocationHandler {
    AbstractSubject real;
    public SubjectHandler(AbstractSubject real) {
        this.real = real;
    }

    @Override
    public Object invoke(Object obj, Method method,Object[] args) throws Throwable{
        System.out.println("proxy 预处理");
        method.invoke(real,args);
        System.out.println("proxy finished");
        return null;

    }
}
