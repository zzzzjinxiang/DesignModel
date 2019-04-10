package com.DesignModels.ProxyModel;

/**
 * 静态代理
 */
public class ProxySubject implements AbstractSubject {
    private AbstractSubject real;

    public ProxySubject(AbstractSubject real) {
        this.real = real;
    }

    @Override
    public void doSomething() {
        real.doSomething();
    }

    public void doOtherthing(){

    }
}
