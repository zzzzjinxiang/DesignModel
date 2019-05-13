package com.DesignModels.ProxyModel;

import java.lang.reflect.Proxy;

public class Client{
    public static void main(String[] args){
        RealSubject realSubject = new RealSubject();
        SubjectHandler subjectHandler= new SubjectHandler(realSubject);
        AbstractSubject proxy = (AbstractSubject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader()
                ,new Class[]{AbstractSubject.class},subjectHandler);
        proxy.doSomething();
        System.out.println();
        AbstractSubject subject = new ProxySubject(realSubject);
        subject.doSomething();
    }
}
