package com.DesignModels.ProxyModel;

public class RealSubject implements AbstractSubject{
    @Override
    public void doSomething(){
        System.out.println("real thing");
    }
}
