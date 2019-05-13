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
        System.out.println("identity id");
        real.doSomething();
        System.out.println("Access identify");
    }

}
